package club.doki7.babel.test

import club.doki7.babel.util.commonPostfix
import club.doki7.babel.util.commonPrefix
import kotlin.test.Test
import kotlin.test.assertEquals

class TestCommonPrefixPostfix {
    @Test
    fun test1() {
        val strings = listOf(
            "LTO_SYMBOL_ALIGNMENT_MASK",
            "LTO_SYMBOL_PERMISSIONS_MASK",
            "LTO_SYMBOL_PERMISSIONS_CODE",
            "LTO_SYMBOL_DEFINITION_UNDEFINED",
            "LTO_SYMBOL_COMDAT"
        )

        assertEquals("LTO_SYMBOL_", commonPrefix(strings))
        assertEquals("", commonPostfix(strings))
    }

    @Test
    fun test2() {
        val strings = listOf(
            "LLVMBinaryTypeArchive",
            "LLVMBinaryTypeOffload",
            "LLVMBinaryTypeELF32L",
            "LLVMBinaryTypeELF64B",
            "LLVMBinaryTypeIR"
        )

        assertEquals("LLVMBinaryType", commonPrefix(strings))
        assertEquals("", commonPostfix(strings))
    }

    @Test
    fun test3() {
        val strings = listOf(
            "SDL_AUDIO_UNKNOWN",
            "SDL_AUDIO_U8",
            "SDL_AUDIO_S8",
            "SDL_AUDIO_S16LE",
            "SDL_AUDIO_S16BE",
            "SDL_AUDIO_S32LE",
            "SDL_AUDIO_S32BE",
            "SDL_AUDIO_F32LE",
            "SDL_AUDIO_F32BE",
        )

        assertEquals("SDL_AUDIO_", commonPrefix(strings))
        assertEquals("", commonPostfix(strings))
    }

    @Test
    fun testPostfix1() {
        val strings = listOf(
            "LLVMMDStringMetadataKind",
            "LLVMDIDerivedTypeMetadataKind",
            "LLVMDITemplateValueParameterMetadataKind",
            "LLVMDIArgListMetadataKind",
            "LLVMDIAssignIDMetadataKind"
        )

        assertEquals("LLVM", commonPrefix(strings))
        assertEquals("MetadataKind", commonPostfix(strings))
    }
}
