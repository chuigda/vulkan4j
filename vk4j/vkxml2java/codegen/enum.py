from ..entity import Enum


def generate_enum(enum: Enum) -> str:
    if len(enum.variants) == 0:
        return f'''package tech.icey.vk4j.enumtype;

public final class {enum.name} {{
}}
'''

    return f'''package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class {enum.name} {{
{generate_enum_fields(enum)}

{generate_normal_enum_explain(enum)}
}}
'''


def generate_enum_fields(enum: Enum) -> str:
    lines = []
    for variant in enum.variants:
        lines.append(f'    public static final int {variant.name} = {variant.value};')
    return '\n'.join(lines)


def generate_normal_enum_explain(enum: Enum) -> str:
    return f'''    public static String explain(@enumtype({enum.name}.class) int value) {{
        return switch (value) {{
{'\n'.join(f'            case {variant.name} -> "{variant.name}";' for variant in enum.variants)}
            default -> "Unknown";
        }};
    }}'''
