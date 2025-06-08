package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_MessageBoxFlags {
    public static final int BUTTONS_LEFT_TO_RIGHT = 0x80;
    public static final int BUTTONS_RIGHT_TO_LEFT = 0x100;
    public static final int ERROR = 0x10;
    public static final int INFORMATION = 0x40;
    public static final int WARNING = 0x20;

    public static String explain(@EnumType(SDL_MessageBoxFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BUTTONS_LEFT_TO_RIGHT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT");
        }
        if ((flags & BUTTONS_RIGHT_TO_LEFT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT");
        }
        if ((flags & ERROR) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_ERROR");
        }
        if ((flags & INFORMATION) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_INFORMATION");
        }
        if ((flags & WARNING) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_WARNING");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_MessageBoxFlags() {}
}
