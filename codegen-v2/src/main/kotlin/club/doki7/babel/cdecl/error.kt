package club.doki7.babel.cdecl

internal class SyntaxError(reason: String) : Exception(reason)

internal fun syntaxError(reason: String, token: Token): Nothing {
    syntaxError(reason, token.line, token.col)
}

internal fun syntaxError(reason: String, line: Int, col: Int): Nothing {
    throw SyntaxError("$line:$col: $reason")
}
