package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Bitmap pixel order, high bit -&amp;gt; low bit.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_BitmapOrder {
    public static final int NONE = 0x0;
    public static final int _4321 = 0x1;
    public static final int _1234 = 0x2;

    public static String explain(@EnumType(SDL_BitmapOrder.class) int value) {
        return switch (value) {
            case SDL_BitmapOrder._1234 -> "SDL_BITMAPORDER_1234";
            case SDL_BitmapOrder._4321 -> "SDL_BITMAPORDER_4321";
            case SDL_BitmapOrder.NONE -> "SDL_BITMAPORDER_NONE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_BitmapOrder() {}
}
