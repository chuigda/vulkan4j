package club.doki7.babel.test

import club.doki7.babel.cdecl.RawArrayType
import club.doki7.babel.cdecl.RawIdentifierType
import club.doki7.babel.cdecl.RawPointerType
import club.doki7.babel.cdecl.TokenKind
import club.doki7.babel.cdecl.Tokenizer
import club.doki7.babel.cdecl.parseEnumeratorDecl
import club.doki7.babel.cdecl.parseFunctionDecl
import club.doki7.babel.cdecl.parseStructFieldDecl
import club.doki7.babel.cdecl.parseType
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
}

class TestParseStructField {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("PFN_vmaCheckDefragmentationBreakFunction VMA_NULLABLE pfnBreakCallback;"), 0)
        val structFieldDecl = parseStructFieldDecl(tokenizer)

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
        val structFieldDecl = parseStructFieldDecl(tokenizer)

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
