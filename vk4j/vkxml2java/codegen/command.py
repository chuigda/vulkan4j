from __future__ import annotations
from enum import Enum as PythonEnum

from .ctype import *
from ..entity import Registry, Command, Param
from ..vktype import IdentifierType


def generate_commands(registry: Registry):
    non_video_commands = list(filter(lambda command: 'video' not in command.name and 'Video' not in command.name, registry.commands.values()))

    static_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.STATIC, non_video_commands))
    entry_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.ENTRY, non_video_commands))
    instance_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.INSTANCE, non_video_commands))
    device_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.DEVICE, non_video_commands))

    generate_command_class_file(registry, static_commands, 'StaticCommands')
    generate_command_class_file(registry, entry_commands, 'EntryCommands')
    generate_command_class_file(registry, instance_commands, 'InstanceCommands')
    generate_command_class_file(registry, device_commands, 'DeviceCommands', dual_loader=True)


def generate_command_class_file(registry: Registry, commands: list[Command], class_name: str, dual_loader: bool = False):
    command_param_types: list[list[CType]] = []
    command_result_types: list[CType] = []

    command_descriptors = []
    for command in commands:
        param_types = []
        result_type = []
        command_descriptors.append(generate_command_descriptor(registry, command, param_types, result_type))
        command_param_types.append(param_types)
        command_result_types.append(result_type[0])

    command_handles = [generate_command_handle(command) for command in commands]
    command_loads = [generate_command_load(registry, command, dual_loader) for command in commands]

    command_wrappers = []
    for command, param_types, result_type in zip(commands, command_param_types, command_result_types):
        command_wrappers.append(generate_command_wrapper(command, param_types, result_type))

    content = f'''package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.util.FunctionLoader;

public final class {class_name} {{
{'\n'.join(command_descriptors)}
{'\n'.join(command_handles)}

    public {class_name}(FunctionLoader loader{', FunctionLoader instanceLoader' if dual_loader else ''}) {{
{'\n'.join(command_loads)}
    }}

{'\n'.join(command_wrappers)}}}
'''

    with open(f'../src/main/java/tech/icey/vk4j/command/{class_name}.java', 'w') as file:
        print(f'    generating {class_name}.java')
        file.write(content)


def generate_command_descriptor(
        registry: Registry,
        command: Command,
        param_types: list[CType],
        result_type: list[CType]
) -> str:
    result_type.clear()
    result_type.append(lower_type(registry, command.result))

    param_types.clear()
    for param in command.params:
        param_types.append(lower_type(registry, param.type))

    param_type_layouts = map(lambda ctype: f'            {ctype.java_param_layout()}', param_types)

    if result_type[0] == CTYPE_VOID:
        return f'''    public static final FunctionDescriptor DESCRIPTOR${command.name} = FunctionDescriptor.ofVoid(
{',\n'.join(param_type_layouts)}
    );\n'''
    else:
        return f'''    public static final FunctionDescriptor DESCRIPTOR${command.name} = FunctionDescriptor.of(
            {result_type[0].java_layout()},
{',\n'.join(param_type_layouts)}
    );\n'''


def generate_command_handle(command: Command) -> str:
    return f'''    public final @nullable MethodHandle HANDLE${command.name};'''


def generate_command_load(registry: Registry, command: Command, dual_loader: bool) -> str:
    if dual_loader:
        if get_command_type(registry, command) == CommandType.INSTANCE:
            return f'''        HANDLE${command.name} = instanceLoader.apply(\"{command.name}\", DESCRIPTOR${command.name});'''
        else:
            return f'''        HANDLE${command.name} = loader.apply(\"{command.name}\", DESCRIPTOR${command.name});'''
    else:
        return f'''        HANDLE${command.name} = loader.apply(\"{command.name}\", DESCRIPTOR${command.name});'''


def generate_command_wrapper(command: Command, param_types: list[CType], result_type: CType) -> str:
    params = []
    for (param_type, param) in zip(param_types, command.params):
        params.append(f'{generate_input_output_type(param_type, param.optional)} {param.name}')
    # param_names = list(map(lambda p: p.name, command.params))

    invoke_args = []
    for (param_type, param) in zip(param_types, command.params):
        invoke_args.append(generate_input_convert(param_type, param))

    invoke_expr = f'''HANDLE${command.name}.invokeExact(
                    {",\n                    ".join(invoke_args)}
            )'''

    if result_type == CTYPE_VOID:
        return f'''    public void {command.name}(
            {',\n            '.join(params)}
    ) {{
        try {{
            {invoke_expr};
        }} catch (Throwable t) {{
            throw new RuntimeException(t);
        }}
    }}\n'''
    else:
        return f'''    public {generate_input_output_type(result_type, False)} {command.name}(
            {',\n            '.join(params)}
    ) {{
        try {{
{generate_result_convert(result_type, invoke_expr)}
        }} catch (Throwable t) {{
            throw new RuntimeException(t);
        }}
    }}\n'''


def generate_input_output_type(type_: CType, optional: bool) -> str:
    nullable_prefix = '@nullable ' if optional else ''

    if isinstance(type_, CPointerType):
        if isinstance(type_.pointee, CNonRefType):
            return f'{nullable_prefix} {type_.pointee.vk4j_ptr_type()}'
        elif isinstance(type_.pointee, CStructType) \
                or isinstance(type_.pointee, CUnionType):
            return f'{nullable_prefix}@pointer(target={type_.pointee.java_type()}.class) {type_.pointee.java_type()}'
        elif isinstance(type_.pointee, CHandleType):
            return f'{nullable_prefix}@pointer(target={type_.pointee.java_type()}.class) {type_.pointee.java_type()}.Buffer'
        else:
            return type_.java_type()
    elif isinstance(type_, CHandleType):
        return f'{nullable_prefix}{type_.java_type()}'
    elif isinstance(type_, CArrayType):
        flattened = flatten_array(type_)
        if isinstance(flattened.element, CNonRefType):
            return flattened.element.vk4j_array_type()
        elif isinstance(flattened.element, CEnumType):
            return flattened.element.vk4j_array_type()
        else:
            return f'{flattened.element.java_type()}[]'
    else:
        return type_.java_type()


def generate_input_convert(type_: CType, param: Param):
    if isinstance(type_, CPointerType):
        if isinstance(type_.pointee, CNonRefType) \
                or isinstance(type_.pointee, CStructType) \
                or isinstance(type_.pointee, CUnionType):
            if param.optional:
                # see https://stackoverflow.com/a/79021315/14312575, type casting is required
                return f'(MemorySegment) ({param.name} != null ? {param.name}.segment() : MemorySegment.NULL)'
            else:
                return f'{param.name}.segment()'
        elif isinstance(type_.pointee, CHandleType):
            if param.optional:
                return f'(MemorySegment) ({param.name} != null ? {param.name}.segment() : MemorySegment.NULL)'
            else:
                return f'{param.name}.segment()'

    if isinstance(type_, CHandleType):
        if param.optional:
            return f'(MemorySegment) ({param.name} != null ? {param.name}.segment() : MemorySegment.NULL)'
        else:
            return f'{param.name}.segment()'

    if isinstance(type_, CStructType) or isinstance(type_, CUnionType):
        return f'{param.name}.segment()'

    if isinstance(type_, CArrayType):
        flattened = flatten_array(type_)
        if isinstance(flattened.element, CNonRefType) or isinstance(flattened.element, CEnumType):
            return f'{param.name}.segment()'
        else:
            return f'{param.name} != null && {param.name}.length != 0 ? {param.name}[0].segment() : MemorySegment.NULL'

    return param.name


def generate_result_convert(result_type: CType, fncall: str) -> str:
    if isinstance(result_type, CPointerType):
        if isinstance(result_type.pointee, CNonRefType):
            return f'''            MemorySegment s = (MemorySegment) {fncall};
            return s.address() == 0 ? null : new {result_type.pointee.vk4j_ptr_type()}(s);'''
        elif isinstance(result_type.pointee, CStructType) or isinstance(result_type.pointee, CUnionType):
            return f'''            MemorySegment s = (MemorySegment) {fncall};
            return s.address() == 0 ? null : new {result_type.pointee.java_type()}(s);'''
        else:
            return f'            return (MemorySegment) {fncall};'
    elif isinstance(result_type, CHandleType):
        return f'''            MemorySegment s = (MemorySegment) {fncall};
            return s.address() == 0 ? null : new {result_type.java_type()}(s);'''
    elif isinstance(result_type, CEnumType):
        return f'            return ({result_type.java_type_no_annotation()}) {fncall};'
    elif isinstance(result_type, CArrayType):
        array_type = flatten_array(result_type)
        if isinstance(array_type.element, CNonRefType):
            raise NotImplementedError()
        else:
            raise NotImplementedError()
    elif isinstance(result_type, CNonRefType):
        return f'            return ({result_type.java_type_no_sign()}) {fncall};'
    elif isinstance(result_type, CStructType) or isinstance(result_type, CUnionType):
        return f'            return new {result_type.name}((MemorySegment) {fncall});'
    else:
        raise ValueError(f'Unsupported result type: {result_type}')


class CommandType(PythonEnum):
    STATIC = 'static'
    ENTRY = 'entry'
    INSTANCE = 'instance'
    DEVICE = 'device'


def command_type(s: str) -> CommandType | None:
    s = s.lower()
    if s == 'static':
        return CommandType.STATIC
    elif s == 'entry':
        return CommandType.ENTRY
    elif s == 'instance':
        return CommandType.INSTANCE
    elif s == 'device':
        return CommandType.DEVICE
    else:
        return None


STATIC_COMMANDS: set[str] = {'vkGetInstanceProcAddr', 'vkGetDeviceProcAddr'}
ENTRY_COMMANDS: set[str] = {'vkCreateInstance', 'vkEnumerateInstanceExtensionProperties', 'vkEnumerateInstanceLayerProperties', 'vkEnumerateInstanceVersion'}
INSTANCE_COMMANDS: set[str] = {'vkCreateDevice'}

EXTENSION_COMMAND_TYPES: dict[str, CommandType | None] | None = None


def get_command_type(registry: Registry, command: Command) -> CommandType:
    global EXTENSION_COMMAND_TYPES

    if command.name in STATIC_COMMANDS:
        return CommandType.STATIC
    elif command.name in ENTRY_COMMANDS:
        return CommandType.ENTRY
    elif command.name in INSTANCE_COMMANDS:
        return CommandType.INSTANCE
    else:
        if EXTENSION_COMMAND_TYPES is None:
            EXTENSION_COMMAND_TYPES = imp_get_extension_command_types(registry)
        if command.name in EXTENSION_COMMAND_TYPES:
            return EXTENSION_COMMAND_TYPES[command.name]

        if len(command.params) > 0:
            first_type = command.params[0].type
            if isinstance(first_type, IdentifierType):
                first_type_str = first_type.ident
                if first_type_str in {'VkCommandBuffer', 'VkDevice', 'VkQueue'}:
                    return CommandType.DEVICE

        return CommandType.INSTANCE


def imp_get_extension_command_types(registry: Registry) -> dict[str, CommandType | None]:
    ret = dict()
    for extension in registry.extensions.values():
        extension_command_type = command_type(extension.type)
        for command in extension.require.commands:
            ret[command] = extension_command_type
    return ret
