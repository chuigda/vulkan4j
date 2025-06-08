package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_GLContextResetNotification {
    public static final int LOSE_CONTEXT = 0x1;
    public static final int NO_NOTIFICATION = 0x0;

    public static String explain(@EnumType(SDL_GLContextResetNotification.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & LOSE_CONTEXT) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_RESET_LOSE_CONTEXT");
        }
        if ((flags & NO_NOTIFICATION) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_RESET_NO_NOTIFICATION");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GLContextResetNotification() {}
}
