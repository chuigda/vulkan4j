package extract

import IdentifierType
import PointerType
import Type

fun tokenize(line: String): List<String> {
    var position = 0
    val tokens = mutableListOf<String>()
    while (position < line.length) {
        position = skipWhitespace(line, position)
        if (position >= line.length) {
            break
        }

        val c = line[position]
        if (c == '(' || c == ')' || c == ',' || c == '*' || c == '[' || c == ']' || c == ';' || c == '=') {
            tokens.add(c.toString())
            position++
        }
        else if (c.isIdentStartingChar()) {
            val start = position
            while (position < line.length && line[position].isIdentChar()) {
                position++
            }
            tokens.add(line.slice(start until position))
        }
        else if (c == '"') {
            position++
            while (position < line.length && line[position] != '"') {
                position++
            }
            assert(line[position] == '"')
            position++
        }
        else {
            throw RuntimeException("Unexpected character: $c")
        }
    }

    return tokens
}

fun parseType(tokens: List<String>, position: Int): Pair<Type, Int> {
    if (tokens[position] == "const") {
        val (pointerType, positionNext) = parseType(tokens, position + 1)
        return if (pointerType is PointerType) {
            Pair(PointerType(pointerType.pointee, true), positionNext)
        } else {
            Pair(pointerType, positionNext)
        }
    }
    else if (tokens[position] == "unsigned") {
        return parseType(tokens, position + 1)
    }
    else if (tokens[position] == "struct") {
        return parseType(tokens, position + 1)
    }
    else {
        assert(tokens[position].isValidIdent())
        var type: Type = IdentifierType(tokens[position])
        var positionNext = position + 1

        var nextPointerIsConst = false
        while (positionNext < tokens.size) {
            if (tokens[positionNext] == "const") {
                nextPointerIsConst = true
                positionNext++
            }
            else if (tokens[positionNext] == "volatile") {
                positionNext++
            }
            else if (tokens[positionNext] == "*") {
                type = PointerType(type, nextPointerIsConst)
                nextPointerIsConst = false
                positionNext++
            }
            else if (tokens[positionNext].isLikelyMacro()) {
                if (!tokens[positionNext + 1].isValidIdent()) {
                    // this macro is likely to be part of the type, not a modifier to the identifier
                    positionNext++
                    // and if this is a function-call alike macro
                    if (tokens[positionNext] == "(") {
                        positionNext++
                        while (tokens[positionNext] != ")") {
                            positionNext++
                        }
                        positionNext++
                    }
                }
                else {
                    break
                }
            }
            else {
                break
            }
        }

        return Pair(type, positionNext)
    }
}

fun skipWhitespace(line: String, position: Int): Int {
    var i = position
    while (i < line.length && line[i].isWhitespace()) {
        i++
    }
    return i
}

fun Char.isIdentChar(): Boolean = this.isLetterOrDigit() || this == '_'

fun Char.isIdentStartingChar(): Boolean = this.isLetter() || this == '_'

fun String.isAllCapital(): Boolean = this.any { it.isLetter() } && this.filter { it.isLetter() }.all { it.isUpperCase() }

fun String.isValidIdent(): Boolean = this.isNotEmpty() && this[0].isIdentStartingChar() && this.all { it.isIdentChar() }

fun String.isLikelyMacro(): Boolean = this.isValidIdent() && this.isAllCapital()
