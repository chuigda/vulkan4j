from ..entity import Enum


def generate_enum(enum: Enum) -> str:
    return f'''package tech.icey.vk4j.enumtype;

public final class {enum.name} {{
{generate_enum_fields(enum)}
}}
'''


def generate_enum_fields(enum: Enum) -> str:
    lines = []
    for variant in enum.variants:
        lines.append(f'    public static final int {variant.name} = {variant.value};')
    return '\n'.join(lines)
