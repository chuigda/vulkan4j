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

        content_bitmask = registry.bitmasks[bitmask.require_flagbits]

    if bitmask.bitwidth == 64:
        bitmask_type = CTYPE_INT64
    elif bitmask.bitwidth == 32 or bitmask.bitwidth is None:
        bitmask_type = CTYPE_INT32
    else:
        raise ValueError(f'unsupported bitwidth: {bitmask.bitwidth}')

    return f'''package tech.icey.vk4j.bitmask;

public final class {bitmask_name} {{
{'\n'.join(f'    public static final {bitmask_type.java_type()} {flag.name} = {flag.value};' for flag in content_bitmask.bitflags)}
}}
'''