package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_PenInputFlags {
    public static final int BUTTON_1 = 0x2;
    public static final int BUTTON_2 = 0x4;
    public static final int BUTTON_3 = 0x8;
    public static final int BUTTON_4 = 0x10;
    public static final int BUTTON_5 = 0x20;
    public static final int DOWN = 0x1;
    public static final int ERASER_TIP = 0x40000000;

    public static String explain(@EnumType(SDL_PenInputFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BUTTON_1) != 0) {
            detectedFlagBits.add("SDL_PEN_INPUT_BUTTON_1");
        }
        if ((flags & BUTTON_2) != 0) {
            detectedFlagBits.add("SDL_PEN_INPUT_BUTTON_2");
        }
        if ((flags & BUTTON_3) != 0) {
            detectedFlagBits.add("SDL_PEN_INPUT_BUTTON_3");
        }
        if ((flags & BUTTON_4) != 0) {
            detectedFlagBits.add("SDL_PEN_INPUT_BUTTON_4");
        }
        if ((flags & BUTTON_5) != 0) {
            detectedFlagBits.add("SDL_PEN_INPUT_BUTTON_5");
        }
        if ((flags & DOWN) != 0) {
            detectedFlagBits.add("SDL_PEN_INPUT_DOWN");
        }
        if ((flags & ERASER_TIP) != 0) {
            detectedFlagBits.add("SDL_PEN_INPUT_ERASER_TIP");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PenInputFlags() {}
}
