package club.doki7.babel.test

import club.doki7.babel.cdecl.RawArrayType
import club.doki7.babel.cdecl.RawFunctionType
import club.doki7.babel.cdecl.RawIdentifierType
import club.doki7.babel.cdecl.RawPointerType
import club.doki7.babel.cdecl.TokenKind
import club.doki7.babel.cdecl.Tokenizer
import club.doki7.babel.cdecl.parseEnumeratorDecl
import club.doki7.babel.cdecl.parseFunctionDecl
import club.doki7.babel.cdecl.parseInlineFunctionPointerField
import club.doki7.babel.cdecl.parseStructFieldDecl
import club.doki7.babel.cdecl.parseType
import club.doki7.babel.cdecl.parseTypedefDecl
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TestParseType {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("const VmaAllocatorCreateInfo* VMA_NOT_NULL pCreateInfo"), 0)
        val type = parseType(tokenizer)

        assertTrue(type is RawPointerType)
        assertTrue(type.pointee is RawIdentifierType)
        assertEquals(1, type.trivia.size)
        assertEquals("VMA_NOT_NULL", type.trivia[0])
        assertTrue(type.const)

        val pointee = type.pointee as RawIdentifierType
        assertEquals("VmaAllocatorCreateInfo", pointee.ident)
        assertTrue(pointee.trivia.isEmpty())

        val nextToken = tokenizer.next()
        assertEquals(TokenKind.IDENT, nextToken.kind)
        assertEquals("pCreateInfo", nextToken.value)
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer(listOf("VMA_CALL_PRE void VMA_CALL_POST vmaGetMemoryProperties("), 0)
        val type = parseType(tokenizer)

        assertTrue(type is RawIdentifierType)
        assertEquals("void", type.ident)
        assertEquals(2, type.trivia.size)
        assertEquals("VMA_CALL_PRE", type.trivia[0])
        assertEquals("VMA_CALL_POST", type.trivia[1])

        val nextToken = tokenizer.next()
        assertEquals(TokenKind.IDENT, nextToken.kind)
        assertEquals("vmaGetMemoryProperties", nextToken.value)
    }

    @Test
    fun test3() {
        val tokenizer = Tokenizer(listOf("unsigned short* red;"), 0)
        val type = parseType(tokenizer)

        assertTrue(type is RawPointerType)
        assertFalse(type.const)
        assertEquals(0, type.trivia.size)

        val pointee = type.pointee as RawIdentifierType
        assertEquals("short", pointee.ident)
        assertTrue(pointee.unsigned)
        assertEquals(0, type.pointee.trivia.size)

        val nextToken = tokenizer.next()
        assertEquals(TokenKind.IDENT, nextToken.kind)
        assertEquals("red", nextToken.value)
    }

    @Test
    fun test4() {
        val tokenizer = Tokenizer(listOf("signed short* blue;"), 0)
        val type = parseType(tokenizer)

        assertTrue(type is RawPointerType)
        assertFalse(type.const)
        assertEquals(0, type.trivia.size)

        val pointee = type.pointee as RawIdentifierType
        assertEquals("short", pointee.ident)
        assertTrue(pointee.signed)
        assertEquals(0, type.pointee.trivia.size)

        val nextToken = tokenizer.next()
        assertEquals(TokenKind.IDENT, nextToken.kind)
        assertEquals("blue", nextToken.value)
    }

    @Test
    fun test5() {
        val tokenizer = Tokenizer(listOf("AL_API void AL_APIENTRY alDistanceModel(ALenum distanceModel) AL_API_NOEXCEPT;"), 0)
        val type = parseType(tokenizer)

        assertTrue(type is RawIdentifierType)
        assertEquals("void", type.ident)
        assertEquals(2, type.trivia.size)
        assertEquals("AL_API", type.trivia[0])
        assertEquals("AL_APIENTRY", type.trivia[1])

        val nextToken = tokenizer.next()
        assertEquals(TokenKind.IDENT, nextToken.kind)
        assertEquals("alDistanceModel", nextToken.value)
    }
}

class TestParseStructField {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("PFN_vmaCheckDefragmentationBreakFunction VMA_NULLABLE pfnBreakCallback;"), 0)
        val declList = parseStructFieldDecl(tokenizer)
        assertEquals(1, declList.size)
        val structFieldDecl = declList[0]

        assertEquals("pfnBreakCallback", structFieldDecl.name)
        assertTrue(structFieldDecl.trivia.isEmpty())

        val type = structFieldDecl.type
        assertTrue(type is RawIdentifierType)
        assertEquals("PFN_vmaCheckDefragmentationBreakFunction", type.ident)
        assertEquals(1, type.trivia.size)
        assertEquals("VMA_NULLABLE", type.trivia[0])
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer(listOf("VmaDetailedStatistics memoryType[VK_MAX_MEMORY_TYPES];"), 0)
        val declList = parseStructFieldDecl(tokenizer)
        assertEquals(1, declList.size)
        val structFieldDecl = declList[0]

        assertEquals("memoryType", structFieldDecl.name)
        assertTrue(structFieldDecl.trivia.isEmpty())
        val type = structFieldDecl.type
        assertTrue(type is RawArrayType)
        assertEquals("VK_MAX_MEMORY_TYPES", type.size)
        assertTrue(type.trivia.isEmpty())
        val elementType = type.element
        assertTrue(elementType is RawIdentifierType)
        assertEquals("VmaDetailedStatistics", elementType.ident)
        assertTrue(elementType.trivia.isEmpty())
    }

    @Test
    fun test3() {
        val tokenizer = Tokenizer(listOf("Uint8 r, g, b;"), 0)
        val declList = parseStructFieldDecl(tokenizer)
        assertEquals(3, declList.size)

        for (i in 0 until 3) {
            val structFieldDecl = declList[i]
            when (i) {
                0 -> assertEquals("r", structFieldDecl.name)
                1 -> assertEquals("g", structFieldDecl.name)
                2 -> assertEquals("b", structFieldDecl.name)
            }
            assertTrue(structFieldDecl.trivia.isEmpty())
            val type = structFieldDecl.type
            assertTrue(type is RawIdentifierType)
            assertEquals("Uint8", type.ident)
            assertFalse(type.unsigned)
            assertTrue(type.trivia.isEmpty())
        }
    }
}

class TestParseEnumerator {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 0x00040000,"), 0)
        val enumeratorDecl = parseEnumeratorDecl(tokenizer)

        assertEquals("VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT", enumeratorDecl.name)
        assertEquals("0x00040000", enumeratorDecl.value)
        assertTrue(enumeratorDecl.trivia.isEmpty())

        assertEquals(TokenKind.EOI, tokenizer.next().kind)
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer("""
            VMA_ALLOCATION_CREATE_STRATEGY_MASK =
                VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT |
                VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT |
                VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT,
        """.trimIndent().split("\n"), 0)
        val enumeratorDecl = parseEnumeratorDecl(tokenizer)

        assertEquals("VMA_ALLOCATION_CREATE_STRATEGY_MASK", enumeratorDecl.name)
        assertEquals("VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT | VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT", enumeratorDecl.value)
        assertTrue(enumeratorDecl.trivia.isEmpty())

        assertEquals(TokenKind.EOI, tokenizer.next().kind)
    }

    @Test
    fun test3() {
        val tokenizer = Tokenizer("""
                VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
            } VmaAllocationCreateFlagBits;
        """.trimIndent().split("\n"), 0)
        val enumeratorDecl = parseEnumeratorDecl(tokenizer)

        assertEquals("VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM", enumeratorDecl.name)
        assertEquals("0x7FFFFFFF", enumeratorDecl.value)
        assertTrue(enumeratorDecl.trivia.isEmpty())

        val token = tokenizer.next()
        assertEquals(TokenKind.SYMBOL, token.kind)
        assertEquals("}", token.value)
    }
}

class TestParseFunctionDecl {
    @Test
    fun test1() {
        val tokenizer = Tokenizer("""
            VMA_CALL_PRE void VMA_CALL_POST vmaCalculateStatistics(
                VmaAllocator VMA_NOT_NULL allocator,
                VmaTotalStatistics* VMA_NOT_NULL pStats);
        """.trimIndent().split("\n"), 0)
        val functionDecl = parseFunctionDecl(tokenizer)

        assertEquals("vmaCalculateStatistics", functionDecl.name)
        assertTrue(functionDecl.trivia.isEmpty())

        val returnTy = functionDecl.returnType
        assertTrue(returnTy is RawIdentifierType)
        assertEquals("void", returnTy.ident)
        assertEquals(2, returnTy.trivia.size)
        assertEquals("VMA_CALL_PRE", returnTy.trivia[0])
        assertEquals("VMA_CALL_POST", returnTy.trivia[1])

        val params = functionDecl.params
        assertEquals(2, params.size)

        val firstParam = params[0]
        assertEquals("allocator", firstParam.name)
        assertTrue(firstParam.trivia.isEmpty())
        val firstParamType = firstParam.type
        assertTrue(firstParamType is RawIdentifierType)
        assertEquals("VmaAllocator", firstParamType.ident)
        assertEquals(1, firstParamType.trivia.size)
        assertEquals("VMA_NOT_NULL", firstParamType.trivia[0])

        val secondParam = params[1]
        assertEquals("pStats", secondParam.name)
        assertTrue(secondParam.trivia.isEmpty())
        val secondParamType = secondParam.type
        assertTrue(secondParamType is RawPointerType)
        assertTrue(secondParamType.pointee is RawIdentifierType)
        assertEquals("VmaTotalStatistics", (secondParamType.pointee as RawIdentifierType).ident)
        assertFalse(secondParamType.const)
        assertEquals(1, secondParamType.trivia.size)
        assertEquals("VMA_NOT_NULL", secondParamType.trivia[0])
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer("""
            VMA_CALL_PRE void VMA_CALL_POST vmaGetHeapBudgets(
                VmaAllocator VMA_NOT_NULL allocator,
                VmaBudget* VMA_NOT_NULL VMA_LEN_IF_NOT_NULL("VkPhysicalDeviceMemoryProperties::memoryHeapCount") pBudgets);
        """.trimIndent().split("\n"), 0)
        val functionDecl = parseFunctionDecl(tokenizer)

        assertEquals("vmaGetHeapBudgets", functionDecl.name)
        assertTrue(functionDecl.trivia.isEmpty())

        val returnTy = functionDecl.returnType
        assertTrue(returnTy is RawIdentifierType)
        assertEquals("void", returnTy.ident)
        assertEquals(2, returnTy.trivia.size)
        assertEquals("VMA_CALL_PRE", returnTy.trivia[0])
        assertEquals("VMA_CALL_POST", returnTy.trivia[1])

        val params = functionDecl.params
        assertEquals(2, params.size)

        val firstParam = params[0]
        assertEquals("allocator", firstParam.name)
        assertTrue(firstParam.trivia.isEmpty())
        val firstParamType = firstParam.type
        assertTrue(firstParamType is RawIdentifierType)
        assertEquals("VmaAllocator", firstParamType.ident)
        assertEquals(1, firstParamType.trivia.size)
        assertEquals("VMA_NOT_NULL", firstParamType.trivia[0])

        val secondParam = params[1]
        assertEquals("pBudgets", secondParam.name)
        assertTrue(secondParam.trivia.isEmpty())
        val secondParamType = secondParam.type
        assertTrue(secondParamType is RawPointerType)
        assertTrue(secondParamType.pointee is RawIdentifierType)
        assertEquals("VmaBudget", (secondParamType.pointee as RawIdentifierType).ident)
        assertFalse(secondParamType.const)
        assertEquals(2, secondParamType.trivia.size)
        assertEquals("VMA_NOT_NULL", secondParamType.trivia[0])
        assertTrue(secondParamType.trivia[1].contains("VMA_LEN_IF_NOT_NULL"))
        assertTrue(secondParamType.trivia[1].contains("VkPhysicalDeviceMemoryProperties::memoryHeapCount"))
    }

    @Test
    fun test3() {
        val tokenizer = Tokenizer("""
            VMA_CALL_PRE VkResult VMA_CALL_POST vmaFindMemoryTypeIndex(
                VmaAllocator VMA_NOT_NULL allocator,
                uint32_t memoryTypeBits,
                const VmaAllocationCreateInfo* VMA_NOT_NULL pAllocationCreateInfo,
                uint32_t* VMA_NOT_NULL pMemoryTypeIndex);
        """.trimIndent().split("\n"), 0)
        val functionDecl = parseFunctionDecl(tokenizer)

        assertEquals("vmaFindMemoryTypeIndex", functionDecl.name)
        assertTrue(functionDecl.trivia.isEmpty())

        val returnTy = functionDecl.returnType
        assertTrue(returnTy is RawIdentifierType)
        assertEquals("VkResult", returnTy.ident)
        assertEquals(2, returnTy.trivia.size)
        assertEquals("VMA_CALL_PRE", returnTy.trivia[0])
        assertEquals("VMA_CALL_POST", returnTy.trivia[1])

        val params = functionDecl.params
        assertEquals(4, params.size)

        val firstParam = params[0]
        assertEquals("allocator", firstParam.name)
        assertTrue(firstParam.trivia.isEmpty())
        val firstParamType = firstParam.type
        assertTrue(firstParamType is RawIdentifierType)
        assertEquals("VmaAllocator", firstParamType.ident)
        assertEquals(1, firstParamType.trivia.size)
        assertEquals("VMA_NOT_NULL", firstParamType.trivia[0])

        val secondParam = params[1]
        assertEquals("memoryTypeBits", secondParam.name)
        assertTrue(secondParam.trivia.isEmpty())
        val secondParamType = secondParam.type
        assertTrue(secondParamType is RawIdentifierType)
        assertEquals("uint32_t", secondParamType.ident)
        assertTrue(secondParamType.trivia.isEmpty())

        val thirdParam = params[2]
        assertEquals("pAllocationCreateInfo", thirdParam.name)
        assertTrue(thirdParam.trivia.isEmpty())
        val thirdParamType = thirdParam.type
        assertTrue(thirdParamType is RawPointerType)
        assertTrue(thirdParamType.const)
        assertTrue(thirdParamType.pointee is RawIdentifierType)
        assertEquals("VmaAllocationCreateInfo", (thirdParamType.pointee as RawIdentifierType).ident)
        assertEquals(1, thirdParamType.trivia.size)
        assertEquals("VMA_NOT_NULL", thirdParamType.trivia[0])

        val fourthParam = params[3]
        assertEquals("pMemoryTypeIndex", fourthParam.name)
        assertTrue(fourthParam.trivia.isEmpty())
        val fourthParamType = fourthParam.type
        assertTrue(fourthParamType is RawPointerType)
        assertFalse(fourthParamType.const)
        assertTrue(fourthParamType.pointee is RawIdentifierType)
        assertEquals("uint32_t", (fourthParamType.pointee as RawIdentifierType).ident)
        assertEquals(1, fourthParamType.trivia.size)
        assertEquals("VMA_NOT_NULL", fourthParamType.trivia[0])
    }
}

class TestParseTypedef {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("typedef VkFlags VmaVirtualBlockCreateFlags;"), 0)
        val typedefDecl = parseTypedefDecl(tokenizer)

        assertEquals("VmaVirtualBlockCreateFlags", typedefDecl.name)
        assertTrue(typedefDecl.aliasedType is RawIdentifierType)
        assertEquals("VkFlags", typedefDecl.aliasedType.ident)
        assertTrue(typedefDecl.trivia.isEmpty())

        val nextToken = tokenizer.next()
        assertEquals(TokenKind.EOI, nextToken.kind)
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer("""
            typedef void (VKAPI_PTR* PFN_vmaFreeDeviceMemoryFunction)(
                VmaAllocator VMA_NOT_NULL                    allocator,
                uint32_t                                     memoryType,
                VkDeviceMemory VMA_NOT_NULL_NON_DISPATCHABLE memory,
                VkDeviceSize                                 size,
                void* VMA_NULLABLE                           pUserData);
        """.trimIndent().split("\n"), 0)
        val typedefDecl = parseTypedefDecl(tokenizer)

        assertEquals("PFN_vmaFreeDeviceMemoryFunction", typedefDecl.name)
        assertTrue(typedefDecl.aliasedType is RawFunctionType)
        val functionType = typedefDecl.aliasedType

        assertTrue(functionType.returnType is RawIdentifierType)
        val returnType = functionType.returnType as RawIdentifierType
        assertEquals("void", returnType.ident)
        assertEquals(1, typedefDecl.trivia.size)
        assertTrue("VKAPI_PTR" in typedefDecl.trivia)

        assertEquals(5, functionType.params.size)

        val param1 = functionType.params[0]
        assertEquals("allocator", param1.first)
        assertTrue(param1.second is RawIdentifierType)
        val param1Type = param1.second as RawIdentifierType
        assertEquals("VmaAllocator", param1Type.ident)
        assertEquals(1, param1Type.trivia.size)
        assertEquals("VMA_NOT_NULL", param1Type.trivia[0])

        val param2 = functionType.params[1]
        assertEquals("memoryType", param2.first)
        assertTrue(param2.second is RawIdentifierType)
        val param2Type = param2.second as RawIdentifierType
        assertEquals("uint32_t", param2Type.ident)
        assertTrue(param2Type.trivia.isEmpty())

        val param3 = functionType.params[2]
        assertEquals("memory", param3.first)
        assertTrue(param3.second is RawIdentifierType)
        val param3Type = param3.second as RawIdentifierType
        assertEquals("VkDeviceMemory", param3Type.ident)
        assertEquals(1, param3Type.trivia.size)
        assertEquals("VMA_NOT_NULL_NON_DISPATCHABLE", param3Type.trivia[0])

        val param4 = functionType.params[3]
        assertEquals("size", param4.first)
        assertTrue(param4.second is RawIdentifierType)
        val param4Type = param4.second as RawIdentifierType
        assertEquals("VkDeviceSize", param4Type.ident)
        assertTrue(param4Type.trivia.isEmpty())

        val param5 = functionType.params[4]
        assertEquals("pUserData", param5.first)
        assertTrue(param5.second is RawPointerType)
        val param5Type = param5.second as RawPointerType
        assertFalse(param5Type.const)
        assertEquals(1, param5Type.trivia.size)
        assertEquals("VMA_NULLABLE", param5Type.trivia[0])

        assertTrue(param5Type.pointee is RawIdentifierType)
        val param5PointeeType = param5Type.pointee as RawIdentifierType
        assertEquals("void", param5PointeeType.ident)
        assertTrue(param5PointeeType.trivia.isEmpty())
    }

    @Test
    fun test3() {
        val tokenizer = Tokenizer(listOf("typedef void (* GLFWdropfun)(GLFWwindow* window, int path_count, const char* paths[]);"), 0)
        val typedefDecl = parseTypedefDecl(tokenizer)

        assertEquals("GLFWdropfun", typedefDecl.name)
        assertTrue(typedefDecl.aliasedType is RawFunctionType)
        assertTrue(typedefDecl.trivia.isEmpty())

        val functionType = typedefDecl.aliasedType
        assertTrue(functionType.trivia.isEmpty())

        // Assert return type: void
        assertTrue(functionType.returnType is RawIdentifierType)
        val returnType = functionType.returnType as RawIdentifierType
        assertEquals("void", returnType.ident)
        assertFalse(returnType.unsigned)
        assertTrue(returnType.trivia.isEmpty())

        // Assert parameters
        assertEquals(3, functionType.params.size)
        val params = functionType.params

        // Param 0: GLFWwindow* window
        assertEquals("window", params[0].first)
        assertTrue(params[0].second is RawPointerType)
        val param0Type = params[0].second as RawPointerType
        assertFalse(param0Type.const)
        assertTrue(param0Type.trivia.isEmpty())
        assertTrue(param0Type.pointee is RawIdentifierType)
        val param0Pointee = param0Type.pointee as RawIdentifierType
        assertEquals("GLFWwindow", param0Pointee.ident)
        assertFalse(param0Pointee.unsigned)
        assertTrue(param0Pointee.trivia.isEmpty())

        // Param 1: int path_count
        assertEquals("path_count", params[1].first)
        assertTrue(params[1].second is RawIdentifierType)
        val param1Type = params[1].second as RawIdentifierType
        assertEquals("int", param1Type.ident)
        assertFalse(param1Type.unsigned)
        assertTrue(param1Type.trivia.isEmpty())

        // Param 2: const char* paths[]
        assertEquals("paths", params[2].first)
        assertTrue(params[2].second is RawArrayType)
        val param2Type = params[2].second as RawArrayType
        assertEquals("", param2Type.size)
        assertTrue(param2Type.trivia.isEmpty())
        assertTrue(param2Type.element is RawPointerType)
        val param2ElementType = param2Type.element as RawPointerType
        assertTrue(param2ElementType.const)
        assertTrue(param2ElementType.trivia.isEmpty())
        assertTrue(param2ElementType.pointee is RawIdentifierType)
        val param2ElementPointee = param2ElementType.pointee as RawIdentifierType
        assertEquals("char", param2ElementPointee.ident)
        assertFalse(param2ElementPointee.unsigned)
        assertTrue(param2ElementPointee.trivia.isEmpty())

        assertEquals(TokenKind.EOI, tokenizer.next().kind)
    }

    @Test
    fun test4() {
        val tokenizer = Tokenizer(listOf("typedef void (* ALTestF)(ALuint*, long long int);"), 0)
        val typedefDecl = parseTypedefDecl(tokenizer)

        assertEquals("ALTestF", typedefDecl.name)
        assertTrue(typedefDecl.aliasedType is RawFunctionType)
        assertTrue(typedefDecl.trivia.isEmpty())

        val functionType = typedefDecl.aliasedType
        assertTrue(functionType.trivia.isEmpty())

        // Assert return type: void
        assertTrue(functionType.returnType is RawIdentifierType)
        val returnType = functionType.returnType as RawIdentifierType
        assertEquals("void", returnType.ident)
        assertFalse(returnType.unsigned)
        assertTrue(returnType.trivia.isEmpty())

        // Assert parameters
        assertEquals(2, functionType.params.size)
        val params = functionType.params

        // Param 0: ALuint*
        assertEquals("", params[0].first)
        assertTrue(params[0].second is RawPointerType)
        val param0Type = params[0].second as RawPointerType
        assertFalse(param0Type.const)
        assertTrue(param0Type.trivia.isEmpty())
        assertTrue(param0Type.pointee is RawIdentifierType)
        val param0Pointee = param0Type.pointee as RawIdentifierType
        assertEquals("ALuint", param0Pointee.ident)
        assertFalse(param0Pointee.unsigned)
        assertTrue(param0Pointee.trivia.isEmpty())

        // Param 1: long long int
        assertEquals("", params[1].first)
        assertTrue(params[1].second is RawIdentifierType)
        val param1Type = params[1].second as RawIdentifierType
        assertEquals("long long int", param1Type.ident)
        assertFalse(param1Type.unsigned)
        assertTrue(param1Type.trivia.isEmpty())

        assertEquals(TokenKind.EOI, tokenizer.next().kind)
    }
}

class TestParseInlineFunctionPointerField {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("Sint64 (SDLCALL *seek)(void *userdata, Sint64 offset, SDL_IOWhence whence);"), 0)
        val decl = parseInlineFunctionPointerField(tokenizer)

        assertEquals("seek", decl.name)
        assertEquals(1, decl.trivia.size)
        assertEquals("SDLCALL", decl.trivia[0])

        val type = decl.type
        assertTrue(type is RawFunctionType)

        assert(type.returnType is RawIdentifierType)
        val returnType = type.returnType as RawIdentifierType
        assertEquals("Sint64", returnType.ident)
        assertTrue(returnType.trivia.isEmpty())

        assert(type.params.size == 3)
        assertEquals("userdata", type.params[0].first)
        assertTrue(type.params[0].second is RawPointerType)
        val param0Type = type.params[0].second as RawPointerType
        assertFalse(param0Type.const)
        assertTrue(param0Type.trivia.isEmpty())
        assertTrue(param0Type.pointee is RawIdentifierType)
        val param0Pointee = param0Type.pointee as RawIdentifierType
        assertEquals("void", param0Pointee.ident)
        assertTrue(param0Pointee.trivia.isEmpty())

        assertEquals("offset", type.params[1].first)
        assertTrue(type.params[1].second is RawIdentifierType)
        val param1Type = type.params[1].second as RawIdentifierType
        assertEquals("Sint64", param1Type.ident)
        assertTrue(param1Type.trivia.isEmpty())

        assertEquals("whence", type.params[2].first)
        assertTrue(type.params[2].second is RawIdentifierType)
        val param2Type = type.params[2].second as RawIdentifierType
        assertEquals("SDL_IOWhence", param2Type.ident)
        assertTrue(param2Type.trivia.isEmpty())

        assertEquals(TokenKind.EOI, tokenizer.next().kind)
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer(listOf("size_t (SDLCALL *write)(void *userdata, const void *ptr, size_t size, SDL_IOStatus *status);"), 0)
        val decl = parseInlineFunctionPointerField(tokenizer)

        assertEquals("write", decl.name)
        assertEquals(1, decl.trivia.size)
        assertEquals("SDLCALL", decl.trivia[0])

        val type = decl.type
        assertTrue(type is RawFunctionType)

        assertTrue(type.returnType is RawIdentifierType)
        val returnType = type.returnType as RawIdentifierType
        assertEquals("size_t", returnType.ident)
        assertTrue(returnType.trivia.isEmpty())

        assertEquals(4, type.params.size)

        assertEquals("userdata", type.params[0].first)
        assertTrue(type.params[0].second is RawPointerType)
        val param0Type = type.params[0].second as RawPointerType
        assertFalse(param0Type.const)
        assertTrue(param0Type.trivia.isEmpty())
        assertTrue(param0Type.pointee is RawIdentifierType)
        val param0Pointee = param0Type.pointee as RawIdentifierType
        assertEquals("void", param0Pointee.ident)
        assertTrue(param0Pointee.trivia.isEmpty())

        assertEquals("ptr", type.params[1].first)
        assertTrue(type.params[1].second is RawPointerType)
        val param1Type = type.params[1].second as RawPointerType
        assertTrue(param1Type.const)
        assertTrue(param1Type.trivia.isEmpty())
        assertTrue(param1Type.pointee is RawIdentifierType)
        val param1Pointee = param1Type.pointee as RawIdentifierType
        assertEquals("void", param1Pointee.ident)
        assertTrue(param1Pointee.trivia.isEmpty())

        assertEquals("size", type.params[2].first)
        assertTrue(type.params[2].second is RawIdentifierType)
        val param2Type = type.params[2].second as RawIdentifierType
        assertEquals("size_t", param2Type.ident)
        assertTrue(param2Type.trivia.isEmpty())

        assertEquals("status", type.params[3].first)
        assertTrue(type.params[3].second is RawPointerType)
        val param3Type = type.params[3].second as RawPointerType
        assertFalse(param3Type.const)
        assertTrue(param3Type.trivia.isEmpty())
        assertTrue(param3Type.pointee is RawIdentifierType)
        val param3Pointee = param3Type.pointee as RawIdentifierType
        assertEquals("SDL_IOStatus", param3Pointee.ident)
        assertTrue(param3Pointee.trivia.isEmpty())

        assertEquals(TokenKind.EOI, tokenizer.next().kind)
    }
}
