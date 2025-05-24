package club.doki7.babel.test

import club.doki7.babel.cdecl.RawArrayType
import club.doki7.babel.cdecl.RawIdentifierType
import club.doki7.babel.cdecl.Tokenizer
import club.doki7.babel.cdecl.parseStructFieldDecl
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestParseStructField {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("PFN_vmaCheckDefragmentationBreakFunction VMA_NULLABLE pfnBreakCallback;"), 0)
        val structFieldDecl = parseStructFieldDecl(tokenizer)

        assertEquals("pfnBreakCallback", structFieldDecl.name)
        assertTrue(structFieldDecl.syntaxTrivia.isEmpty())

        val type = structFieldDecl.type
        assertTrue(type is RawIdentifierType)
        assertEquals("PFN_vmaCheckDefragmentationBreakFunction", type.ident)
        assertEquals(1, type.syntaxTrivia.size)
        assertEquals("VMA_NULLABLE", type.syntaxTrivia[0])
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer(listOf("VmaDetailedStatistics memoryType[VK_MAX_MEMORY_TYPES];"), 0)
        val structFieldDecl = parseStructFieldDecl(tokenizer)

        assertEquals("memoryType", structFieldDecl.name)
        assertTrue(structFieldDecl.syntaxTrivia.isEmpty())
        val type = structFieldDecl.type
        assertTrue(type is RawArrayType)
        assertEquals("VK_MAX_MEMORY_TYPES", type.size)
        assertTrue(type.syntaxTrivia.isEmpty())
        val elementType = type.element
        assertTrue(elementType is RawIdentifierType)
        assertEquals("VmaDetailedStatistics", elementType.ident)
        assertTrue(elementType.syntaxTrivia.isEmpty())
    }
}
