package club.doki7.babel.extract

fun isBlockCommentIndicator(line: String): Boolean {
    return line.startsWith("/**") || line.startsWith("/*!")
}

fun isTriSlashIndicator(line: String): Boolean {
    return line.startsWith("///")
}

/**
 * Call [isTriSlashIndicator] first
 */
fun isLineCommentIndicator(line: String): Boolean {
    return line.startsWith("#") || line.startsWith("//")
}

enum class TypedefKind {
    Normal, Enum, Struct
}

/**
 * @return null if not a typedef
 */
fun isTypedef(line: String): TypedefKind? {
    if (! line.startsWith("typedef ")) return null
    val offset = 8
    if (line.startsWith("enum ", offset)) return TypedefKind.Enum
    if (line.startsWith("struct ", offset)) return TypedefKind.Struct
    return TypedefKind.Normal
}