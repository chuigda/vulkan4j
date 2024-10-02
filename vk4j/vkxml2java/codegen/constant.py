from typing import Iterable

from .ctype import lower_type
from ..entity import Registry, Constant


def generate_constants(registry: Registry, constants: Iterable[Constant], extension_names: dict[str, str]) -> str:
    return f'''package tech.icey.vk4j;

import tech.icey.panama.annotation.*;

public final class Constants {{
{'\n'.join(map(lambda constant: generate_constant(registry, constant), constants))}

{'\n'.join(map(lambda extension_name: generate_extension_name(extension_name), extension_names.items()))}
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


def generate_extension_name(extension_name: tuple[str, str]) -> str:
    name, value = extension_name
    return f'    public static final String {name} = {value};'
