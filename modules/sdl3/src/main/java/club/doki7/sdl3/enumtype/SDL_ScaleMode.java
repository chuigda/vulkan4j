package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The scaling mode.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_ScaleMode {
    public static final int INVALID = 0xffffffff;
    public static final int NEAREST = 0x1;
    public static final int LINEAR = 0x2;

    public static String explain(@EnumType(SDL_ScaleMode.class) int value) {
        return switch (value) {
            case SDL_ScaleMode.INVALID -> "SDL_SCALEMODE_INVALID";
            case SDL_ScaleMode.LINEAR -> "SDL_SCALEMODE_LINEAR";
            case SDL_ScaleMode.NEAREST -> "SDL_SCALEMODE_NEAREST";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ScaleMode() {}
}
