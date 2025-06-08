package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Packed component order, high bit -&amp;gt; low bit.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_PackedOrder {
    public static final int NONE = 0x0;
    public static final int XRGB = 0x1;
    public static final int RGBX = 0x2;
    public static final int ARGB = 0x3;
    public static final int RGBA = 0x4;
    public static final int XBGR = 0x5;
    public static final int BGRX = 0x6;
    public static final int ABGR = 0x7;
    public static final int BGRA = 0x8;

    public static String explain(@EnumType(SDL_PackedOrder.class) int value) {
        return switch (value) {
            case SDL_PackedOrder.ABGR -> "SDL_PACKEDORDER_ABGR";
            case SDL_PackedOrder.ARGB -> "SDL_PACKEDORDER_ARGB";
            case SDL_PackedOrder.BGRA -> "SDL_PACKEDORDER_BGRA";
            case SDL_PackedOrder.BGRX -> "SDL_PACKEDORDER_BGRX";
            case SDL_PackedOrder.NONE -> "SDL_PACKEDORDER_NONE";
            case SDL_PackedOrder.RGBA -> "SDL_PACKEDORDER_RGBA";
            case SDL_PackedOrder.RGBX -> "SDL_PACKEDORDER_RGBX";
            case SDL_PackedOrder.XBGR -> "SDL_PACKEDORDER_XBGR";
            case SDL_PackedOrder.XRGB -> "SDL_PACKEDORDER_XRGB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PackedOrder() {}
}
