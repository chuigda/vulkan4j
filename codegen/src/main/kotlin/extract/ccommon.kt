package extract

import IdentifierType
import PointerType

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
        var type: Type = IdentifierType(tokens[position])
        var positionNext = position + 1
        while (tokens.getOrNull(positionNext) == "*") {
            type = PointerType(type, false)
            positionNext++
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

fun Char.isIdentChar(): Boolean {
    return this.isLetterOrDigit() || this == '_'
}

fun Char.isIdentStartingChar(): Boolean {
    return this.isLetter() || this == '_'
}

fun String.isAllCapital(): Boolean {
    return this.all { it.isUpperCase() || it.isDigit() || it == '_' }
}
