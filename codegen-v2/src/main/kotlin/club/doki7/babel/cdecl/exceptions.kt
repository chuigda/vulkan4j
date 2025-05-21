package club.doki7.babel.cdecl

class ParseException(
    message: String,
    val line: Int,
    val col: Int,
) : RuntimeException("$message at line $line, col $col") {
    constructor(message: String, token: BaseToken)
        : this("$message, got ${token.value}", token.line + 1, token.col + 1)
}
