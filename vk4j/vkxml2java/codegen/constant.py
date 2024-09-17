from typing import Iterable

from .ctype import lower_type
from ..entity import Registry, Constant


def generate_constants(registry: Registry, constants: Iterable[Constant]) -> str:
    return f'''package tech.icey.vk4j;

import tech.icey.vk4j.annotations.*;

public final class Constants {{
{'\n'.join(map(lambda constant: generate_constant(registry, constant), constants))}
}}
'''


def generate_constant(registry: Registry, constant: Constant) -> str:
    ctype = lower_type(registry, constant.type)
    expr = (constant.expr
            .replace('ULL', '')
            .replace('UL', '')
            .replace('LL', '')
            .replace('L', '')
            .replace('U', ''))
    return f'    public static final {ctype.java_type()} {constant.name} = {expr};'
