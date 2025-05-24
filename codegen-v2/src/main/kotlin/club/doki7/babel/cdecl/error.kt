package club.doki7.babel.cdecl

internal fun syntaxError(reason: String, line: Int, col: Int): Nothing {
    error("$line:$col: $reason")
}

internal fun syntaxError(reason: String, token: Token): Nothing {
    error("${token.line}:${token.col}: $reason")
}
