package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Colorspace color type.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_ColorType {
    public static final int UNKNOWN = 0x0;
    public static final int RGB = 0x1;
    public static final int YCBCR = 0x2;

    public static String explain(@EnumType(SDL_ColorType.class) int value) {
        return switch (value) {
            case SDL_ColorType.RGB -> "SDL_COLOR_TYPE_RGB";
            case SDL_ColorType.UNKNOWN -> "SDL_COLOR_TYPE_UNKNOWN";
            case SDL_ColorType.YCBCR -> "SDL_COLOR_TYPE_YCBCR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ColorType() {}
}
