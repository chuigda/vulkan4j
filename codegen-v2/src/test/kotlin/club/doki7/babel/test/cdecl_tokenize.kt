package club.doki7.babel.test

import club.doki7.babel.cdecl.TokenType
import club.doki7.babel.cdecl.Tokenizer
import kotlin.test.Test
import kotlin.test.assertEquals

import club.doki7.babel.cdecl.TokenType.*

class TestTokenize {
    private fun testTokenize(source: String, tokenTypes: List<TokenType>, tokenValues: List<String>) {
        val tokenizer = Tokenizer(source.split("\n"), 0)

        var idx = 0
        while (true) {
            val token = tokenizer.next()
            assertEquals(tokenTypes[idx], token.type)
            if (token.type == EOI) {
                break
            }

            if (tokenValues[idx].startsWith("@")) {
                val expectedValue = tokenValues[idx].substring(1).replace("\\s+".toRegex(), "").replace("\"", "")
                val actualValue = token.value.replace("\\s+".toRegex(), "").replace("\"", "")
                assertEquals(expectedValue, actualValue)
            } else {
                assertEquals(tokenValues[idx], token.value)
            }
            idx++
        }
    }

    @Test
    fun testEnumDecl() {
        val src = """
        VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK =
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT |
            VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT,
        """.trimIndent()

        val tokenTypes = listOf(
            IDENT, SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK', '='
            IDENT, SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT', '|'
            IDENT, SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT', '|'
            IDENT, SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT', '|'
            IDENT, SYMBOL, // 'VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT', ','
            EOI
        )

        val tokenValues = listOf(
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK", "=",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT", "|",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT", "|",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT", "|",
            "VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT", ",",
            ""
        )

        testTokenize(src, tokenTypes, tokenValues)
    }

    @Test
    fun testFunctionTypedef() {
        val src = """
            typedef void (VKAPI_PTR* PFN_vmaAllocateDeviceMemoryFunction)(
                VmaAllocator VMA_NOT_NULL                    allocator,
                uint32_t                                     memoryType,
                VkDeviceMemory VMA_NOT_NULL_NON_DISPATCHABLE memory,
                VkDeviceSize                                 size,
                void* VMA_NULLABLE                           pUserData);
        """.trimIndent()

        val tokenTypes = listOf(
            // 'typedef', 'void', '(', 'VKAPI_PTR', '*', 'PFN_vmaAllocateDeviceMemoryFunction', ')', '('
            IDENT, IDENT, SYMBOL, TRIVIA, SYMBOL, IDENT, SYMBOL, SYMBOL,
            // 'VmaAllocator, 'VMA_NOT_NULL', 'allocator', ',',
            IDENT, TRIVIA, IDENT, SYMBOL,
            // 'uint32_t', 'memoryType', ',',
            IDENT, IDENT, SYMBOL,
            // 'VkDeviceMemory', 'VMA_NOT_NULL_NON_DISPATCHABLE', 'memory', ',',
            IDENT, TRIVIA, IDENT, SYMBOL,
            // 'VkDeviceSize', 'size', ',',
            IDENT, IDENT, SYMBOL,
            // 'void', '*', 'VMA_NULLABLE', 'pUserData', ')', ';'
            IDENT, SYMBOL, TRIVIA, IDENT, SYMBOL, SYMBOL,
            EOI
        )

        val tokenValues = listOf(
            "typedef", "void", "(", "VKAPI_PTR", "*", "PFN_vmaAllocateDeviceMemoryFunction", ")", "(",
            "VmaAllocator", "VMA_NOT_NULL", "allocator", ",",
            "uint32_t", "memoryType", ",",
            "VkDeviceMemory", "VMA_NOT_NULL_NON_DISPATCHABLE", "memory", ",",
            "VkDeviceSize", "size", ",",
            "void", "*", "VMA_NULLABLE", "pUserData", ")", ";",
            ""
        )

        testTokenize(src, tokenTypes, tokenValues)
    }

    @Test
    fun testStructField() {
        val src = """
            const VkDeviceSize* VMA_NULLABLE VMA_LEN_IF_NOT_NULL("VkPhysicalDeviceMemoryProperties::memoryHeapCount") pHeapSizeLimit;
        """.trimIndent()

        val tokenTypes = listOf(
            // 'const', 'VkDeviceSize*', 'VMA_NULLABLE',
            IDENT, IDENT, SYMBOL, TRIVIA,
            // 'VMA_LEN_IF_NOT_NULL("...")',
            TRIVIA,
            // 'pHeapSizeLimit', ';'
            IDENT, SYMBOL,
            EOI
        )

        val tokenValues = listOf(
            "const", "VkDeviceSize", "*", "VMA_NULLABLE",
            "@VMA_LEN_IF_NOT_NULL(\"VkPhysicalDeviceMemoryProperties::memoryHeapCount\")",
            "pHeapSizeLimit", ";",
            ""
        )

        testTokenize(src, tokenTypes, tokenValues)
    }

    @Test
    fun testFunctionDef() {
        val src = """
            VMA_CALL_PRE void VMA_CALL_POST vmaGetPhysicalDeviceProperties(
                VmaAllocator VMA_NOT_NULL allocator,
                const VkPhysicalDeviceProperties* VMA_NULLABLE* VMA_NOT_NULL ppPhysicalDeviceProperties);
        """.trimIndent()

        val tokenTypes = listOf(
            // 'VMA_CALL_PRE', 'void', 'VMA_CALL_POST', 'vmaGetPhysicalDeviceProperties', '('
            TRIVIA, IDENT, TRIVIA, IDENT, SYMBOL,
            // 'VmaAllocator', 'VMA_NOT_NULL', 'allocator', ','
            IDENT, TRIVIA, IDENT, SYMBOL,
            // 'const', 'VkPhysicalDeviceProperties', '*', 'VMA_NULLABLE', '*', 'VMA_NOT_NULL', 'ppPhysicalDeviceProperties', ')', ';'
            IDENT, IDENT, SYMBOL, TRIVIA, SYMBOL, TRIVIA, IDENT, SYMBOL, SYMBOL,
            EOI
        )

        val tokenValues = listOf(
            "VMA_CALL_PRE", "void", "VMA_CALL_POST", "vmaGetPhysicalDeviceProperties", "(",
            "VmaAllocator", "VMA_NOT_NULL", "allocator", ",",
            "const", "VkPhysicalDeviceProperties", "*", "VMA_NULLABLE", "*", "VMA_NOT_NULL", "ppPhysicalDeviceProperties", ")", ";",
            ""
        )

        testTokenize(src, tokenTypes, tokenValues)
    }

    @Test
    fun testFunctionDef2() {
        val src = """
            VMA_CALL_PRE void VMA_CALL_POST vmaGetHeapBudgets(
                VmaAllocator VMA_NOT_NULL allocator,
                VmaBudget* VMA_NOT_NULL VMA_LEN_IF_NOT_NULL("VkPhysicalDeviceMemoryProperties::memoryHeapCount") pBudgets);
        """.trimIndent()

        val tokenTypes = listOf(
            // 'VMA_CALL_PRE', 'void', 'VMA_CALL_POST', 'vmaGetHeapBudgets', '('
            TRIVIA, IDENT, TRIVIA, IDENT, SYMBOL,
            // 'VmaAllocator', 'VMA_NOT_NULL', 'allocator', ','
            IDENT, TRIVIA, IDENT, SYMBOL,
            // 'VmaBudget', '*', 'VMA_NOT_NULL', 'VMA_LEN_IF_NOT_NULL("...")', 'pBudgets', ')', ';'
            IDENT, SYMBOL, TRIVIA, TRIVIA, IDENT, SYMBOL, SYMBOL,
            EOI
        )

        val tokenValues = listOf(
            "VMA_CALL_PRE", "void", "VMA_CALL_POST", "vmaGetHeapBudgets", "(",
            "VmaAllocator", "VMA_NOT_NULL", "allocator", ",",
            "VmaBudget", "*", "VMA_NOT_NULL", "@VMA_LEN_IF_NOT_NULL(\"VkPhysicalDeviceMemoryProperties::memoryHeapCount\")", "pBudgets", ")", ";",
            ""
        )

        testTokenize(src, tokenTypes, tokenValues)
    }
}
