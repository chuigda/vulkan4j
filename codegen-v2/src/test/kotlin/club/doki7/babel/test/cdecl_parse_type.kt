package club.doki7.babel.test

import club.doki7.babel.cdecl.RawIdentifierType
import club.doki7.babel.cdecl.RawPointerType
import club.doki7.babel.cdecl.TokenKind
import club.doki7.babel.cdecl.Tokenizer
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
        assertEquals(1, type.syntaxTrivia.size)
        assertEquals("VMA_NOT_NULL", type.syntaxTrivia[0])
        assertTrue(type.const)

        val pointee = type.pointee as RawIdentifierType
        assertEquals("VmaAllocatorCreateInfo", pointee.ident)
        assertTrue(pointee.syntaxTrivia.isEmpty())

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
        assertEquals(2, type.syntaxTrivia.size)
        assertEquals("VMA_CALL_PRE", type.syntaxTrivia[0])
        assertEquals("VMA_CALL_POST", type.syntaxTrivia[1])

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
        assertEquals(0, type.syntaxTrivia.size)

        val pointee = type.pointee as RawIdentifierType
        assertEquals("short", pointee.ident)
        assertTrue(pointee.unsigned)
        assertEquals(0, type.pointee.syntaxTrivia.size)

        val nextToken = tokenizer.next()
        assertEquals(TokenKind.IDENT, nextToken.kind)
        assertEquals("red", nextToken.value)
    }
}
