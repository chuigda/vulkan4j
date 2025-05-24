package club.doki7.babel.cdecl

internal fun expectAndConsume(kind: TokenKind, tokenizer: Tokenizer): Token {
    val token = tokenizer.next()
    if (token.kind != kind) {
        throw IllegalStateException("Expected $kind but got ${token.kind} at line ${token.line}, col ${token.col}")
    }
    return token
}

internal fun skipSyntaxTrivia(tokenizer: Tokenizer, syntaxTriviaList: MutableList<String>) {
    while (true) {
        val token = tokenizer.peek()
        if (token.kind == TokenKind.TRIVIA) {
            syntaxTriviaList.add(token.value)
            tokenizer.next()
        } else {
            break
        }
    }
}

internal fun parseType(tokenizer: Tokenizer): RawType {
    var isConst = false
    var syntaxTriviaList = mutableListOf<String>()
    skipSyntaxTrivia(tokenizer, syntaxTriviaList)

    var token = tokenizer.next()
    if (token.kind == TokenKind.IDENT && token.value == "const") {
        isConst = true
        skipSyntaxTrivia(tokenizer, syntaxTriviaList)
        token = tokenizer.next()
    } else if (token.kind == TokenKind.IDENT && token.value == "volatile") {
        syntaxError("Our backend don't know how to deal with volatile yet", token)
    }

    if (token.kind != TokenKind.IDENT) {
        syntaxError("Expected identifier but got ${token.kind}", token)
    }

    var ty: RawType = RawIdentifierType(token.value, syntaxTriviaList)
    syntaxTriviaList = mutableListOf()

    skipSyntaxTrivia(tokenizer, syntaxTriviaList)
    token = tokenizer.peek()
    while (true) {
        if (token.kind == TokenKind.IDENT && token.value == "const") {
            isConst = true
        } else if (token.kind == TokenKind.IDENT && token.value == "volatile") {
            syntaxError("Our backend don't know how to deal with volatile yet", token)
        } else if (token.kind == TokenKind.SYMBOL && token.value == "*") {
            ty.syntaxTrivia.addAll(syntaxTriviaList)
            ty = RawPointerType(ty, isConst, mutableListOf())

            isConst = false
            syntaxTriviaList = mutableListOf()
        } else {
            break
        }

        tokenizer.next()
        skipSyntaxTrivia(tokenizer, syntaxTriviaList)
        token = tokenizer.peek()
    }

    ty.syntaxTrivia.addAll(syntaxTriviaList)
    return ty
}
