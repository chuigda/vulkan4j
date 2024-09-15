from .ctype import CTYPE_INT64, CTYPE_INT32
from ..entity import Bitmask, Registry


def generate_bitmask(registry: Registry, bitmask: Bitmask) -> str:
    if 'FlagBits' in bitmask.name.value:
        raise ValueError('FlagBits types should not be generated, instead they should be referred by normal Flag types')

    bitmask_name = bitmask.name

    content_bitmask = bitmask
    if bitmask.require_flagbits is not None:
        if bitmask.require_flagbits not in registry.bitmasks:
            raise ValueError(f'{bitmask.require_flagbits.value}, required by type {bitmask.name}, is not found in registry')

        print(f'    replacing Flag type {bitmask.name} with FlagBits type {bitmask.require_flagbits}')
        content_bitmask = registry.bitmasks[bitmask.require_flagbits]

    if content_bitmask.bitwidth == 64:
        bitmask_type = CTYPE_INT64
        postfix = 'L'
    elif content_bitmask.bitwidth == 32 or content_bitmask.bitwidth is None:
        bitmask_type = CTYPE_INT32
        postfix = ''
    else:
        raise ValueError(f'unsupported bitwidth: {content_bitmask.bitwidth}')

    return f'''package tech.icey.vk4j.bitmask;

public final class {bitmask_name} {{
{'\n'.join(f'    public static final {bitmask_type.java_raw_type()} {flag.name} = {flag.value}{postfix};' for flag in content_bitmask.bitflags)}
}}
'''
