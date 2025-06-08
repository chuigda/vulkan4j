package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Array component order, low byte -> high byte.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_ArrayOrder {
    public static final int SDL_ARRAYORDER_NONE = 0x0;
    public static final int SDL_ARRAYORDER_RGB = 0x1;
    public static final int SDL_ARRAYORDER_RGBA = 0x2;
    public static final int SDL_ARRAYORDER_ARGB = 0x3;
    public static final int SDL_ARRAYORDER_BGR = 0x4;
    public static final int SDL_ARRAYORDER_BGRA = 0x5;
    public static final int SDL_ARRAYORDER_ABGR = 0x6;

    public static String explain(@EnumType(SDL_ArrayOrder.class) int value) {
        return switch (value) {
            case SDL_ArrayOrder.SDL_ARRAYORDER_ABGR -> "SDL_ARRAYORDER_ABGR";
            case SDL_ArrayOrder.SDL_ARRAYORDER_ARGB -> "SDL_ARRAYORDER_ARGB";
            case SDL_ArrayOrder.SDL_ARRAYORDER_BGR -> "SDL_ARRAYORDER_BGR";
            case SDL_ArrayOrder.SDL_ARRAYORDER_BGRA -> "SDL_ARRAYORDER_BGRA";
            case SDL_ArrayOrder.SDL_ARRAYORDER_NONE -> "SDL_ARRAYORDER_NONE";
            case SDL_ArrayOrder.SDL_ARRAYORDER_RGB -> "SDL_ARRAYORDER_RGB";
            case SDL_ArrayOrder.SDL_ARRAYORDER_RGBA -> "SDL_ARRAYORDER_RGBA";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ArrayOrder() {}
}
