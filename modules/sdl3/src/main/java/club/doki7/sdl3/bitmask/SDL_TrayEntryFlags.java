package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_TrayEntryFlags {
    public static final int BUTTON = 0x1;
    public static final int CHECKBOX = 0x2;
    public static final int CHECKED = 0x40000000;
    public static final int DISABLED = 0x80000000;
    public static final int SUBMENU = 0x4;

    public static String explain(@EnumType(SDL_TrayEntryFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BUTTON) != 0) {
            detectedFlagBits.add("SDL_TRAYENTRY_BUTTON");
        }
        if ((flags & CHECKBOX) != 0) {
            detectedFlagBits.add("SDL_TRAYENTRY_CHECKBOX");
        }
        if ((flags & CHECKED) != 0) {
            detectedFlagBits.add("SDL_TRAYENTRY_CHECKED");
        }
        if ((flags & DISABLED) != 0) {
            detectedFlagBits.add("SDL_TRAYENTRY_DISABLED");
        }
        if ((flags & SUBMENU) != 0) {
            detectedFlagBits.add("SDL_TRAYENTRY_SUBMENU");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_TrayEntryFlags() {}
}
