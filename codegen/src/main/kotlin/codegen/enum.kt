package codegen

import Enum
import appendLn

fun generateEnum(packageName: String, enum: Enum): String = buildString {
    appendLn("package $packageName.enumtype;")
    appendLn()
    if (enum.variants.isEmpty()) {
        appendLn("public final class ${enum.name} {")
        appendLn("}")
    }
    else {
        appendLn("import tech.icey.panama.annotation.enumtype;")
        appendLn()
        appendLn("public final class ${enum.name} {")
        for (variant in enum.variants) {
            appendLn("    public static final int ${variant.name} = ${variant.value};")
        }
        appendLn()
        appendLn("    public static String explain(@enumtype(${enum.name}.class) int value) {")
        appendLn("        return switch (value) {")
        for (variant in enum.variants) {
            appendLn("            case ${enum.name}.${variant.name} -> \"${variant.name}\";")
        }
        appendLn("            default -> \"Unknown ${enum.name}: \" + value;")
        appendLn("        };")
        appendLn("    }")
        appendLn("}")
    }
}
