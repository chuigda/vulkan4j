package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_GLContextFlag {
    public static final int SDL_GL_CONTEXT_DEBUG_FLAG = 0x1;
    public static final int SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG = 0x2;
    public static final int SDL_GL_CONTEXT_RESET_ISOLATION_FLAG = 0x8;
    public static final int SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG = 0x4;

    public static String explain(@EnumType(SDL_GLContextFlag.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_GL_CONTEXT_DEBUG_FLAG) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_DEBUG_FLAG");
        }
        if ((flags & SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_FORWARD_COMPATIBLE_FLAG");
        }
        if ((flags & SDL_GL_CONTEXT_RESET_ISOLATION_FLAG) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_RESET_ISOLATION_FLAG");
        }
        if ((flags & SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG) != 0) {
            detectedFlagBits.add("SDL_GL_CONTEXT_ROBUST_ACCESS_FLAG");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GLContextFlag() {}
}
