package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The preferred date format of the current system locale.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_GetDateTimeLocalePreferences
///
public final class SDL_DateFormat {
    public static final int SDL_DATE_FORMAT_YYYYMMDD = 0x0;
    public static final int SDL_DATE_FORMAT_DDMMYYYY = 0x1;
    public static final int SDL_DATE_FORMAT_MMDDYYYY = 0x2;

    public static String explain(@EnumType(SDL_DateFormat.class) int value) {
        return switch (value) {
            case SDL_DateFormat.SDL_DATE_FORMAT_DDMMYYYY -> "SDL_DATE_FORMAT_DDMMYYYY";
            case SDL_DateFormat.SDL_DATE_FORMAT_MMDDYYYY -> "SDL_DATE_FORMAT_MMDDYYYY";
            case SDL_DateFormat.SDL_DATE_FORMAT_YYYYMMDD -> "SDL_DATE_FORMAT_YYYYMMDD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_DateFormat() {}
}
