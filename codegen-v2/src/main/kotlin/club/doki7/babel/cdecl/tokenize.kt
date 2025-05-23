package club.doki7.babel.cdecl

internal enum class TokenType {
    IDENT,
    SYMBOL,
    INTEGER,
    STRING,

    TRIVIA,

    EOI
}

internal data class Token(val type: TokenType, val value: String, val line: Int, val col: Int) {
    override fun toString(): String {
        return "$type $value"
    }
}

internal class Tokenizer(private val source: List<String>, private var curLine: Int) {
    private var curCol = 0

    private val curChar: Char inline get() = source[curLine][curCol]

    private var savedToken: Token? = null

    fun next(): Token {
        if (savedToken != null) {
            val token = savedToken!!
            savedToken = null
            return token
        }

        return nextTokenImpl()
    }

    fun peek(): Token {
        if (savedToken != null) {
            return savedToken!!
        }

        savedToken = nextTokenImpl()
        return savedToken!!
    }

    fun nextTokenImpl(): Token {
        skipWhitespace()
        if (curLine >= source.size) {
            return Token(TokenType.EOI, "", curLine, curCol)
        }

        val line = source[curLine]
        val c = line[curCol]

        return if (c == '/') {
            if (curCol + 1 < line.length && line[curCol + 1] == '/') {
                readLineComment()
            } else if (curCol + 1 < line.length && line[curCol + 1] == '*') {
                readBlockComment()
            } else {
                syntaxError("Unexpected character: $c", curLine, curCol)
            }
        } else if (c.isSymbolChar()) {
            val token = Token(TokenType.SYMBOL, c.toString(), curLine, curCol)
            curCol++
            token
        } else if (c.isDigit()) {
            readInteger()
        } else if (c == '"') {
            readString()
        } else if (c.isIdentStartingChar()) {
            readIdent().let { token ->
                when (token.value) {
                    in knownCallLikeMacros -> {
                        val internalTokens = mutableListOf<Token>()
                        var internalToken = next()
                        if (internalToken.type != TokenType.SYMBOL || internalToken.value != "(") {
                            syntaxError("Expected '(', found: ${internalToken.value}", curLine, curCol)
                        }
                        internalTokens.add(internalToken)
                        while (true) {
                            internalToken = next()
                            if (internalToken.type == TokenType.EOI) {
                                syntaxError("Unterminated macro call", curLine, curCol)
                            }

                            internalTokens.add(internalToken)
                            if (internalToken.type == TokenType.SYMBOL && internalToken.value == ")") {
                                break
                            }
                        }
                        Token(
                            TokenType.TRIVIA,
                            token.value + internalTokens.joinToString(" ") { it.value },
                            token.line,
                            token.col
                        )
                    }
                    in knownMacros -> token.copy(type = TokenType.TRIVIA)
                    else -> token
                }
            }
        } else {
            syntaxError("Unexpected character: $c", curLine, curCol)
        }
    }

    private fun readInteger(): Token {
        val start = curCol
        while (curCol < source[curLine].length && (curChar.isDigit() || curChar == '_' || curChar == 'x')) {
            curCol++
        }
        if (!source[curLine][curCol].isSymbolChar()) {
            syntaxError("Unexpected character: $curChar", curLine, curCol)
        }
        return Token(TokenType.INTEGER, source[curLine].substring(start, curCol), curLine, start)
    }

    private fun readIdent(): Token {
        val start = curCol
        while (curCol < source[curLine].length && curChar.isIdentChar()) {
            curCol++
        }
        return Token(TokenType.IDENT, source[curLine].substring(start, curCol), curLine, start)
    }

    private fun readString(): Token {
        curCol++
        val start = curCol
        while (curCol < source[curLine].length && source[curLine][curCol] != '"') {
            curCol++
        }
        if (source[curLine][curCol] != '"') {
            syntaxError("Unterminated string literal", curLine, start)
        }
        curCol++
        return Token(TokenType.STRING, source[curLine].substring(start, curCol - 1), curLine, start)
    }

    private fun readLineComment(): Token {
        curCol += 2
        val startCol = curCol
        val commentContent = source[curLine].substring(startCol)
        curLine++
        curCol = 0
        return Token(TokenType.TRIVIA, commentContent, curLine - 1, startCol)
    }

    private fun readBlockComment(): Token {
        curCol += 2
        val content = StringBuilder()
        val startLine = curLine
        val startCol = curCol
        while (curLine < source.size) {
            while (curCol < source[curLine].length) {
                if (source[curLine][curCol] == '*' && curCol + 1 < source[curLine].length && source[curLine][curCol + 1] == '/') {
                    curCol += 2
                    return Token(TokenType.TRIVIA, content.toString(), startLine, startCol)
                }
                content.append(source[curLine][curCol])
                curCol++
            }
            curLine++
            curCol = 0
        }
        syntaxError("Unterminated block comment", startLine, startCol)
    }

    private fun skipWhitespace() {
        while (curLine < source.size) {
            while (curCol < source[curLine].length && source[curLine][curCol].isWhitespace()) {
                curCol++
            }

            if (curCol >= source[curLine].length) {
                curLine++
                curCol = 0
            } else {
                break
            }
        }
    }
}

internal val knownMacros = setOf(
    "VMA_CALL_PRE",
    "VMA_CALL_POST",
    "VMA_EXTENDS_VK_STRUCT",
    "VMA_NULLABLE",
    "VMA_NOT_NULL",
    "VMA_NOT_NULL_NON_DISPATCHABLE",
    "VKAPI_PTR"
)

private val knownCallLikeMacros = setOf(
    "VMA_LEN_IF_NOT_NULL",
    "VMA_EXTENDS_VK_STRUCT",
    "VMA_LEN_IF_NOT_NULL"
)
