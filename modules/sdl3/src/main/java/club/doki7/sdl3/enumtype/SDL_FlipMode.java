package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The flip mode.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_FlipMode {
    public static final int SDL_FLIP_NONE = 0x0;
    public static final int SDL_FLIP_HORIZONTAL = 0x1;
    public static final int SDL_FLIP_VERTICAL = 0x2;

    public static String explain(@EnumType(SDL_FlipMode.class) int value) {
        return switch (value) {
            case SDL_FlipMode.SDL_FLIP_HORIZONTAL -> "SDL_FLIP_HORIZONTAL";
            case SDL_FlipMode.SDL_FLIP_NONE -> "SDL_FLIP_NONE";
            case SDL_FlipMode.SDL_FLIP_VERTICAL -> "SDL_FLIP_VERTICAL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_FlipMode() {}
}
