from typing import Iterable,Callable

from .entity import Extension, Registry, Entity, Bitmask, Command, Enum, Structure


def filter_registry(registry: Registry) -> Registry:
    unsupported_entities = get_unsupported_entities(registry)

    filter_supported_entities = lambda entity: entity.name not in unsupported_entities and entity.is_vulkan_api()

    return Registry(
        bitmasks=iter2dict(filter(filter_supported_entities, map(filter_bitflags, registry.bitmasks.values()))),
        constants=iter2dict(filter(filter_supported_entities, registry.constants.values())),
        commands=iter2dict(filter(filter_supported_entities, map(filter_params, registry.commands.values()))),
        command_aliases=registry.command_aliases,
        enums=iter2dict(filter(filter_supported_entities, map(filter_variants, registry.enums.values()))),
        extensions=iter2dict(filter(is_extension_supported, registry.extensions.values())),
        functions=iter2dict(filter(filter_supported_entities, registry.functions.values())),
        handles=iter2dict(filter(filter_supported_entities, registry.handles.values())),
        structs=iter2dict(filter(filter_supported_entities, map(filter_members, registry.structs.values()))),
        unions=iter2dict(filter(filter_supported_entities, map(filter_members, registry.unions.values()))),
        versions=iter2dict(filter(filter_supported_entities, registry.versions.values()))
    )


def filter_bitflags(bitmask: Bitmask) -> Bitmask:
    bitflags = list(filter(lambda bitflag: bitflag.is_vulkan_api(), bitmask.bitflags))
    return Bitmask(bitmask.name, bitmask.api, bitflags, bitmask.bitwidth, bitmask.require_flagbits)


def filter_params(command: Command) -> Command:
    params = list(filter(lambda param: param.is_vulkan_api(), command.params))
    return Command(command.name, command.api, params, command.result, command.successcodes, command.errorcodes)


def filter_variants(enum: Enum) -> Enum:
    variants = list(filter(lambda variant: variant.is_vulkan_api(), enum.variants))
    return Enum(enum.name, enum.api, variants)


def filter_members(structure: Structure) -> Structure:
    members = list(filter(lambda member: member.is_vulkan_api(), structure.members))
    return Structure(structure.name, structure.api, members, structure.structextends)


UNSUPPORTED_EXTENSIONS: set[str] = {
    # TODO: these two extensions have two types defined in very weird manner
    'VK_NV_ray_tracing',
    'VK_NV_cooperative_matrix'
}


def get_unsupported_entities(registry: Registry) -> set[str]:
    print('  computing unsupported entities')
    ret: set[str] = set()

    unsupported_extensions: Iterable[Extension] = filter(
        lambda ext: not is_extension_supported(ext) or not ext.is_vulkan_api(),
        registry.extensions.values()
    )

    for extension in unsupported_extensions:
        for command in extension.require.commands:
            ret.add(command)
        for type_ in extension.require.types:
            print(f'    UNSUPPORTED {type_} BECAUSE unsupported extension {extension.name}')
            ret.add(type_)

    unsupported_extensions_set: set[str] = set(map(lambda x: x.name, unsupported_extensions))
    vulkan_versions, non_vulkan_versions = partition(registry.versions.values(), lambda ver: ver.is_vulkan_api())
    vulkan_entities: set[str] = set()

    for extension in registry.extensions.values():
        if extension.name not in unsupported_extensions_set:
            for type_ in extension.require.types:
                vulkan_entities.add(type_)

    for version in vulkan_versions:
        for command in version.require.commands:
            vulkan_entities.add(command)
        for type_ in version.require.types:
            vulkan_entities.add(type_)

    for version in non_vulkan_versions:
        for command in version.require.commands:
            if command not in vulkan_entities:
                ret.add(command)
        for type_ in version.require.types:
            if type_ not in vulkan_entities:
                print(f'    UNSUPPORTED {type_} BECAUSE non-vulkan version {version.name}')
                ret.add(type_)

    print('')
    return ret


def is_extension_supported(extension: Extension) -> bool:
    return extension.supported != 'disabled' and extension.name not in UNSUPPORTED_EXTENSIONS


def partition[T](iterable: Iterable[T], predicate: Callable[[T], bool]) -> tuple[list[T], list[T]]:
    a: list[T] = []
    b: list[T] = []

    for item in iterable:
        if predicate(item):
            a.append(item)
        else:
            b.append(item)

    return a, b


def iter2dict[T: Entity](iterable: Iterable[T]) -> dict[str, T]:
    return {entity.name: entity for entity in iterable}
