package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Display orientation values; the way a display is rotated.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_DisplayOrientation {
    public static final int UNKNOWN = 0x0;
    public static final int LANDSCAPE = 0x1;
    public static final int LANDSCAPE_FLIPPED = 0x2;
    public static final int PORTRAIT = 0x3;
    public static final int PORTRAIT_FLIPPED = 0x4;

    public static String explain(@EnumType(SDL_DisplayOrientation.class) int value) {
        return switch (value) {
            case SDL_DisplayOrientation.LANDSCAPE -> "SDL_ORIENTATION_LANDSCAPE";
            case SDL_DisplayOrientation.LANDSCAPE_FLIPPED -> "SDL_ORIENTATION_LANDSCAPE_FLIPPED";
            case SDL_DisplayOrientation.PORTRAIT -> "SDL_ORIENTATION_PORTRAIT";
            case SDL_DisplayOrientation.PORTRAIT_FLIPPED -> "SDL_ORIENTATION_PORTRAIT_FLIPPED";
            case SDL_DisplayOrientation.UNKNOWN -> "SDL_ORIENTATION_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_DisplayOrientation() {}
}
