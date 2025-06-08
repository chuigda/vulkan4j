package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The preferred time format of the current system locale.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_GetDateTimeLocalePreferences
///
public final class SDL_TimeFormat {
    public static final int _24HR = 0x0;
    public static final int _12HR = 0x1;

    public static String explain(@EnumType(SDL_TimeFormat.class) int value) {
        return switch (value) {
            case SDL_TimeFormat._12HR -> "SDL_TIME_FORMAT_12HR";
            case SDL_TimeFormat._24HR -> "SDL_TIME_FORMAT_24HR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_TimeFormat() {}
}
