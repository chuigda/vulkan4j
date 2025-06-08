package club.doki7.sdl3;

import club.doki7.sdl3.datatype.ISDL_AtomicInt;

/// Macros and inline functions not processed by the code generator.
public final class SDL3Util {
    public void atomicIncRef(SDL3 sdl, ISDL_AtomicInt atomicInt) {
        sdl.addAtomicInt(atomicInt, 1);
    }

    public boolean atomicDecRef(SDL3 sdl, ISDL_AtomicInt atomicInt) {
        return sdl.addAtomicInt(atomicInt, -1) == 1;
    }

    public int audioBitSize(int x) {
        return x & SDL3.AUDIO_MASK_BITSIZE;
    }
}
