package club.doki7.babel.test

import club.doki7.babel.cdecl.Tokenizer
import club.doki7.babel.cdecl.parseStructFieldDecl
import kotlin.test.Test

class TestParseStructField {
    @Test
    fun test1() {
        val tokenizer = Tokenizer(listOf("PFN_vmaCheckDefragmentationBreakFunction VMA_NULLABLE pfnBreakCallback;"), 0)
        val structFieldDecl = parseStructFieldDecl(tokenizer)

        println(structFieldDecl)
    }

    @Test
    fun test2() {
        val tokenizer = Tokenizer(listOf("VmaDetailedStatistics memoryType[VK_MAX_MEMORY_TYPES];"), 0)
        val structFieldDecl = parseStructFieldDecl(tokenizer)

        println(structFieldDecl)
    }
}
