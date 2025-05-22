package club.doki7.babel.cdecl

abstract class BaseToken(
    val value: String,
    val line: Int,
    val col: Int,
) {
    override fun toString(): String {
        return "$line:$col:$value"
    }
}

const val CONST = "const"
const val VOLATILE = "volatile"
const val TYPEDEF = "typedef"

enum class TokenType {
    IDENT,
    SYMBOL,
    QUALIFIER,
    KEYWORD,
    TRIVIA,
    INTEGER,
}

class Token(
    val type: TokenType,
    value: String,
    line: Int,
    col: Int,
): BaseToken(value, line, col)

private enum class RawTokenType {
    IDENT,
    STRING,
    COMMENT,
    SYMBOL,
    INTEGER,
}

private class RawToken(
    val type: RawTokenType,
    value: String,
    line: Int,
    col: Int,
) : BaseToken(value, line, col) {
    fun toToken(): Token {
        return Token(
            when (type) {
                RawTokenType.IDENT -> TokenType.IDENT
                RawTokenType.STRING -> error("Invalid string literal", this)
                RawTokenType.COMMENT -> TokenType.TRIVIA
                RawTokenType.SYMBOL -> TokenType.SYMBOL
                RawTokenType.INTEGER -> TokenType.INTEGER
            },
            value,
            line,
            col,
        )
    }
}

class CTokenizer(private val source: List<String>, var curLine: Int) {
    private var curCol = 0

    private val curChar: Char
        inline get() = source[curLine][curCol]

    fun tokenize(stopAtChar: Char, noTransform: Boolean = false): Pair<List<Token>, Int> {
        val tokens = mutableListOf<RawToken>()
        while (curLine < source.size) {
            while (curCol < source[curLine].length) {
                skipWhitespace()
                if (isEof())
                    break
                val line = source[curLine]
                val c = line[curCol]
                if (c == stopAtChar) {
                    return Pair(postprocessMacros(tokens, noTransform), curLine)
                } else if (c == '/') {
                    val commentToken = if (curCol + 1 < line.length && line[curCol + 1] == '/') {
                        readLineComment()
                    } else if (curCol + 1 < line.length && line[curCol + 1] == '*') {
                        readBlockComment()
                    } else {
                        error("Unexpected character: $c", curLine, curCol)
                    }
                    tokens.add(commentToken)
                } else if (c.isSymbolChar()) {
                    tokens.add(RawToken(RawTokenType.SYMBOL, c.toString(), curLine, curCol))
                    curCol++
                } else if (c.isDigit()) {
                    tokens.add(readInteger())
                } else if (c.isIdentStartingChar()) {
                    tokens.add(readIdent())
                } else if (c == '"') {
                    tokens.add(readString())
                } else {
                    error("Unexpected character: $c", curLine, curCol)
                }
            }
            curLine++
            curCol = 0
        }
        error("Unexpected end of file", curLine, curCol)
    }

    private fun readIdent(): RawToken {
        val start = curCol
        while (curCol < source[curLine].length && curChar.isIdentChar()) {
            curCol++
        }
        return RawToken(RawTokenType.IDENT, source[curLine].substring(start, curCol), curLine, start)
    }

    private fun readInteger(): RawToken {
        val start = curCol
        while (curCol < source[curLine].length && (curChar.isDigit() || curChar == '_' || curChar == 'x')) {
            curCol++
        }
        if (!source[curLine][curCol].isSymbolChar()) {
            error("Unexpected character: $curChar", curLine, curCol)
        }
        return RawToken(RawTokenType.INTEGER, source[curLine].substring(start, curCol), curLine, start)
    }

    private fun readString(): RawToken {
        curCol++
        val start = curCol
        while (curCol < source[curLine].length && source[curLine][curCol] != '"') {
            curCol++
        }
        if (source[curLine][curCol] != '"') {
            error("Unterminated string literal", curLine, start)
        }
        curCol++
        return RawToken(RawTokenType.STRING, source[curLine].substring(start, curCol - 1), curLine, start)
    }

    private fun readLineComment(): RawToken {
        curCol += 2
        val startCol = curCol
        val commentContent = source[curLine].substring(startCol)
        curLine++
        curCol = 0
        return RawToken(RawTokenType.COMMENT, commentContent, curLine - 1, startCol)
    }

    private fun readBlockComment(): RawToken {
        curCol += 2
        val content = StringBuilder()
        val startLine = curLine
        val startCol = curCol
        while (curLine < source.size) {
            while (curCol < source[curLine].length) {
                if (source[curLine][curCol] == '*' && curCol + 1 < source[curLine].length && source[curLine][curCol + 1] == '/') {
                    curCol += 2
                    return RawToken(RawTokenType.COMMENT, content.toString(), startLine, startCol)
                }
                content.append(source[curLine][curCol])
                curCol++
            }
            curLine++
            curCol = 0
        }
        error("Unterminated block comment", startLine, startCol)
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

    private fun isEof(): Boolean = curLine >= source.size
}

private fun postprocessMacros(tokens: List<RawToken>, noTransform: Boolean = false): List<Token> {
    val result = mutableListOf<Token>()
    var pos = 0
    while (pos < tokens.size) {
        val curToken = tokens[pos]
        when (curToken.type) {
            RawTokenType.IDENT -> {
                if (!noTransform && curToken.value.isLikelyMacro() && pos + 1 < tokens.size
                    && tokens[pos + 1].type == RawTokenType.SYMBOL
                    && tokens[pos + 1].value == "("
                ) {
                    // macro as function
                    val sb = StringBuilder()
                    sb.append(tokens[pos].value) // macro name
                    pos++
                    sb.append(tokens[pos].value) // (
                    if (pos + 1 >= tokens.size) {
                        error("Unexpected end of tokens", tokens[pos].line, tokens[pos].col)
                    }
                    pos++
                    when (tokens[pos].type) {
                        RawTokenType.IDENT -> {
                            sb.append(tokens[pos].value) // identifier
                            pos++
                        }

                        RawTokenType.STRING -> {
                            sb.append("\"")
                            sb.append(tokens[pos].value) // string
                            sb.append("\"")
                            pos++
                        }

                        else -> {}
                    }
                    if (pos >= tokens.size) {
                        error("Unexpected end of tokens", tokens.last().line, tokens.last().col)
                    }
                    if (tokens[pos].type != RawTokenType.SYMBOL || tokens[pos].value != ")") {
                        error("Expected ')'", tokens[pos])
                    }
                    sb.append(tokens[pos].value) // )
                    result.add(Token(TokenType.TRIVIA, sb.toString(), curToken.line, curToken.col))
                } else if (!noTransform && curToken.value.isLikelyMacro()) {
                    // macro without args
                    result.add(Token(TokenType.TRIVIA, curToken.value, curToken.line, curToken.col))
                } else if (isTypeQualifier(curToken.value)) {
                    // type qualifier
                    result.add(Token(TokenType.QUALIFIER, curToken.value, curToken.line, curToken.col))
                } else if (isKeyword(curToken.value)) {
                    // keyword
                    result.add(Token(TokenType.KEYWORD, curToken.value, curToken.line, curToken.col))
                } else {
                    // normal identifier
                    result.add(curToken.toToken())
                }
            }
            else -> {
                // other tokens
                result.add(curToken.toToken())
            }
        }
        pos++
    }
    return result
}

private val typeQualifiers = arrayOf(CONST, VOLATILE)

private fun isTypeQualifier(s: String): Boolean = s in typeQualifiers

private val keywords = arrayOf(TYPEDEF)

private fun isKeyword(s: String): Boolean = s in keywords

