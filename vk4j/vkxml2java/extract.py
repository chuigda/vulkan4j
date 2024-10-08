import re
from typing import Pattern
from xml.dom.minidom import Element, Node, Document

from .entity import *
from .vktype import *


def extract_registry(tree: Document) -> Registry:
    type_nodes = tree.getElementsByTagName('types')[0].getElementsByTagName('type')
    enums_nodes = tree.getElementsByTagName('enums')

    aliases: dict[str, Typedef] = {}
    for type_node in type_nodes:
        if 'alias' not in type_node.attributes or 'name' not in type_node.attributes:
            continue
        alias = extract_typedef(type_node)
        aliases[alias.name] = alias

    bitmasks: dict[str, Bitmask] = {}
    for bitmask_node in enums_nodes:
        if bitmask_node.hasAttribute('type') and bitmask_node.getAttribute('type') == 'bitmask':
            bitmask = extract_bitmask(bitmask_node)
            bitmasks[bitmask.name] = bitmask

    for bitmask_type_node in type_nodes:
        if ('category' in bitmask_type_node.attributes
                and bitmask_type_node.getAttribute('category') == 'bitmask'
                and 'alias' not in bitmask_type_node.attributes):
            bitmask = extract_bitmask_type(bitmask_type_node)
            if bitmask.name not in bitmasks:
                bitmasks[bitmask.name] = bitmask

    command_nodes = tree.getElementsByTagName('commands')[0].getElementsByTagName('command')
    commands: dict[str, Command] = {}
    for command_node in command_nodes:
        if command_node.hasAttribute('alias'):
            continue

        if command_node.hasAttribute('api') and command_node.getAttribute('api') != 'vulkan':
            continue

        command = extract_command(command_node)
        commands[command.name] = command

    command_aliases: dict[str, str] = {}
    for command_node in command_nodes:
        if command_node.hasAttribute('alias'):
            command_alias = extract_command_alias(command_node)
            if command_alias.alias not in commands:
                raise f'missing aliased command: {command_alias.alias}'

            command_aliases[command_alias.name] = command_alias.alias

    constants: dict[str, Constant] = {}
    for enums_node in enums_nodes:
        if 'name' in enums_node.attributes and enums_node.getAttribute('name') == 'API Constants':
            for constant_node in enums_node.getElementsByTagName('enum'):
                if 'alias' in constant_node.attributes:
                    continue

                constant = extract_constant(constant_node)
                constants[constant.name] = constant

    enums: dict[str, Enum] = {}
    for enums_node in enums_nodes:
        if 'type' in enums_node.attributes and enums_node.getAttribute('type') == 'enum':
            enum = extract_enum(enums_node)
            enums[enum.name] = enum

    extensions: dict[str, Extension] = {}
    for extension_node in tree.getElementsByTagName('extensions')[0].getElementsByTagName('extension'):
        extension = extract_extension(extension_node)
        extensions[extension.name] = extension

    extension_names: dict[str, str] = {}
    for extension_node in tree.getElementsByTagName('extensions')[0].getElementsByTagName('extension'):
        require_nodes = findall(extension_node, 'require')
        for require_node in require_nodes:
            has_found_extension_name = False
            for enum_node in findall(require_node, 'enum'):
                if get_attr(enum_node, 'name').endswith('_EXTENSION_NAME'):
                    name = get_attr(enum_node, 'name')
                    value = get_attr(enum_node, 'value')
                    extension_names[name] = value
                    has_found_extension_name = True
                    break
            if has_found_extension_name:
                break

    functions: dict[str, Function] = {}
    for function_node in type_nodes:
        if ('category' in function_node.attributes
                and function_node.getAttribute('category') == 'funcpointer'
                and 'alias' not in function_node.attributes):
            function = extract_function(function_node)
            functions[function.name] = function

    handles: dict[str, Handle] = {}
    for handle_node in type_nodes:
        if ('category' in handle_node.attributes
                and handle_node.getAttribute('category') == 'handle'
                and 'alias' not in handle_node.attributes):
            handle = extract_handle(handle_node)
            handles[handle.name] = handle

    structs: dict[str, Structure] = {}
    unions: dict[str, Structure] = {}

    for structure_node in type_nodes:
        if 'alias' in structure_node.attributes:
            continue

        if 'category' not in structure_node.attributes:
            continue

        if structure_node.getAttribute('category') == 'struct':
            structure = extract_structure(structure_node)
            structs[structure.name] = structure
        elif structure_node.getAttribute('category') == 'union':
            structure = extract_structure(structure_node)
            structure.is_union = True
            unions[structure.name] = structure

    versions: dict[str, Version] = {}
    for version_node in tree.getElementsByTagName('feature'):
        if 'api' in version_node.attributes:
            version = extract_version(version_node)
            versions[version.name] = version

    return Registry(
        aliases,
        bitmasks,
        constants,
        extension_names,
        commands,
        command_aliases,
        enums,
        extensions,
        functions,
        handles,
        structs,
        unions,
        versions
    )


def extract_typedef(e: Element) -> Typedef:
    name = get_attr(e, 'name')
    api = get_attr(e, 'api')
    type_ = IdentifierType(get_attr(e, 'alias'))

    return Typedef(name, api, type_)


def extract_bitmask(e: Element) -> Bitmask:
    name = get_attr(e, 'name')
    api = None
    bitflags = list(map(extract_bitflag, filter(lambda it: 'alias' not in it.attributes, e.getElementsByTagName('enum'))))
    bitwidth_str = get_attr(e, 'bitwidth')
    bitwidth = int(bitwidth_str, 0) if bitwidth_str is not None else None

    return Bitmask(name, api, bitflags, bitwidth, None)


def extract_bitmask_type(e: Element) -> Bitmask:
    name = get_element_text(find(e, 'name'))
    api = get_attr(e, 'api')

    # TODO: XML attribute "requires" and "bitvalues" seems to be used interchangeably, but we want to double check on this
    if 'requires' in e.attributes:
        require_flagbits = e.getAttribute('requires')
    elif 'bitvalues' in e.attributes:
        require_flagbits = e.getAttribute('bitvalues')
    else:
        require_flagbits = None

    return Bitmask(name, api, bitflags=[], bitwidth=None, require_flagbits=require_flagbits)


def extract_bitflag(e: Element) -> Bitflag:
    name = get_attr(e, 'name')
    api = None
    if e.hasAttribute('bitpos'):
        bitpos = int(e.getAttribute('bitpos'), 0)
        value = 1 << bitpos
    else:
        value = int(get_attr(e, 'value'), 0)

    return Bitflag(name, api, value)


def extract_command(e: Element) -> Command:
    proto = find(e, 'proto')

    name = get_element_text(find(proto, 'name'))
    api = get_attr(e, 'api')
    params = list(filter(lambda x: x is not None, map(extract_param, findall(e, 'param'))))
    postprocess_optional_params(params)
    result = extract_type(find(proto, 'type'))

    if e.hasAttribute('successcodes'):
        successcodes = list(get_attr(e, 'successcodes').split(','))
    else:
        successcodes = []

    if e.hasAttribute('errorcodes'):
        errorcodes = list(get_attr(e, 'errorcodes').split(','))
    else:
        errorcodes = []

    return Command(name, api, params, result, successcodes, errorcodes)


def extract_param(e: Element) -> Param | None:
    if e.parentNode.tagName == 'implicitexternsyncparams':
        return None

    name = get_element_text(find(e, 'name'))
    api = get_attr(e, 'api')
    type_ = extract_type(find(e, 'type'))

    if e.hasAttribute('len'):
        len_ = e.getAttribute('len')
        arglen = list(e.getAttribute('len').split('->'))
    else:
        len_ = None
        arglen = None

    optional = e.getAttribute('optional').startswith('true') if e.hasAttribute('optional') else False

    return Param(name, api, type_, len_, arglen, optional)


def postprocess_optional_params(param_list: list[Param]):
    for param in param_list:
        if param.len is not None:
            has_optional_len = False
            for tmp in param_list:
                if tmp is not param and tmp.name == param.len and tmp.optional:
                    has_optional_len = True
                    break
            if has_optional_len:
                param.optional = True


def extract_command_alias(e: Element) -> CommandAlias:
    name = get_attr(e, 'name')
    alias = get_attr(e, 'alias')

    return CommandAlias(name=name, api=None, alias=alias)


def extract_constant(e: Element) -> Constant:
    name_str = get_attr(e, 'name')
    value_str = get_attr(e, 'value')

    if name_str in ['VK_TRUE', 'VK_FALSE']:
        type_str = 'uint32_t'
    elif name_str != 'WHOLE_SIZE' and (name_str.startswith('VK_MAX') or name_str.endswith('SIZE')):
        type_str = 'size_t'
    elif 'ULL' in value_str:
        type_str = 'uint64_t'
    elif 'U' in value_str:
        type_str = 'uint32_t'
    elif 'f' in value_str or 'F' in value_str:
        type_str = 'float'
    else:
        type_str = 'int32_t'

    name = name_str
    api = get_attr(e, 'api')

    return Constant(name, api, IdentifierType(type_str), value_str)


def extract_enum(e: Element) -> Enum:
    name = get_attr(e, 'name')
    api = get_attr(e, 'api')
    variants = list(
        map(
            extract_variant,
            filter(lambda it: 'alias' not in it.attributes, findall(e, 'enum'))
        )
    )

    return Enum(name, api, variants)


def extract_variant(e: Element) -> Variant:
    name = get_attr(e, 'name')
    api = get_attr(e, 'api')
    value = int(get_attr(e, 'value'), 0)

    return Variant(name, api, value)


def extract_type(e: Element) -> Type:
    def is_potential_array_declarator_node(node: Node) -> bool:
        if node.nodeType == Node.TEXT_NODE:
            t = node.nodeValue.strip()
            return t.startswith('[') and t.endswith(']')
        elif node.nodeType == Node.ELEMENT_NODE:
            return node.tagName == 'enum'
        else:
            return False

    def map_array_length_part(part: str) -> [str]:
        if part.startswith('[') and part.endswith(']'):
            return part[1:-1].split('][')
        else:
            return [part]

    identifier = get_element_text(e)

    parent: Element | None = e.parentNode
    if parent is not None:
        length_texts: list[str] = list(
            map(
                str.strip,
                map(
                    text_content,
                    filter(is_potential_array_declarator_node, parent.childNodes)
                )
            )
        )

        if len(length_texts) != 0:
            lengths: list[str] = list(reversed(sum(map(map_array_length_part, length_texts), [])))
            array_type = ArrayType(IdentifierType(identifier), lengths[0])
            for length in lengths[1:]:
                array_type = ArrayType(array_type, length)
            return array_type

    next_node = text_content(e.nextSibling).strip()
    if next_node.startswith('*'):
        const = 'const' in (text_content(e.previousSibling) if e.previousSibling is not None else '')
        pointer_type = PointerType(IdentifierType(identifier), const)
        if next_node.startswith('* const*'):
            return PointerType(pointer_type, True)
        elif next_node.startswith('**'):
            return PointerType(pointer_type, const)
        else:
            return pointer_type

    return IdentifierType(identifier)


def extract_extension(e: Element) -> Extension:
    name = get_attr(e, 'name')
    api = get_attr(e, 'api')

    number = int(get_attr(e, 'number'), 0)
    type_ = get_attr(e, 'type')
    author = get_attr(e, 'author')
    contact = get_attr(e, 'contact')
    platform = get_attr(e, 'platform')
    requires = get_attr(e, 'requires')
    requires_core = get_attr(e, 'requiresCore')
    deprecatedby = get_attr(e, 'deprecatedby')
    obsoletedby = get_attr(e, 'obsoletedby')
    promotedto = get_attr(e, 'promotedto')
    supported = get_attr(e, 'supported')
    provisional = get_attr(e, 'provisional') == 'true'
    require = extract_require(findall(e, 'require'))

    return Extension(
        name, api, number, type_, author, contact, platform, requires, requires_core, deprecatedby, obsoletedby,
        promotedto, supported, provisional, require
    )


def extract_require(elements: list[Element]) -> Require:
    commands: set[str] = set()
    types: set[str] = set()
    values: list[RequireValue] = []

    for e in elements:
        for command_node in findall(e, 'command'):
            commands.add(get_attr(command_node, 'name'))
        for type_node in findall(e, 'type'):
            types.add(get_attr(type_node, 'name'))
        for value_node in findall(e, 'enum'):
            require_value = extract_require_value(value_node)
            if require_value is not None:
                values.append(require_value)

    return Require(commands, types, values)


def extract_require_value(e: Element) -> RequireValue | None:
    if 'alias' in e.attributes:
        return None

    value_str: str | None = get_attr(e, 'value')
    if value_str is not None and value_str.startswith('"'):
        return None

    name = get_attr(e, 'name')
    api = get_attr(e, 'api')
    extends = get_attr(e, 'extends')
    value = int(value_str, 0) if value_str is not None else None
    bitpos = int(get_attr(e, 'bitpos')) if 'bitpos' in e.attributes else None
    extnumber = int(get_attr(e, 'extnumber')) if 'extnumber' in e.attributes else None
    offset = int(get_attr(e, 'offset')) if 'offset' in e.attributes else None
    negative = get_attr(e, 'dir') == '-'

    return RequireValue(name, api, extends, value, bitpos, extnumber, offset, negative)


def extract_function(e: Element) -> Function:
    name = get_element_text(find(e, 'name'))
    api = get_attr(e, 'api')
    params = list(map(extract_param, findall(e, 'param')))

    text = text_content(e)
    type_str = text[8:text.index('(VKAPI_PTR')].strip()
    result: Type | None
    if type_str == 'void':
        result = None
    elif type_str == 'void*':
        result = PointerType(IdentifierType('void'), False)
    elif type_str == 'VkBool32':
        result = IdentifierType('VkBool32')
    elif type_str == 'PFN_vkVoidFunction':
        result = IdentifierType('PFN_vkVoidFunction')
    else:
        raise Exception(f'unsupported function pointer result type: {type_str}')

    return Function(name, api, params, result)


def extract_handle(e: Element) -> Handle:
    name = get_element_text(find(e, 'name'))
    api = get_attr(e, 'api')
    dispatchable = 'NON_DISPATCHABLE' not in get_element_text(find(e, 'type'))

    return Handle(name, api, dispatchable)


def extract_structure(e: Element) -> Structure:
    name = get_attr(e, 'name')
    api = get_attr(e, 'api')
    member_nodes = findall(e, 'member')
    verbatim = list(map(extract_member_verbatim, member_nodes))
    members = list(map(extract_member, member_nodes))
    structextends = list(
        get_attr(e, 'structextends').split(',')
    ) if 'structextends' in e.attributes else []

    return Structure(name, api, verbatim, members, structextends)


def extract_member_verbatim(e: Element) -> str:
    tmp = ''
    for child in e.childNodes:
        if child.nodeType == Node.ELEMENT_NODE:
            if child.tagName == 'comment':
                continue
        tmp += text_content(child, strip=False)

    ret = ''
    had_whitespace = False
    for c in tmp.strip():
        if c == ' ':
            if not had_whitespace:
                ret += c
                had_whitespace = True
        else:
            ret += c
            had_whitespace = False

    return ret


BITS_REGEX: Pattern = re.compile(r':(\d+)$')


def extract_member(e: Element) -> Member:
    name = get_element_text(find(e, 'name'))
    api = get_attr(e, 'api')
    type_ = extract_type(find(e, 'type'))
    values = get_attr(e, 'values') if 'values' in e.attributes else None
    len_ = list(get_attr(e, 'len').split(',')) if 'len' in e.attributes else []
    altlen = get_attr(e, 'altlen')
    optional = get_attr(e, 'optional') == 'true'

    bits_str: list[str] = BITS_REGEX.findall(text_content(e))
    if len(bits_str) != 0:
        bits = int(bits_str[0])
    else:
        bits = None

    return Member(name, api, type_, values, len_, altlen, optional, bits)


def extract_version(e: Element) -> Version:
    name = get_attr(e, 'name')
    api = get_attr(e, 'api')

    number = float(get_attr(e, 'number'))
    require = extract_require(findall(e, 'require'))

    return Version(name, api, number, require)


def get_attr(e: Element, attr_name: str) -> str | None:
    return e.getAttribute(attr_name) if e.hasAttribute(attr_name) else None


def get_element_text(e: Element) -> str:
    assert len(e.childNodes) == 1
    assert e.childNodes[0].nodeType == Node.TEXT_NODE
    return e.childNodes[0].nodeValue.strip()


def text_content(e: Node, strip: bool = True) -> str:
    if e.nodeType == Node.TEXT_NODE:
        if strip:
            return e.nodeValue.strip()
        else:
            return e.nodeValue
    else:
        return ''.join(map(lambda node: text_content(node, strip), e.childNodes))


def find(e: Element, tag: str) -> Element:
    elements = e.getElementsByTagName(tag)
    assert len(elements) == 1
    return elements[0]


def findall(e: Element, tag: str) -> list[Element]:
    return e.getElementsByTagName(tag)
