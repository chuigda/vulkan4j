package codegen

import Enumeration
import appendLn

fun generateEnum(packageName: String, enumeration: Enumeration): String = buildString {
    appendLn("package $packageName.enumtype;")
    appendLn()
    if (enumeration.variants.isEmpty()) {
        appendLn("public final class ${enumeration.name} {")
        appendLn("}")
    }
    else {
        appendLn("import tech.icey.panama.annotation.enumtype;")
        appendLn()
        appendLn("public final class ${enumeration.name} {")
        for (variant in enumeration.variants) {
            appendLn("    public static final int ${variant.name} = ${variant.value};")
        }
        appendLn()
        appendLn("    public static String explain(@enumtype(${enumeration.name}.class) int value) {")
        appendLn("        return switch (value) {")
        for (variant in enumeration.variants) {
            appendLn("            case ${enumeration.name}.${variant.name} -> \"${variant.name}\";")
        }
        appendLn("            default -> \"Unknown ${enumeration.name}: \" + value;")
        appendLn("        };")
        appendLn("    }")
        appendLn("}")
    }
}
