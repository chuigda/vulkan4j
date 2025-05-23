package club.doki7.babel.test

import club.doki7.babel.cdecl.FunctionDecl
import club.doki7.babel.cdecl.RawIdentifierType
import club.doki7.babel.cdecl.RawPointerType
import club.doki7.babel.cdecl.parseFunctionDecl
import club.doki7.babel.cdecl.parseStructFieldDecl
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestCDecl {
    @Test
    fun testParseFunctionDecl() {
        val sourceLines = """
            int foo(int a, int b); // interesting idea
            int bar(int a, int b);
        """.trimIndent().split("\n")

        val (functionDecl, nextLine) = parseFunctionDecl(sourceLines, 0)
        assertEquals(1, nextLine)

        val (functionDecl2, nextLine2) = parseFunctionDecl(sourceLines, 1)
        assertEquals(2, nextLine2)

        assertEquals("foo", functionDecl.functionName)
        assertEquals("bar", functionDecl2.functionName)

        fun checkDecl(functionDecl: FunctionDecl) {
            assertTrue { functionDecl.returnType is RawIdentifierType }
            assertEquals("int", (functionDecl.returnType as RawIdentifierType).ident)
            assertEquals(2, functionDecl.params.size)
            assertEquals("a", functionDecl.params[0].paramName)
            assertTrue { functionDecl.params[0].paramType is RawIdentifierType }
            assertEquals("int", (functionDecl.params[0].paramType as RawIdentifierType).ident)
            assertEquals("b", functionDecl.params[1].paramName)
            assertTrue { functionDecl.params[1].paramType is RawIdentifierType }
            assertEquals("int", (functionDecl.params[1].paramType as RawIdentifierType).ident)
        }

        checkDecl(functionDecl)
        checkDecl(functionDecl2)
    }

    @Test
    fun testParseComplicatedFunctionDecl() {
        val sourceLines = """
VMA_CALL_PRE VkResult VMA_CALL_POST vmaFlushAllocation(
    VmaAllocator VMA_NOT_NULL allocator,
    VmaAllocation VMA_NOT_NULL allocation,
    VkDeviceSize offset,
    VkDeviceSize size);
        """.trimIndent()

        val (functionDecl, nextLine) = parseFunctionDecl(sourceLines.split("\n"), 0)
        assertEquals(5, nextLine)
        assertEquals("vmaFlushAllocation", functionDecl.functionName)

        assertTrue { functionDecl.returnType is RawIdentifierType }
        assertEquals("VkResult", (functionDecl.returnType as RawIdentifierType).ident)

        assertEquals(4, functionDecl.params.size)
        assertEquals("allocator", functionDecl.params[0].paramName)
        assertTrue { functionDecl.params[0].paramType is RawIdentifierType }
        assertEquals("VmaAllocator", (functionDecl.params[0].paramType as RawIdentifierType).ident)
        assertEquals(1, functionDecl.params[0].paramType.syntaxTrivia.size)
        assertEquals("VMA_NOT_NULL", functionDecl.params[0].paramType.syntaxTrivia[0])

        assertEquals("allocation", functionDecl.params[1].paramName)
        assertTrue { functionDecl.params[1].paramType is RawIdentifierType }
        assertEquals("VmaAllocation", (functionDecl.params[1].paramType as RawIdentifierType).ident)
        assertEquals(1, functionDecl.params[1].paramType.syntaxTrivia.size)
        assertEquals("VMA_NOT_NULL", functionDecl.params[1].paramType.syntaxTrivia[0])

        assertEquals("offset", functionDecl.params[2].paramName)
        assertTrue { functionDecl.params[2].paramType is RawIdentifierType }
        assertEquals("VkDeviceSize", (functionDecl.params[2].paramType as RawIdentifierType).ident)
        assertEquals(0, functionDecl.params[2].paramType.syntaxTrivia.size)

        assertEquals("size", functionDecl.params[3].paramName)
        assertTrue { functionDecl.params[3].paramType is RawIdentifierType }
        assertEquals("VkDeviceSize", (functionDecl.params[3].paramType as RawIdentifierType).ident)
        assertEquals(0, functionDecl.params[3].paramType.syntaxTrivia.size)
    }

    @Test
    fun testParseStructFieldDecl() {
        val sourceLines = """
            const VkDeviceSize* VMA_NULLABLE VMA_LEN_IF_NOT_NULL("VkPhysicalDeviceMemoryProperties::memoryHeapCount") pHeapSizeLimit;
        """.trimIndent()

        val (fieldDecl, nextLine) = parseStructFieldDecl(sourceLines.split("\n"), 0)
        assertEquals(1, nextLine)

        assertEquals("pHeapSizeLimit", fieldDecl.fieldName)
        assertTrue { fieldDecl.fieldType is RawPointerType }
        assertTrue { (fieldDecl.fieldType as RawPointerType).pointee is RawIdentifierType }
        val ty = (fieldDecl.fieldType as RawPointerType).pointee as RawIdentifierType
        assertEquals("VkDeviceSize", ty.ident)
    }
}
