package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_GlobFlags {
    public static final int SDL_GLOB_CASEINSENSITIVE = 0x1;

    public static String explain(@EnumType(SDL_GlobFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_GLOB_CASEINSENSITIVE) != 0) {
            detectedFlagBits.add("SDL_GLOB_CASEINSENSITIVE");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GlobFlags() {}
}
