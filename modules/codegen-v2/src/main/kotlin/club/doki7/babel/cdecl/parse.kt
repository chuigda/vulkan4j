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

internal fun parseStructFieldDecl(tokenizer: Tokenizer): List<VarDecl> {
    val type = parseType(tokenizer)
    val ret = mutableListOf<VarDecl>()
    while (true) {
        val decl = parseStructFieldDeclarator(tokenizer, type)
        ret.add(decl)

        val peekToken = tokenizer.peek()
        // if ';'
        if (peekToken.kind == TokenKind.SYMBOL && (peekToken.value == ";" || peekToken.value == "}")) {
            tokenizer.next()
            break
        } else if (peekToken.kind == TokenKind.SYMBOL && peekToken.value == ",") {
            tokenizer.next()
            // next turn
        } else {
            syntaxError("Expected ';' or ',' or '}' after struct field declaration, got ${peekToken.kind}", peekToken)
        }
    }
    return ret
}

internal fun parseStructFieldDeclarator(tokenizer: Tokenizer, type: RawType): VarDecl {
    var effectiveType = type

    val triviaList = mutableListOf<String>()
    skipTrivia(tokenizer, triviaList)

    val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
    skipTrivia(tokenizer, triviaList)

    while (true) {
        val triviaBeforeBracket = mutableListOf<String>()
        skipTrivia(tokenizer, triviaBeforeBracket)

        val peekToken = tokenizer.peek()
        if (peekToken.kind == TokenKind.SYMBOL && peekToken.value == "[") {
            triviaList.addAll(triviaBeforeBracket)
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
            triviaList.addAll(triviaBeforeBracket)
            break
        }
    }
    skipTrivia(tokenizer, triviaList)

    return VarDecl(nameToken.value, effectiveType, triviaList)
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

        val params = parseFunctionParamList(tokenizer)
        val paramsList = params.map { Pair(it.name, it.type) }

        skipTrivia(tokenizer, triviaList)
        expectAndConsume(TokenKind.SYMBOL, tokenizer, ";")

        val functionType = RawFunctionType(type, paramsList, mutableListOf())
        return TypedefDecl(nameToken.value, functionType, triviaList)
    } else {
        // 处理普通 typedef
        val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
        skipTrivia(tokenizer, triviaList)
        expectAndConsume(TokenKind.SYMBOL, tokenizer, ";")

        return TypedefDecl(nameToken.value, type, triviaList)
    }
}

internal fun parseNonPointerFunctionTypedefDecl(tokenizer: Tokenizer): TypedefDecl {
    val triviaList = mutableListOf<String>()
    skipTrivia(tokenizer, triviaList)
    expectAndConsume(TokenKind.IDENT, tokenizer, "typedef")

    val type = parseType(tokenizer)
    skipTrivia(tokenizer, triviaList)

    val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
    skipTrivia(tokenizer, triviaList)

    val params = parseFunctionParamList(tokenizer)
    val paramsList = params.map { Pair(it.name, it.type) }

    skipTrivia(tokenizer, triviaList)
    expectAndConsume(TokenKind.SYMBOL, tokenizer, ";")

    val functionType = RawFunctionType(type, paramsList, mutableListOf())
    return TypedefDecl(nameToken.value, functionType, triviaList)
}

internal fun parseInlineFunctionPointerField(tokenizer: Tokenizer): VarDecl {
    val triviaList = mutableListOf<String>()

    val type = parseType(tokenizer)
    skipTrivia(tokenizer, triviaList)

    expectAndConsume(TokenKind.SYMBOL, tokenizer, "(")
    skipTrivia(tokenizer, triviaList)
    expectAndConsume(TokenKind.SYMBOL, tokenizer, "*")
    skipTrivia(tokenizer, triviaList)

    val nameToken = expectAndConsume(TokenKind.IDENT, tokenizer)
    skipTrivia(tokenizer, triviaList)
    expectAndConsume(TokenKind.SYMBOL, tokenizer, ")")

    val params = parseFunctionParamList(tokenizer)
    val paramsList = params.map { Pair(it.name, it.type) }
    skipTrivia(tokenizer, triviaList)
    expectAndConsume(TokenKind.SYMBOL, tokenizer, ";")

    val functionType = RawFunctionType(type, paramsList, mutableListOf())
    return VarDecl(nameToken.value, functionType, triviaList)
}

private fun parseFunctionParamList(tokenizer: Tokenizer): MutableList<VarDecl> {
    expectAndConsume(TokenKind.SYMBOL, tokenizer, "(")
    val params = mutableListOf<VarDecl>()
    while (true) {
        val paramTriviaList = mutableListOf<String>()

        var peekedToken = tokenizer.peek()
        if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == "...") {
            tokenizer.next()
            skipTrivia(tokenizer, paramTriviaList)
            params.add(VarDecl(
                "...",
                RawIdentifierType("", signed=false, unsigned=false, trivia=mutableListOf()),
                paramTriviaList
            ))
            expectAndConsume(TokenKind.SYMBOL, tokenizer, ")")
            return params
        }

        peekedToken = tokenizer.peek()
        if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == ")") {
            expectAndConsume(TokenKind.SYMBOL, tokenizer, ")")
            return params
        }

        var paramType = parseType(tokenizer)
        skipTrivia(tokenizer, paramTriviaList)

        peekedToken = tokenizer.peek()
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

        if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == ",") {
            tokenizer.next()
            params.add(VarDecl("", paramType, paramTriviaList))
            continue
        }

        val paramName = expectAndConsume(TokenKind.IDENT, tokenizer)
        skipTrivia(tokenizer, paramTriviaList)

        peekedToken = tokenizer.peek()
        if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == "[") {
            tokenizer.next()
            skipTrivia(tokenizer, paramTriviaList)

            // Currently, appointing array size in function parameters is not supported.
            expectAndConsume(TokenKind.SYMBOL, tokenizer, "]")
            skipTrivia(tokenizer, paramTriviaList)

            paramType = RawArrayType(paramType, "", mutableListOf())
            peekedToken = tokenizer.peek()
        }

        if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == ",") {
            tokenizer.next()
            params.add(VarDecl(paramName.value, paramType, paramTriviaList))
        } else if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == ")") {
            params.add(VarDecl(paramName.value, paramType, paramTriviaList))
            break
        } else {
            syntaxError("Expected ',' or ')' after parameter declaration", peekedToken)
        }
    }

    expectAndConsume(TokenKind.SYMBOL, tokenizer, ")")
    return params
}

internal fun parseType(tokenizer: Tokenizer): RawType {
    var isUnsigned = false
    var isSigned = false
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
    } else if (token.kind == TokenKind.IDENT && token.value == "signed") {
        isSigned = true
        skipTrivia(tokenizer, triviaList)
        token = tokenizer.next()
    }

    if (token.kind == TokenKind.IDENT && token.value == "struct") {
        skipTrivia(tokenizer, triviaList)
        token = tokenizer.next()
    }

    token = tryMergeLongSequences(token, tokenizer)

    if (token.kind != TokenKind.IDENT) {
        syntaxError("Expected identifier but got ${token.kind}", token)
    }

    var ty: RawType = RawIdentifierType(token.value, isUnsigned, isSigned, triviaList)
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

internal fun tryMergeLongSequences(token: Token, tokenizer: Tokenizer): Token {
    if (token.kind == TokenKind.IDENT && token.value == "long") {
        val nextToken = tokenizer.peek()
        if (nextToken.kind == TokenKind.IDENT && nextToken.value == "long") {
            tokenizer.next()
            val third = tokenizer.peek()
            if (third.kind == TokenKind.IDENT && (third.value == "int" || third.value == "double")) {
                tokenizer.next()
                return Token(TokenKind.IDENT, "long long ${third.value}", token.line, token.col)
            }
            return Token(TokenKind.IDENT, "long long", token.line, token.col)
        } else if (nextToken.kind == TokenKind.IDENT && (nextToken.value == "int" || nextToken.value == "double")) {
            tokenizer.next()
            return Token(TokenKind.IDENT, "long ${nextToken.value}", token.line, token.col)
        }
    }
    return token
}

internal fun parseSimpleExpr(tokenizer: Tokenizer, trivia: MutableList<String>): String {
    var isNegative = false

    skipTrivia(tokenizer, trivia)
    val peekedToken = tokenizer.peek()
    if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == "-") {
        isNegative = true
        tokenizer.next()
        skipTrivia(tokenizer, trivia)
    } else if (peekedToken.kind == TokenKind.SYMBOL && peekedToken.value == "+") {
        tokenizer.next()
        skipTrivia(tokenizer, trivia)
    }

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

    return if (isNegative) {
        "-$result"
    } else {
        result
    }
}
