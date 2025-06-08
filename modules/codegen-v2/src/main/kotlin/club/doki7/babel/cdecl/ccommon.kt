package club.doki7.babel.cdecl

fun Char.isIdentChar(): Boolean = this.isLetterOrDigit() || this == '_'

fun Char.isIdentStartingChar(): Boolean = this.isLetter() || this == '_'

fun Char.isSymbolChar(): Boolean = this in symbolChars

private val symbolChars = setOf(
    '{', '}', '[', ']', '(', ')', ',', ';', '=', '*', '|', '-', '+'
)
