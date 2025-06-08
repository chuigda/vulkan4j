package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Possible results from an enumeration callback.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_EnumerateDirectoryCallback
///
public final class SDL_EnumerationResult {
    public static final int SDL_ENUM_CONTINUE = 0x0;
    public static final int SDL_ENUM_SUCCESS = 0x1;
    public static final int SDL_ENUM_FAILURE = 0x2;

    public static String explain(@EnumType(SDL_EnumerationResult.class) int value) {
        return switch (value) {
            case SDL_EnumerationResult.SDL_ENUM_CONTINUE -> "SDL_ENUM_CONTINUE";
            case SDL_EnumerationResult.SDL_ENUM_FAILURE -> "SDL_ENUM_FAILURE";
            case SDL_EnumerationResult.SDL_ENUM_SUCCESS -> "SDL_ENUM_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_EnumerationResult() {}
}
