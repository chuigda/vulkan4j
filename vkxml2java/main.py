from xml.dom.minidom import parse

from vkxml2java.codegen.enum import generate_enum
from vkxml2java.codegen.constant import generate_constants
from vkxml2java.codegen.bitmask import generate_bitmask
from vkxml2java.extract import extract_registry
from vkxml2java.filter import filter_registry
from vkxml2java.extend import extend_registry
from vkxml2java.ident import ident


def application_start():
    print('parsing xml')
    tree = parse('vk.xml')

    print('extracting registry')
    registry = extract_registry(tree)

    print('filtering registry')
    registry = filter_registry(registry)
    extend_registry(registry)

    # for struct in registry.structs.values():
    #     if struct.name.value.startswith('VkVideo'):
    #         break
    #
    #     source = generate_struct(registry, struct)
    #     with open(f'../src/main/java/tech/icey/vk4j/datatype/{struct.name}.java', 'w') as f:
    #         f.write(source)

    # for enum in registry.enums.values():
    #     source = generate_enum(enum)
    #     with open(f'../src/main/java/tech/icey/vk4j/enumtype/{enum.name}.java', 'w') as f:
    #         f.write(source)

    print('generating bitmasks')
    for bitmask in registry.bitmasks.values():
        if 'FlagBits' in bitmask.name.value:
            continue

        source = generate_bitmask(registry, bitmask)
        with open(f'../src/main/java/tech/icey/vk4j/bitmask/{bitmask.name}.java', 'w') as f:
            print(f'  generating {bitmask.name}')
            f.write(source)

    with open(f'../src/main/java/tech/icey/vk4j/Constants.java', 'w') as f:
        f.write(generate_constants(registry, registry.constants.values()))


if __name__ == '__main__':
    application_start()
