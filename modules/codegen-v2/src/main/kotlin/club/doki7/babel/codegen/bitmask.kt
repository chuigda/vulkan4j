package club.doki7.babel.codegen

import club.doki7.babel.registry.Bitmask
import club.doki7.babel.util.Either
import club.doki7.babel.util.buildDoc

fun generateBitmask(
    bitmask: Bitmask,
    codegenOptions: CodegenOptions
) = buildDoc {
    val docLink = codegenOptions.seeLinkProvider(bitmask)

    val (postfix, bitflagType, bitflagObjectType) = when (bitmask.bitwidth) {
        null, 32 -> listOf("", "int", "Integer")
        8 -> listOf("", "byte", "Byte")
        16 -> listOf("", "short", "Short")
        64 -> listOf("L", "long", "Long")
        else -> error("unsupported bitwidth: ${bitmask.bitwidth}")
    }

    val bitflags = bitmask.bitflags.sortedBy { it.name }

    +"package ${codegenOptions.packageName}.bitmask;"
    +""

    if (codegenOptions.extraImport.isNotEmpty()) {
        for (import in codegenOptions.extraImport) imports(import)
        +""
    }

    if (bitflags.isNotEmpty()) {
        imports("club.doki7.ffm.annotation.*")
        imports("org.intellij.lang.annotations.MagicConstant")
        +""
        imports("java.util.ArrayList")
        imports("java.util.List")
        +""
    }

    if (bitmask.doc != null) {
        for (line in bitmask.doc) {
            +"/// $line"
        }
        +"///"
    }

    if (docLink != null) {
        +"/// @see $docLink"
    }

    +"public final class ${bitmask.name} {"
    indent {
        for ((idx, flag) in bitflags.sortedBy { if (it.value is Either.Right) it.value.value.size else 0 }.withIndex()) {
            if (flag.doc != null) {
                if (idx != 0) {
                    +""
                }
                flag.doc!!.forEach { +"/// $it" }
            }

            val docLink = codegenOptions.seeLinkProvider(flag)
            if (docLink != null) {
                +"/// @see $docLink"
            }

            +when (flag.value) {
                is Either.Left -> {
                    val bigInt = flag.value.value
                    val hexValue = bigInt.toLong().toULong().toString(16)
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
            +"public static String explain(@MagicConstant(flagsFromClass = ${bitmask.name}.class) $bitflagType flags) {"
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
                    if (bitmask.bitwidth == null || bitmask.bitwidth <= 32) {
                        +"return \"NONE(\" + Integer.toBinaryString(flags) + \")\";"
                    } else {
                        +"return \"NONE(\" + ${bitflagObjectType}.toBinaryString(flags) + \")\";"
                    }
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
