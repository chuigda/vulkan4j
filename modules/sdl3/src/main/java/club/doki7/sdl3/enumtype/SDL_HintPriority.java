package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// An enumeration of hint priorities.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_HintPriority {
    public static final int SDL_HINT_DEFAULT = 0x0;
    public static final int SDL_HINT_NORMAL = 0x1;
    public static final int SDL_HINT_OVERRIDE = 0x2;

    public static String explain(@EnumType(SDL_HintPriority.class) int value) {
        return switch (value) {
            case SDL_HintPriority.SDL_HINT_DEFAULT -> "SDL_HINT_DEFAULT";
            case SDL_HintPriority.SDL_HINT_NORMAL -> "SDL_HINT_NORMAL";
            case SDL_HintPriority.SDL_HINT_OVERRIDE -> "SDL_HINT_OVERRIDE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_HintPriority() {}
}
