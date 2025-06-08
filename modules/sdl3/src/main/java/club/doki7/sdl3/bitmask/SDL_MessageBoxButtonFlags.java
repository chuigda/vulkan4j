package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_MessageBoxButtonFlags {
    public static final int ESCAPEKEY_DEFAULT = 0x2;
    public static final int RETURNKEY_DEFAULT = 0x1;

    public static String explain(@EnumType(SDL_MessageBoxButtonFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ESCAPEKEY_DEFAULT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT");
        }
        if ((flags & RETURNKEY_DEFAULT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_MessageBoxButtonFlags() {}
}
