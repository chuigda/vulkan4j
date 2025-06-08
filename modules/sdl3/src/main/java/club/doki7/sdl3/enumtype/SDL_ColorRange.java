package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Colorspace color range, as described by
/// https://www.itu.int/rec/R-REC-BT.2100-2-201807-I/en
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_ColorRange {
    public static final int UNKNOWN = 0x0;
    public static final int LIMITED = 0x1;
    public static final int FULL = 0x2;

    public static String explain(@EnumType(SDL_ColorRange.class) int value) {
        return switch (value) {
            case SDL_ColorRange.FULL -> "SDL_COLOR_RANGE_FULL";
            case SDL_ColorRange.LIMITED -> "SDL_COLOR_RANGE_LIMITED";
            case SDL_ColorRange.UNKNOWN -> "SDL_COLOR_RANGE_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ColorRange() {}
}
