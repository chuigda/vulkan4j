package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Possible return values from the SDL_HitTest callback.
///
/// \threadsafety This function should only be called on the main thread.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_HitTest
///
public final class SDL_HitTestResult {
    public static final int NORMAL = 0x0;
    public static final int DRAGGABLE = 0x1;
    public static final int RESIZE_TOPLEFT = 0x2;
    public static final int RESIZE_TOP = 0x3;
    public static final int RESIZE_TOPRIGHT = 0x4;
    public static final int RESIZE_RIGHT = 0x5;
    public static final int RESIZE_BOTTOMRIGHT = 0x6;
    public static final int RESIZE_BOTTOM = 0x7;
    public static final int RESIZE_BOTTOMLEFT = 0x8;
    public static final int RESIZE_LEFT = 0x9;

    public static String explain(@EnumType(SDL_HitTestResult.class) int value) {
        return switch (value) {
            case SDL_HitTestResult.DRAGGABLE -> "SDL_HITTEST_DRAGGABLE";
            case SDL_HitTestResult.NORMAL -> "SDL_HITTEST_NORMAL";
            case SDL_HitTestResult.RESIZE_BOTTOM -> "SDL_HITTEST_RESIZE_BOTTOM";
            case SDL_HitTestResult.RESIZE_BOTTOMLEFT -> "SDL_HITTEST_RESIZE_BOTTOMLEFT";
            case SDL_HitTestResult.RESIZE_BOTTOMRIGHT -> "SDL_HITTEST_RESIZE_BOTTOMRIGHT";
            case SDL_HitTestResult.RESIZE_LEFT -> "SDL_HITTEST_RESIZE_LEFT";
            case SDL_HitTestResult.RESIZE_RIGHT -> "SDL_HITTEST_RESIZE_RIGHT";
            case SDL_HitTestResult.RESIZE_TOP -> "SDL_HITTEST_RESIZE_TOP";
            case SDL_HitTestResult.RESIZE_TOPLEFT -> "SDL_HITTEST_RESIZE_TOPLEFT";
            case SDL_HitTestResult.RESIZE_TOPRIGHT -> "SDL_HITTEST_RESIZE_TOPRIGHT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_HitTestResult() {}
}
