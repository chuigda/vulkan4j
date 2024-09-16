from __future__ import annotations

from collections.abc import Iterable
from dataclasses import dataclass
from enum import Enum as PythonEnum

from .ctype import CType, lower_type, CTYPE_VOID
from ..entity import Registry, Command
from ..vktype import IdentifierType


def generate_commands(registry: Registry):
    non_video_commands = list(filter(lambda command: 'video' not in command.name and 'Video' not in command.name, registry.commands.values()))

    static_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.STATIC, non_video_commands))

    entry_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.ENTRY, non_video_commands))
    instance_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.INSTANCE, non_video_commands))
    device_commands = list(filter(lambda command: get_command_type(registry, command) == CommandType.DEVICE, non_video_commands))

    generate_command_class_file(registry, static_commands, 'StaticCommands')


def generate_command_class_file(registry: Registry, commands: list[Command], class_name: str):
    param_types = []
    result_type = []

    command_descriptors = [generate_command_descriptor(registry, command, param_types, result_type) for command in commands]
    command_handles = [generate_command_handle(command) for command in commands]
    command_loads = [generate_command_load(registry, command) for command in commands]

    content = f'''package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.util.Function2;

public final class {class_name} {{
{'\n'.join(command_descriptors)}
{'\n'.join(command_handles)}

    public {class_name}(Function2<String, FunctionDescriptor, MethodHandle> loader) {{
{'\n'.join(command_loads)}
    }}
}}
'''

    with open(f'../src/main/java/tech/icey/vk4j/command/{class_name}.java', 'w') as file:
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

    param_type_layouts = map(lambda ctype: f'            {ctype.java_layout()}', param_types)

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


def generate_command_load(registry: Registry, command: Command) -> str:
    if get_command_type(registry, command) == CommandType.INSTANCE:
        return f'''        HANDLE${command.name} = instanceLoader.apply(\"{command.name}\", DESCRIPTOR${command.name});'''
    else:
        return f'''        HANDLE${command.name} = loader.apply(\"{command.name}\", DESCRIPTOR${command.name});'''


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
