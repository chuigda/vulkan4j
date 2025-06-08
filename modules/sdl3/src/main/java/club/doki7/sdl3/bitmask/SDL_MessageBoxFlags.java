package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_MessageBoxFlags {
    public static final int SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT = 0x80;
    public static final int SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT = 0x100;
    public static final int SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT = 0x2;
    public static final int SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT = 0x1;
    public static final int SDL_MESSAGEBOX_ERROR = 0x10;
    public static final int SDL_MESSAGEBOX_INFORMATION = 0x40;
    public static final int SDL_MESSAGEBOX_WARNING = 0x20;

    public static String explain(@EnumType(SDL_MessageBoxFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT");
        }
        if ((flags & SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT");
        }
        if ((flags & SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT");
        }
        if ((flags & SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT");
        }
        if ((flags & SDL_MESSAGEBOX_ERROR) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_ERROR");
        }
        if ((flags & SDL_MESSAGEBOX_INFORMATION) != 0) {
            detectedFlagBits.add("SDL_MESSAGEBOX_INFORMATION");
        }
        if ((flags & SDL_MESSAGEBOX_WARNING) != 0) {
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
