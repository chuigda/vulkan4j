package club.doki7.babel.test

import club.doki7.babel.cdecl.TokenType
import club.doki7.babel.cdecl.Tokenizer
import kotlin.test.Test
import kotlin.test.assertEquals

class TestTokenize {
    @Test
    fun test1() {
        val tokenizer = Tokenizer("""
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK =
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT,
        """.trimIndent().split("\n"), 0)

        val tokenTypes = listOf(
            TokenType.IDENT, TokenType.SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK', '='
            TokenType.IDENT, TokenType.SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT', '|'
            TokenType.IDENT, TokenType.SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT', '|'
            TokenType.IDENT, TokenType.SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT', '|'
            TokenType.IDENT, TokenType.SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT', ','
            TokenType.EOI
        )

        val tokenValues = listOf(
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK", "=",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT", "|",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT", "|",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT", "|",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT", ",",
            ""
        )

        var idx = 0
        while (true) {
            val token = tokenizer.next()
            assertEquals(tokenTypes[idx], token.type)
            assertEquals(tokenValues[idx], token.value)

            if (token.type == TokenType.EOI) {
                break
            }
            idx++
        }
    }
}
