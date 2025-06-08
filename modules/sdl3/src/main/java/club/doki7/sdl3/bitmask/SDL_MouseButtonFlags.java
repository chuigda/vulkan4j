package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_MouseButtonFlags {
    public static final int LMASK = 0x1;
    public static final int MMASK = 0x2;
    public static final int RMASK = 0x4;
    public static final int X1MASK = 0x8;
    public static final int X2MASK = 0x10;

    public static String explain(@EnumType(SDL_MouseButtonFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & LMASK) != 0) {
            detectedFlagBits.add("SDL_BUTTON_LMASK");
        }
        if ((flags & MMASK) != 0) {
            detectedFlagBits.add("SDL_BUTTON_MMASK");
        }
        if ((flags & RMASK) != 0) {
            detectedFlagBits.add("SDL_BUTTON_RMASK");
        }
        if ((flags & X1MASK) != 0) {
            detectedFlagBits.add("SDL_BUTTON_X1MASK");
        }
        if ((flags & X2MASK) != 0) {
            detectedFlagBits.add("SDL_BUTTON_X2MASK");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_MouseButtonFlags() {}
}
