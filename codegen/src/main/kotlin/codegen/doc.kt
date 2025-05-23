package codegen

fun indent(s: String, n: Int): String {
    val indent = "    ".repeat(n)
    return s.split('\n').joinToString("\n") {
        if (it.isBlank()) "" else "$indent$it"
    }
}
