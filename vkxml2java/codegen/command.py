from dataclasses import dataclass
from enum import Enum as PythonEnum

from ..entity import Registry, Command
from ..vktype import IdentifierType


@dataclass
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
