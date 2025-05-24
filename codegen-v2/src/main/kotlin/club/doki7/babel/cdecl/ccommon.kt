package club.doki7.babel.cdecl

fun Char.isIdentChar(): Boolean = this.isLetterOrDigit() || this == '_'

fun Char.isIdentStartingChar(): Boolean = this.isLetter() || this == '_'

fun Char.isSymbolChar(): Boolean = this in symbolChars

fun Char.isHexDigit(): Boolean = isDigit() || this in 'a'..'f' || this in 'A'..'F'

private val symbolChars = setOf(
    '{', '}', '[', ']', '(', ')', ',', ';', '=', '*', '|'
)
