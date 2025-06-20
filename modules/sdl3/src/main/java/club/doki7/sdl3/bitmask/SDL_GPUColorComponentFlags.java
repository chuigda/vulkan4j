package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_GPUColorComponentFlags {
    public static final byte A = 0x8;
    public static final byte B = 0x4;
    public static final byte G = 0x2;
    public static final byte R = 0x1;

    public static String explain(@EnumType(SDL_GPUColorComponentFlags.class) byte flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & A) != 0) {
            detectedFlagBits.add("SDL_GPU_COLORCOMPONENT_A");
        }
        if ((flags & B) != 0) {
            detectedFlagBits.add("SDL_GPU_COLORCOMPONENT_B");
        }
        if ((flags & G) != 0) {
            detectedFlagBits.add("SDL_GPU_COLORCOMPONENT_G");
        }
        if ((flags & R) != 0) {
            detectedFlagBits.add("SDL_GPU_COLORCOMPONENT_R");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUColorComponentFlags() {}
}
