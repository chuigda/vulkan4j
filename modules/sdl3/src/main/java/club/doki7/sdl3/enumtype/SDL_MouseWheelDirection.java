package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Scroll direction types for the Scroll event
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_MouseWheelDirection {
    public static final int NORMAL = 0x0;
    public static final int FLIPPED = 0x1;

    public static String explain(@EnumType(SDL_MouseWheelDirection.class) int value) {
        return switch (value) {
            case SDL_MouseWheelDirection.FLIPPED -> "SDL_MOUSEWHEEL_FLIPPED";
            case SDL_MouseWheelDirection.NORMAL -> "SDL_MOUSEWHEEL_NORMAL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_MouseWheelDirection() {}
}
