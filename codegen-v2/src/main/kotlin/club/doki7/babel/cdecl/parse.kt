package club.doki7.babel.cdecl

// used for intermediate states
private data class EmptyType(override val syntaxTrivia: List<String> = emptyList()) : RawType

private class CParser(private val tokens: List<Token>) {
    private var pos = 0

    private val curToken: Token
        inline get() = tokens[pos]

    private fun expect(type: TokenType, value: String? = null) {
        if (curToken.type != type) {
            syntaxError("Expected token of type '$type' but found '${curToken.type}'", curToken)
        }
        if (value != null && curToken.value != value) {
            syntaxError("Expected '$value' but found '${curToken.value}'", curToken)
        }
    }

    private fun getAndSkipTrivia(): List<String> {
        val trivia = mutableListOf<String>()
        while (curToken.type == TokenType.TRIVIA) {
            trivia.add(curToken.value)
            pos++
        }
        return trivia
    }

    // declaration-specifiers :: type-qualifier* type-specifier*
    private fun parseDeclSpecifier(): RawType {
        val trivia = mutableListOf<String>()
        val modifiers = mutableListOf<String>()
        var typeName: String? = null
        while (true) {
            trivia.addAll(getAndSkipTrivia())
            when (curToken.type) {
                TokenType.QUALIFIER -> {
                    if (curToken.value == CONST || curToken.value == VOLATILE) {
                        modifiers.add(curToken.value)
                    } else {
                        syntaxError("unexpected qualifier", curToken)
                    }
                }
                TokenType.IDENT -> {
                    if (typeName != null) {
                        break
                    }
                    typeName = curToken.value
                }
                else -> {
                    break
                }
            }
            pos++
        }
        if (typeName == null) {
            syntaxError("expected type name", curToken)
        }
        return RawIdentifierType(typeName, modifiers, trivia)
    }

    // prefix-declarator :: '*' type-qualifier*
    private fun parsePrefixDeclarator(): RawType? {
        var trivia = mutableListOf<String>()
        var ty: RawPointerType? = null
        while (true) {
            trivia.addAll(getAndSkipTrivia())
            when (curToken.type) {
                TokenType.SYMBOL -> {
                    if (curToken.value == "*") {
                        ty = if (ty == null) {
                            RawPointerType(EmptyType(), const = false, volatile = false, syntaxTrivia = trivia)
                        } else {
                            RawPointerType(ty, const = false, volatile = false, syntaxTrivia = trivia)
                        }
                        trivia = mutableListOf()
                    } else {
                        break
                    }
                }
                TokenType.QUALIFIER -> {
                    if (ty == null) {
                        syntaxError("expected pointer before qualifier", curToken)
                    }
                    when (curToken.value) {
                        CONST -> ty.const = true
                        VOLATILE -> ty.volatile = true
                        else -> syntaxError("unexpected qualifier", curToken)
                    }
                }
                else -> break
            }
            pos++
        }
        return ty
    }

    private fun parseParameterList(): List<Pair<String, RawType>> {
        val params = mutableListOf<Pair<String, RawType>>()
        while (true) {
            if (curToken.type == TokenType.SYMBOL && curToken.value == ")") {
                break
            }
            params.add(parseDeclaration())
            if (curToken.type == TokenType.SYMBOL && curToken.value == ",") {
                pos++
            } else if (curToken.type == TokenType.SYMBOL && curToken.value == ")") {
                break
            } else {
                syntaxError("expected ',' or ')'", curToken)
            }
        }
        pos++
        return params
    }

    private fun parseArrayLength(): String {
        if (curToken.type != TokenType.INTEGER) {
            syntaxError("expected array length", curToken)
        }
        val length = curToken.value
        pos++
        expect(TokenType.SYMBOL, "]")
        return length
    }

    // direct-declarator :: identifier | (declarator) | direct-declarator [constant-expression?] | direct-declarator (parameter-type-list?)
    private fun parseDirectDeclarator(): Pair<String, RawType?> {
        var name = ""
        var ty: RawType? = null
        while (true) {
            val trivia = mutableListOf<String>()
            trivia.addAll(getAndSkipTrivia())
            when (curToken.type) {
                TokenType.IDENT -> {
                    if (name != "") {
                        syntaxError("unexpected identifier", curToken)
                    } else {
                        name = curToken.value
                    }
                }
                TokenType.SYMBOL -> {
                    when (curToken.value) {
                        "(" -> {
                            pos++
                            val curPos = pos
                            try {
                                val paramList = parseParameterList()
                                val funTy = RawFunctionType(
                                    functionName = name,
                                    returnType = EmptyType(),
                                    params = paramList,
                                    syntaxTrivia = trivia
                                )
                                ty = if (ty == null) {
                                    funTy
                                } else {
                                    fillInInnerType(ty, funTy)
                                    ty
                                }
                                continue // if function param parse ok, then continue to next loop
                            } catch (e: SyntaxError) {
                                if (ty != null) {
                                    throw e
                                }
                            }
                            // else it's a declarator within parentheses
                            pos = curPos
                            val (dname, dtype) = parseDeclarator()
                            expect(TokenType.SYMBOL, ")")
                            name = dname
                            ty = dtype
                        }
                        "[" -> {
                            val length = parseArrayLength()
                            ty = RawArrayType(
                                element = EmptyType(),
                                size = length,
                                syntaxTrivia = trivia
                            )
                        }
                        else -> break
                    }
                }
                else -> break
            }
            pos++
        }
        if (name == "" && ty == null) {
            syntaxError("expected identifier or type", curToken)
        }
        return name to ty
    }

    // declarator :: prefix-declarator direct-declarator
    private fun parseDeclarator(): Pair<String, RawType?> {
        val origPos = pos
        val prefixTy = parsePrefixDeclarator()
        if (prefixTy == null) {
            pos = origPos
        }
        val (name, directTy) = parseDirectDeclarator()
        val ty = if (directTy != null) {
            if (prefixTy != null) {
                fillInInnerType(directTy, prefixTy)
            }
            directTy
        } else {
            prefixTy
        }
        return name to ty
    }

    private fun fillInInnerType(ty: RawType, innerType: RawType) {
        var curTy = ty
        while (true) {
            when (curTy) {
                is RawPointerType -> {
                    if (curTy.pointee is EmptyType) {
                        curTy.pointee = innerType
                        break
                    } else {
                        curTy = curTy.pointee
                    }
                }
                is RawArrayType -> {
                    if (curTy.element is EmptyType) {
                        curTy.element = innerType
                        break
                    } else {
                        curTy = curTy.element
                    }
                }
                is RawFunctionType -> {
                    if (curTy.returnType is EmptyType) {
                        curTy.returnType = innerType
                        break
                    } else {
                        curTy = curTy.returnType
                    }
                }
                else -> {
                    throw Exception("internal: nothing to fill in")
                }
            }
        }
    }

    // declaration :: declaration-specifiers declarator?
    fun parseDeclaration(): Pair<String, RawType> {
        val declType = parseDeclSpecifier()
        val (name, directType) = parseDeclarator()
        val resultType = if (directType != null) {
            when (directType) {
                is RawPointerType, is RawArrayType, is RawFunctionType -> {
                    fillInInnerType(directType, declType)
                    directType
                }
                else -> {
                    syntaxError("invalid type, expected pointer, array, or function", curToken)
                }
            }
        } else {
            declType
        }
        return Pair(name, resultType)
    }

    fun parseTypedefDecl(): Pair<String, RawType> {
        expect(TokenType.KEYWORD, TYPEDEF)
        pos++
        return parseDeclaration()
    }

    fun parseEnumeratorDecl(): EnumeratorDecl {
        val trivia = mutableListOf<String>()
        trivia.addAll(getAndSkipTrivia())
        expect(TokenType.IDENT)
        val name = curToken.value
        pos++
        trivia.addAll(getAndSkipTrivia())
        expect(TokenType.SYMBOL, "=")
        pos++
        trivia.addAll(getAndSkipTrivia())
        if (curToken.type != TokenType.INTEGER && curToken.type != TokenType.IDENT) {
            syntaxError("expected integer or identifier", curToken)
        }
        val value = curToken.value
        pos++
        trivia.addAll(getAndSkipTrivia())
        if (curToken.type != TokenType.SYMBOL || curToken.value != ",") {
            syntaxError("expected ','", curToken)
        }
        return EnumeratorDecl(
            name = name,
            value = value,
            syntaxTrivia = trivia
        )
    }
}

fun parseStructFieldDecl(source: List<String>, startLine: Int): Pair<StructFieldDecl, Int> {
    val (tokens, lastLine) = CTokenizer(source, startLine).tokenize(',')
    val (name, ty) = CParser(tokens).parseDeclaration()
    return Pair(
        StructFieldDecl(
            fieldName = name,
            fieldType = ty,
            syntaxTrivia = emptyList()
        ),
        lastLine
    )
}

fun parseFunctionDecl(source: List<String>, startLine: Int): Pair<FunctionDecl, Int> {
    val (tokens, lastLine) = CTokenizer(source, startLine).tokenize(';')
    val (name, ty) = CParser(tokens).parseDeclaration()
    return Pair(
        FunctionDecl(
            functionName = name,
            returnType = ty,
            params = emptyList(),
            syntaxTrivia = emptyList()
        ),
        lastLine
    )
}

fun parseTypedefDecl(source: List<String>, startLine: Int): Pair<TypedefDecl, Int> {
    val (tokens, lastLine) = CTokenizer(source, startLine).tokenize(';')
    val (name, ty) = CParser(tokens).parseTypedefDecl()
    return Pair(
        TypedefDecl(
            typeName = name,
            aliasedType = ty,
            syntaxTrivia = emptyList()
        ),
        lastLine
    )
}

fun parseEnumeratorDecl(source: List<String>, startLine: Int): Pair<EnumeratorDecl, Int> {
    val (tokens, lastLine) = CTokenizer(source, startLine).tokenize(',', true)
    val (name, ty) = CParser(tokens).parseEnumeratorDecl()
    return Pair(
        EnumeratorDecl(
            name = name,
            value = ty,
            syntaxTrivia = emptyList()
        ),
        lastLine
    )
}

fun main() {
    // val source = """
    //     VMA_CALL_PRE VkResult VMA_CALL_POST vmaFlushAllocations(
    //         VmaAllocator VMA_NOT_NULL allocator,
    //         uint32_t allocationCount,
    //         const VmaAllocation VMA_NOT_NULL* VMA_NULLABLE VMA_LEN_IF_NOT_NULL(allocationCount) allocations,
    //         const VkDeviceSize* VMA_NULLABLE VMA_LEN_IF_NOT_NULL(allocationCount) offsets,
    //         const VkDeviceSize* VMA_NULLABLE VMA_LEN_IF_NOT_NULL(allocationCount) sizes);
    // """.trimIndent().split('\n')
    val source = """void (VKAPI_PTR* PFN_vmaAllocateDeviceMemoryFunction)(
    VmaAllocator VMA_NOT_NULL                    allocator,
    uint32_t                                     memoryType,
    VkDeviceMemory VMA_NOT_NULL_NON_DISPATCHABLE memory,
    VkDeviceSize                                 size,
    void* VMA_NULLABLE                           pUserData);""".trimIndent().split("\n")
    val (tokens, lastLine) = CTokenizer(source, 0).tokenize(';')
    val (name, ty) = CParser(tokens).parseDeclaration()
    println("name: $name, type: $ty")
}
