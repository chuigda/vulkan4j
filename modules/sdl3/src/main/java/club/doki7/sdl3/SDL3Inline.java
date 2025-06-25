package club.doki7.sdl3;

import club.doki7.ffm.annotation.Bitmask;
import club.doki7.ffm.annotation.EnumType;
import club.doki7.sdl3.datatype.ISDL_AtomicInt;
import club.doki7.sdl3.datatype.SDL_AudioSpec;
import club.doki7.sdl3.enumtype.SDL_AudioFormat;
import club.doki7.sdl3.enumtype.SDL_PixelFormat;

/// Macros and inline functions not processed by the code generator.
public interface SDL3Inline {
    static void atomicIncRef(SDL3 sdl, ISDL_AtomicInt atomicInt) {
        sdl.addAtomicInt(atomicInt, 1);
    }

    static boolean atomicDecRef(SDL3 sdl, ISDL_AtomicInt atomicInt) {
        return sdl.addAtomicInt(atomicInt, -1) == 1;
    }

    static int audioBitSize(@EnumType(SDL_AudioFormat.class) int x) {
        return x & SDL3.AUDIO_MASK_BITSIZE;
    }

    static int audioByteSize(@EnumType(SDL_AudioFormat.class) int x) {
        return audioBitSize(x) / 8;
    }

    static boolean audioIsFloat(@EnumType(SDL_AudioFormat.class) int x) {
        return (x & SDL3.AUDIO_MASK_FLOAT) != 0;
    }

    static boolean audioIsBigEndian(@EnumType(SDL_AudioFormat.class) int x) {
        return (x & SDL3.AUDIO_MASK_BIG_ENDIAN) != 0;
    }

    static boolean audioIsLittleEndian(@EnumType(SDL_AudioFormat.class) int x) {
        return !audioIsBigEndian(x);
    }

    static boolean audioIsSigned(@EnumType(SDL_AudioFormat.class) int x) {
        return (x & SDL3.AUDIO_MASK_SIGNED) != 0;
    }

    static boolean audioIsInt(@EnumType(SDL_AudioFormat.class) int x) {
        return !audioIsFloat(x);
    }

    static boolean audioIsUnsigned(@EnumType(SDL_AudioFormat.class) int x) {
        return !audioIsSigned(x);
    }

    static int audioFrameSize(SDL_AudioSpec audioSpec) {
        return audioByteSize(audioSpec.format()) * audioSpec.channels();
    }

    static int pixelFlag(@EnumType(SDL_PixelFormat.class) int pixelFormat) {
        return (pixelFormat >> 28) & 0xF;
    }

    static int pixelType(@EnumType(SDL_PixelFormat.class) int pixelFormat) {
        return (pixelFormat >> 24) & 0xF;
    }

    static int pixelOrder(@EnumType(SDL_PixelFormat.class) int pixelFormat) {
        return (pixelFormat >> 20) & 0xF;
    }

    static int pixelLayout(@EnumType(SDL_PixelFormat.class) int pixelFormat) {
        return (pixelFormat >> 16) & 0xF;
    }
}
