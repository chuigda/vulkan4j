package cc.design7.babel.codegen

import cc.design7.babel.registry.Enumeration
import cc.design7.babel.registry.RegistryBase
import cc.design7.babel.util.buildDoc

fun generateEnumeration(
    registry: RegistryBase,
    enumeration: Enumeration,
    codegenOptions: CodegenOptions
) = buildDoc {
    val docLink = codegenOptions.seeLinkProvider(enumeration)
    val variants = enumeration.variants.sortedBy { it.name }

    +"package ${codegenOptions.packageName}.enumtype;"
    +""

    if (variants.isNotEmpty()) {
        +"import cc.design7.ffm.annotation.*;"
        +""
    }

    if (docLink != null) {
        +"/// @see $docLink"
    }
    +"public final class ${enumeration.name} {"
    indent {
        for (variant in enumeration.variants) {
            val docLink = codegenOptions.seeLinkProvider(variant)
            if (docLink != null) {
                +"/// @see $docLink"
            }
            +"public static final int ${variant.name} = ${variant.value};"
        }

        if (variants.isNotEmpty()) {
            +""
            +"public static String explain(@enumtype(${enumeration.name}.class) int value) {"
            indent {
                +"return switch (value) {"
                indent {
                    for (variant in variants) {
                        +"case ${enumeration.name}.${variant.name} -> \"${variant.name.original}\";"
                    }
                    +"default -> \"Unknown ${enumeration.name}: \" + value;"
                }
                +"};"
            }
            +"}"
        }

        +prohibitUserConstruct(enumeration.name)
    }
    +"}"
}
