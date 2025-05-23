package club.doki7.babel.test

import club.doki7.babel.cdecl.parseFunctionDecl
import kotlin.test.Test
import kotlin.test.assertEquals

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
    }
}
