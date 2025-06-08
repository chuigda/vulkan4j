package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// System theme.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_SystemTheme {
    public static final int UNKNOWN = 0x0;
    public static final int LIGHT = 0x1;
    public static final int DARK = 0x2;

    public static String explain(@EnumType(SDL_SystemTheme.class) int value) {
        return switch (value) {
            case SDL_SystemTheme.DARK -> "SDL_SYSTEM_THEME_DARK";
            case SDL_SystemTheme.LIGHT -> "SDL_SYSTEM_THEME_LIGHT";
            case SDL_SystemTheme.UNKNOWN -> "SDL_SYSTEM_THEME_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_SystemTheme() {}
}
