package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_GLContextReleaseFlag {
    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x1;
    public static final int SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE = 0x0;

    public static String explain(@EnumType(SDL_GLContextReleaseFlag.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH");
        }
        if ((flags & SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_RELEASE_BEHAVIOR_NONE");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GLContextReleaseFlag() {}
}
