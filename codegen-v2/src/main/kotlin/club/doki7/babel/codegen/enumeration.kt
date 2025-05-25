package club.doki7.babel.codegen

import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.Either
import club.doki7.babel.util.buildDoc

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
        +"import club.doki7.ffm.annotation.*;"
        +""
    }

    if (enumeration.originalDoc != null) {
        for (line in enumeration.originalDoc) {
            +"/// $line"
        }
        +"///"
    }

    if (docLink != null) {
        +"/// @see $docLink"
    }
    +"public final class ${enumeration.name} {"
    indent {
        for ((idx, variant) in enumeration.variants.withIndex()) {
            if (variant.originalDoc != null) {
                if (idx != 0) {
                    +""
                }
                variant.originalDoc!!.forEach { +"/// $it" }
            }

            val docLink = codegenOptions.seeLinkProvider(variant)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            val value = when (variant.value) {
                is Either.Left -> {
                    val hexValue = variant.value.value.toUInt().toString(16)
                    "0x$hexValue"
                }
                is Either.Right -> {
                    val value = variant.value.value
                    if (value.isEmpty()) {
                        "0"
                    } else {
                        value.joinToString(" | ")
                    }
                }
            }

            +"public static final int ${variant.name} = ${value};"
        }

        if (variants.isNotEmpty()) {
            +""
            +"public static String explain(@EnumType(${enumeration.name}.class) int value) {"
            indent {
                +"return switch (value) {"
                indent {
                    for (variant in variants) {
                        +"case ${enumeration.name}.${variant.name} -> \"${variant.name.original}\";"
                    }
                    +"default -> \"UNKNOWN(\" + value + \")\";"
                }
                +"};"
            }
            +"}"
            +""
        }

        +prohibitUserConstruct(enumeration.name)
    }
    +"}"
}
