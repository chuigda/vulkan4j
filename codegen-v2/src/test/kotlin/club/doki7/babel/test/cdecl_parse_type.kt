package club.doki7.babel.test

import club.doki7.babel.cdecl.RawIdentifierType
import club.doki7.babel.cdecl.RawPointerType
import club.doki7.babel.cdecl.TokenKind
import club.doki7.babel.cdecl.Tokenizer
import club.doki7.babel.cdecl.parseType
import kotlin.test.Test
import kotlin.test.assertEquals
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
}
