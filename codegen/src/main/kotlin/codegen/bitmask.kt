package codegen

import Bitmask
import appendLn

fun generateBitmask(packageName: String, bitmask: Bitmask): String = buildString {
    appendLn("package $packageName.bitmask;")
    appendLn()
    appendLn("import tech.icey.panama.annotation.enumtype;")
    appendLn()
    appendLn("public final class ${bitmask.name} {")

    val postfix = when (bitmask.bitwidth) {
        null, 32 -> ""
        64 -> "L"
        else -> throw IllegalArgumentException("unsupported bitwidth: ${bitmask.bitwidth}")
    }

    val bitflagType = when (bitmask.bitwidth) {
        null, 32 -> "int"
        64 -> "long"
        else -> throw IllegalArgumentException("unsupported bitwidth: ${bitmask.bitwidth}")
    }

    for (flag in bitmask.bitflags) {
        appendLn("    public static final $bitflagType ${flag.name} = ${flag.value}$postfix;")
    }
    appendLn()

    appendLn("    public static String explain(@enumtype(${bitmask.name}.class) $bitflagType flags) {")
    appendLn("        StringBuilder sb = new StringBuilder();")
    for (flag in bitmask.bitflags) {
        appendLn("        if ((flags & ${flag.name}) != 0) {")
        appendLn("            sb.append(\"${flag.name} \");")
        appendLn("            if (!sb.isEmpty()) {")
        appendLn("                sb.append(\"|\");")
        appendLn("            }")
        appendLn("        }")
    }
    appendLn("        return sb.toString();")
    appendLn("    }")

    appendLn("}")
}
