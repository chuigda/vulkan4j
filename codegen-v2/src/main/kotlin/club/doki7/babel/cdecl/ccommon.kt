package club.doki7.babel.cdecl

fun Char.isIdentChar(): Boolean = this.isLetterOrDigit() || this == '_'

fun Char.isIdentStartingChar(): Boolean = this.isLetter() || this == '_'

fun Char.isSymbolChar(): Boolean =
    this == '(' || this == ')' || this == ',' || this == '*' || this == '[' || this == ']' || this == ';' || this == '='

fun String.isAllCapital(): Boolean = this.any { it.isLetter() } && this.filter { it.isLetter() }.all { it.isUpperCase() }

fun String.isValidIdent(): Boolean = this.isNotEmpty() && this[0].isIdentStartingChar() && this.all { it.isIdentChar() }

fun String.isLikelyMacro(): Boolean = this.isValidIdent() && this.isAllCapital() && this !in allCapitalTypeNames

// Mainly Microsoft(R) Windows(R) typedefs. Fuck Microsoft Windows.
private val allCapitalTypeNames = setOf(
    "HWND",
    "HINSTANCE"
);
