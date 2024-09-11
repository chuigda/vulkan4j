from xml.dom.minidom import parse

from vkxml2java.codegen.struct import generate_struct
from vkxml2java.codegen.constant import generate_constants
from vkxml2java.extract import extract_registry
from vkxml2java.filter import filter_registry
from vkxml2java.extend import extend_registry


def application_start():
    tree = parse('vk.xml')
    registry = extract_registry(tree)

    registry = filter_registry(registry)
    extend_registry(registry)

    for struct in registry.structs.values():
        if struct.name.value.startswith('VkVideo'):
            break

        source = generate_struct(registry, struct)
        with open(f'../src/main/java/tech/icey/vk4j/struct/{struct.name}.java', 'w') as f:
            f.write(source)

    with open(f'../src/main/java/tech/icey/vk4j/Constants.java', 'w') as f:
        f.write(generate_constants(registry, registry.constants.values()))

if __name__ == '__main__':
    application_start()
