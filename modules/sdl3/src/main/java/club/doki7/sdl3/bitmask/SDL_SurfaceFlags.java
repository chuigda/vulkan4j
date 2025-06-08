package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_SurfaceFlags {
    public static final int LOCKED = 0x4;
    public static final int LOCK_NEEDED = 0x2;
    public static final int PREALLOCATED = 0x1;
    public static final int SIMD_ALIGNED = 0x8;

    public static String explain(@EnumType(SDL_SurfaceFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & LOCKED) != 0) {
            detectedFlagBits.add("SDL_SURFACE_LOCKED");
        }
        if ((flags & LOCK_NEEDED) != 0) {
            detectedFlagBits.add("SDL_SURFACE_LOCK_NEEDED");
        }
        if ((flags & PREALLOCATED) != 0) {
            detectedFlagBits.add("SDL_SURFACE_PREALLOCATED");
        }
        if ((flags & SIMD_ALIGNED) != 0) {
            detectedFlagBits.add("SDL_SURFACE_SIMD_ALIGNED");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_SurfaceFlags() {}
}
