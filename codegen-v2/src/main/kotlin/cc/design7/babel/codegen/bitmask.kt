package cc.design7.babel.codegen

import cc.design7.babel.registry.Bitmask
import cc.design7.babel.registry.RegistryBase
import cc.design7.babel.util.Either
import cc.design7.babel.util.buildDoc

fun generateBitmask(
    registryBase: RegistryBase,
    bitmask: Bitmask,
    codegenOptions: CodegenOptions
) = buildDoc {
    val docLink = codegenOptions.seeLinkProvider(bitmask)

    val postfix = when (bitmask.bitwidth) {
        null, 32 -> ""
        64 -> "L"
        else -> error("unsupported bitwidth: ${bitmask.bitwidth}")
    }

    val (bitflagType, bitflagObjectType) = when (bitmask.bitwidth) {
        null, 32 -> Pair("int", "Integer")
        64 -> Pair("long", "Long")
        else -> error("unsupported bitwidth: ${bitmask.bitwidth}")
    }

    val bitflags = bitmask.bitflags.sortedBy { it.name }

    +"package ${codegenOptions.packageName}.bitmask;"
    +""

    if (bitflags.isNotEmpty()) {
        +"import cc.design7.ffm.annotation.*;"
        +""
        +"import java.util.ArrayList;"
        +"import java.util.List;"
        +""
    }

    if (docLink != null) {
        +"/// @see $docLink"
    }

    +"public final class ${bitmask.name} {"
    indent {
        for (flag in bitflags) {
            val docLink = codegenOptions.seeLinkProvider(flag)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            +when (flag.value) {
                is Either.Left -> {
                    val bigInt = flag.value.value
                    val hexValue = bigInt.toString(16)
                    "public static final $bitflagType ${flag.name} = 0x$hexValue$postfix;"
                }
                is Either.Right -> {
                    val value = flag.value.value
                    if (value.isEmpty()) {
                        "public static final $bitflagType ${flag.name} = 0$postfix;"
                    } else {
                        val valueString = value.joinToString(" | ")
                        "public static final $bitflagType ${flag.name} = $valueString$postfix;"
                    }
                }
            }
        }

        if (bitflags.isNotEmpty()) {
            +""
            +"public static String explain(@enumtype(${bitmask.name}.class) $bitflagType flags) {"
            indent {
                +"List<String> detectedFlagBits = new ArrayList<>();"
                for (flag in bitflags) {
                    if (flag.value is Either.Right) {
                        continue
                    }

                    +"if ((flags & ${flag.name}) != 0) {"
                    indent {
                        +"detectedFlagBits.add(\"${flag.name.original}\");"
                    }
                    +"}"
                }
                +""
                +"if (detectedFlagBits.isEmpty()) {"
                indent {
                    +"return \"NONE(\" + ${bitflagObjectType}.toBinaryString(flags) + \")\";"
                }
                +"}"
                +"return String.join(\" | \", detectedFlagBits);"
            }
            +"}"
            +""
        }

        +prohibitUserConstruct(bitmask.name)
    }
    +"}"
}
