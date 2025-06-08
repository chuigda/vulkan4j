package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Array component order, low byte -> high byte.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_ArrayOrder {
    public static final int NONE = 0x0;
    public static final int RGB = 0x1;
    public static final int RGBA = 0x2;
    public static final int ARGB = 0x3;
    public static final int BGR = 0x4;
    public static final int BGRA = 0x5;
    public static final int ABGR = 0x6;

    public static String explain(@EnumType(SDL_ArrayOrder.class) int value) {
        return switch (value) {
            case SDL_ArrayOrder.ABGR -> "SDL_ARRAYORDER_ABGR";
            case SDL_ArrayOrder.ARGB -> "SDL_ARRAYORDER_ARGB";
            case SDL_ArrayOrder.BGR -> "SDL_ARRAYORDER_BGR";
            case SDL_ArrayOrder.BGRA -> "SDL_ARRAYORDER_BGRA";
            case SDL_ArrayOrder.NONE -> "SDL_ARRAYORDER_NONE";
            case SDL_ArrayOrder.RGB -> "SDL_ARRAYORDER_RGB";
            case SDL_ArrayOrder.RGBA -> "SDL_ARRAYORDER_RGBA";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ArrayOrder() {}
}
