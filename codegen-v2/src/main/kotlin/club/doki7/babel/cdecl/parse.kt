package club.doki7.babel.cdecl

internal fun expectAndConsume(kind: TokenKind, tokenizer: Tokenizer, tokenValue: String? = null): Token {
    val token = tokenizer.next()
    if (token.kind != kind) {
        syntaxError("Expected $kind but got ${token.kind}", token)
    }
    if (tokenValue != null && token.value != tokenValue) {
        syntaxError("Expected token value '$tokenValue' but got '${token.value}'", token)
    }
    return token
}

internal fun expectAndConsume(kinds: Set<TokenKind>, tokenizer: Tokenizer): Token {
    val token = tokenizer.next()
    if (token.kind !in kinds) {
        syntaxError("Expected one of $kinds but got ${token.kind}", token)
    }
    return token
}

internal fun skipTrivia(tokenizer: Tokenizer, triviaList: MutableList<String>) {
    while (true) {
        val token = tokenizer.peek()
        if (token.kind == TokenKind.TRIVIA) {
            triviaList.add(token.value)
            tokenizer.next()
        } else {
            break
        }
    }
}

internal fun parseStructFieldDecl(tokenizer: Tokenizer): VarDecl {
    var effectiveType = parseType(tokenizer)
    val varDeclSpecificTrivia = mutableListOf<String>()
    skipTrivia(tokenizer, varDeclSpecificTrivia)
    val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
    while (true) {
        val triviaBeforeBracket = mutableListOf<String>()
        skipTrivia(tokenizer, triviaBeforeBracket)

        val peekToken = tokenizer.peek()
        if (peekToken.kind == TokenKind.SYMBOL && peekToken.value == "[") {
            varDeclSpecificTrivia.addAll(triviaBeforeBracket)
            tokenizer.next()

            val arrayInternalTrivia = mutableListOf<String>()
            skipTrivia(tokenizer, arrayInternalTrivia)

            val sizePeekTokenForArray = tokenizer.peek()
            val actualArraySize: String
            if (sizePeekTokenForArray.kind == TokenKind.SYMBOL && sizePeekTokenForArray.value == "]") {
                actualArraySize = ""
            } else if (sizePeekTokenForArray.kind == TokenKind.INTEGER || sizePeekTokenForArray.kind == TokenKind.IDENT) {
                val sizeToken = tokenizer.next()
                actualArraySize = sizeToken.value
            } else {
                syntaxError("Expected array size (integer or identifier) or ']' but got ${sizePeekTokenForArray.kind}", sizePeekTokenForArray)
            }

            skipTrivia(tokenizer, arrayInternalTrivia)
            val closeBracketToken = expectAndConsume(TokenKind.SYMBOL, tokenizer)
            if (closeBracketToken.value != "]") {
                syntaxError("Expected ']' to close array declaration", closeBracketToken)
            }

            effectiveType = RawArrayType(effectiveType, actualArraySize, arrayInternalTrivia)
        } else {
            varDeclSpecificTrivia.addAll(triviaBeforeBracket)
            break
        }
    }

    skipTrivia(tokenizer, varDeclSpecificTrivia)
    val semicolonToken = expectAndConsume(TokenKind.SYMBOL, tokenizer)
    if (semicolonToken.value != ";") {
        syntaxError("Expected ';' after variable declaration", semicolonToken)
    }

    return VarDecl(nameToken.value, effectiveType, varDeclSpecificTrivia)
}

internal fun parseEnumeratorDecl(tokenizer: Tokenizer): EnumeratorDecl {
    val triviaList = mutableListOf<String>()
    skipTrivia(tokenizer, triviaList)
    val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
    skipTrivia(tokenizer, triviaList)

    val token = tokenizer.peek()
    val ret = if (token.kind == TokenKind.SYMBOL && token.value == "=") {
        tokenizer.next()
        val value = parseSimpleExpr(tokenizer, triviaList)
        EnumeratorDecl(nameToken.value, value, triviaList)
    } else {
        EnumeratorDecl(nameToken.value, "", triviaList)
    }

    skipTrivia(tokenizer, triviaList)
    if (tokenizer.peek().kind == TokenKind.SYMBOL && tokenizer.peek().value == ",") {
        tokenizer.next()
    }

    return ret
}

internal fun parseFunctionDecl(tokenizer: Tokenizer): FunctionDecl {
    val triviaList = mutableListOf<String>()

    val returnType = parseType(tokenizer)
    skipTrivia(tokenizer, triviaList)

    val functionName = expectAndConsume(TokenKind.IDENT, tokenizer)
    skipTrivia(tokenizer, triviaList)

    val params = parseFunctionParamList(tokenizer)

    skipTrivia(tokenizer, triviaList)
    expectAndConsume(TokenKind.SYMBOL, tokenizer, ";")
    return FunctionDecl(functionName.value, returnType, params, triviaList)
}

internal fun parseTypedefDecl(tokenizer: Tokenizer): TypedefDecl {
    val triviaList = mutableListOf<String>()
    skipTrivia(tokenizer, triviaList)
    expectAndConsume(TokenKind.IDENT, tokenizer, "typedef")

    val type = parseType(tokenizer)
    skipTrivia(tokenizer, triviaList)

    if (tokenizer.peek().kind == TokenKind.SYMBOL && tokenizer.peek().value == "(") {
        tokenizer.next()
        skipTrivia(tokenizer, triviaList)
        expectAndConsume(TokenKind.SYMBOL, tokenizer, "*")
        skipTrivia(tokenizer, triviaList)

        val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
        skipTrivia(tokenizer, triviaList)
        expectAndConsume(TokenKind.SYMBOL, tokenizer, ")")

        // 解析函数参数
        val params = parseFunctionParamList(tokenizer)
        val paramsList = params.map { Pair(it.name, it.type) }

        skipTrivia(tokenizer, triviaList)
        expectAndConsume(TokenKind.SYMBOL, tokenizer, ";") // 消费 ";"

        val functionType = RawFunctionType(type, paramsList, mutableListOf())
        return TypedefDecl(nameToken.value, functionType, triviaList)
    } else {
        // 处理普通 typedef
        val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
        skipTrivia(tokenizer, triviaList)
        expectAndConsume(TokenKind.SYMBOL, tokenizer, ";") // 消费 ";"

        return TypedefDecl(nameToken.value, type, triviaList)
    }
}

private fun parseFunctionParamList(tokenizer: Tokenizer): MutableList<VarDecl> {
    expectAndConsume(TokenKind.SYMBOL, tokenizer, "(")
    val params = mutableListOf<VarDecl>()
    while (true) {
        val paramTriviaList = mutableListOf<String>()

        val paramType = parseType(tokenizer)
        skipTrivia(tokenizer, paramTriviaList)

        val peekedToken = tokenizer.peek()
        if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == ")") {
            if (paramType is RawIdentifierType && paramType.ident == "void") {
                if (params.isNotEmpty()) {
                    syntaxError("void cannot be used as a parameter type if there are other parameters", peekedToken)
                }
            } else {
                params.add(VarDecl("", paramType, paramTriviaList))
            }
            break
        }

        val paramName = expectAndConsume(TokenKind.IDENT, tokenizer)
        skipTrivia(tokenizer, paramTriviaList)

        val peekedToken2 = tokenizer.peek()
        if (peekedToken2.kind == TokenKind.SYMBOL && peekedToken2.value == ",") {
            tokenizer.next()
            params.add(VarDecl(paramName.value, paramType, paramTriviaList))
        } else if (peekedToken2.kind == TokenKind.SYMBOL && peekedToken2.value == ")") {
            params.add(VarDecl(paramName.value, paramType, paramTriviaList))
            break
        } else {
            syntaxError("Expected ',' or ')' after parameter declaration", peekedToken2)
        }
    }

    expectAndConsume(TokenKind.SYMBOL, tokenizer, ")")
    return params
}

internal fun parseType(tokenizer: Tokenizer): RawType {
    var isUnsigned = false
    var isConst = false
    var triviaList = mutableListOf<String>()
    skipTrivia(tokenizer, triviaList)

    var token = tokenizer.next()
    if (token.kind == TokenKind.IDENT && token.value == "const") {
        isConst = true
        skipTrivia(tokenizer, triviaList)
        token = tokenizer.next()
    } else if (token.kind == TokenKind.IDENT && token.value == "volatile") {
        syntaxError("Our backend don't know how to deal with volatile yet", token)
    }

    if (token.kind == TokenKind.IDENT && token.value == "unsigned") {
        isUnsigned = true
        skipTrivia(tokenizer, triviaList)
        token = tokenizer.next()
    }

    if (token.kind != TokenKind.IDENT) {
        syntaxError("Expected identifier but got ${token.kind}", token)
    }

    var ty: RawType = RawIdentifierType(token.value, isUnsigned, triviaList)
    triviaList = mutableListOf()

    skipTrivia(tokenizer, triviaList)
    token = tokenizer.peek()
    while (true) {
        if (token.kind == TokenKind.IDENT && token.value == "const") {
            isConst = true
        } else if (token.kind == TokenKind.IDENT && token.value == "volatile") {
            syntaxError("Our backend don't know how to deal with volatile yet", token)
        } else if (token.kind == TokenKind.SYMBOL && token.value == "*") {
            ty.trivia.addAll(triviaList)
            ty = RawPointerType(ty, isConst, mutableListOf())

            isConst = false
            triviaList = mutableListOf()
        } else {
            break
        }

        tokenizer.next()
        skipTrivia(tokenizer, triviaList)
        token = tokenizer.peek()
    }

    ty.trivia.addAll(triviaList)
    return ty
}

internal fun parseSimpleExpr(tokenizer: Tokenizer, trivia: MutableList<String>): String {
    skipTrivia(tokenizer, trivia)
    val firstToken = tokenizer.next()
    var result: String
    when (firstToken.kind) {
        TokenKind.INTEGER, TokenKind.IDENT -> result = firstToken.value
        else -> syntaxError("Expected integer or identifier for the first term in expression, got ${firstToken.kind}", firstToken)
    }

    while (true) {
        skipTrivia(tokenizer, trivia)

        val peekToken = tokenizer.peek()
        if (peekToken.kind == TokenKind.SYMBOL && peekToken.value == "|") {
            tokenizer.next()
            result += " | "

            skipTrivia(tokenizer, trivia)

            val token = expectAndConsume(setOf(TokenKind.INTEGER, TokenKind.IDENT), tokenizer)
            result += token.value
        } else {
            break
        }
    }
    return result
}
