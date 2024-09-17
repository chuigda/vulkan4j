from xml.dom.minidom import parse

from vkxml2java.codegen.command import generate_commands
from vkxml2java.codegen.enum import generate_enum
from vkxml2java.codegen.constant import generate_constants
from vkxml2java.codegen.bitmask import generate_bitmask
from vkxml2java.codegen.handle import generate_handle
from vkxml2java.codegen.structure import generate_structure
from vkxml2java.extract import extract_registry
from vkxml2java.filter import filter_registry
from vkxml2java.extend import extend_registry


def application_start():
    print('parsing xml')
    tree = parse('vk.xml')

    print('extracting registry')
    unfiltered_registry = extract_registry(tree)

    print('filtering registry')
    registry = filter_registry(unfiltered_registry)

    extend_registry(registry)

    print('generating constants')
    with open(f'../src/main/java/tech/icey/vk4j/Constants.java', 'w') as f:
        f.write(generate_constants(registry, registry.constants.values()))

    print('generating structs')
    for struct in registry.structs.values():
        if 'Video' in struct.name:
            print(f'    skipping {struct.name}')
            continue
        print(f'    generating {struct.name}')
        source = generate_structure(registry, struct)
        with open(f'../src/main/java/tech/icey/vk4j/datatype/{struct.name}.java', 'w') as f:
            f.write(source)

    print('generating unions')
    for union in registry.unions.values():
        if 'Video' in union.name:
            print(f'    skipping {union.name}')
            continue

        print(f'    generating {union.name}')
        source = generate_structure(registry, union)
        with open(f'../src/main/java/tech/icey/vk4j/datatype/{union.name}.java', 'w') as f:
            f.write(source)

    print('generating bitmasks')
    for bitmask in registry.bitmasks.values():
        if 'FlagBits' in bitmask.name:
            continue

        source = generate_bitmask(registry, bitmask)
        with open(f'../src/main/java/tech/icey/vk4j/bitmask/{bitmask.name}.java', 'w') as f:
            print(f'  generating {bitmask.name}')
            f.write(source)

    print('generating enum types')
    for enum in registry.enums.values():
        source = generate_enum(enum)
        with open(f'../src/main/java/tech/icey/vk4j/enumtype/{enum.name}.java', 'w') as f:
            print(f'  generating {enum.name}')
            f.write(source)

    print('generating handles')
    for handle in registry.handles.values():
        source = generate_handle(handle)
        print(f'  generating {handle.name}')
        with open(f'../src/main/java/tech/icey/vk4j/handle/{handle.name}.java', 'w') as f:
            f.write(source)

    print('generating commands')
    generate_commands(registry)


if __name__ == '__main__':
    application_start()
