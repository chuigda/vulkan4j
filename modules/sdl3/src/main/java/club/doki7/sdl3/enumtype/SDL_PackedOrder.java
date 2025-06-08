package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Packed component order, high bit -> low bit.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_PackedOrder {
    public static final int SDL_PACKEDORDER_NONE = 0x0;
    public static final int SDL_PACKEDORDER_XRGB = 0x1;
    public static final int SDL_PACKEDORDER_RGBX = 0x2;
    public static final int SDL_PACKEDORDER_ARGB = 0x3;
    public static final int SDL_PACKEDORDER_RGBA = 0x4;
    public static final int SDL_PACKEDORDER_XBGR = 0x5;
    public static final int SDL_PACKEDORDER_BGRX = 0x6;
    public static final int SDL_PACKEDORDER_ABGR = 0x7;
    public static final int SDL_PACKEDORDER_BGRA = 0x8;

    public static String explain(@EnumType(SDL_PackedOrder.class) int value) {
        return switch (value) {
            case SDL_PackedOrder.SDL_PACKEDORDER_ABGR -> "SDL_PACKEDORDER_ABGR";
            case SDL_PackedOrder.SDL_PACKEDORDER_ARGB -> "SDL_PACKEDORDER_ARGB";
            case SDL_PackedOrder.SDL_PACKEDORDER_BGRA -> "SDL_PACKEDORDER_BGRA";
            case SDL_PackedOrder.SDL_PACKEDORDER_BGRX -> "SDL_PACKEDORDER_BGRX";
            case SDL_PackedOrder.SDL_PACKEDORDER_NONE -> "SDL_PACKEDORDER_NONE";
            case SDL_PackedOrder.SDL_PACKEDORDER_RGBA -> "SDL_PACKEDORDER_RGBA";
            case SDL_PackedOrder.SDL_PACKEDORDER_RGBX -> "SDL_PACKEDORDER_RGBX";
            case SDL_PackedOrder.SDL_PACKEDORDER_XBGR -> "SDL_PACKEDORDER_XBGR";
            case SDL_PackedOrder.SDL_PACKEDORDER_XRGB -> "SDL_PACKEDORDER_XRGB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PackedOrder() {}
}
