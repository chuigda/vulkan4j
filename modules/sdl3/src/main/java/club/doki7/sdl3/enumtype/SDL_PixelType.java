package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Pixel type.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_PixelType {
    public static final int UNKNOWN = 0x0;
    public static final int INDEX1 = 0x1;
    public static final int INDEX4 = 0x2;
    public static final int INDEX8 = 0x3;
    public static final int PACKED8 = 0x4;
    public static final int PACKED16 = 0x5;
    public static final int PACKED32 = 0x6;
    public static final int ARRAYU8 = 0x7;
    public static final int ARRAYU16 = 0x8;
    public static final int ARRAYU32 = 0x9;
    public static final int ARRAYF16 = 0xa;
    public static final int ARRAYF32 = 0xb;
    public static final int INDEX2 = 0xc;

    public static String explain(@EnumType(SDL_PixelType.class) int value) {
        return switch (value) {
            case SDL_PixelType.ARRAYF16 -> "SDL_PIXELTYPE_ARRAYF16";
            case SDL_PixelType.ARRAYF32 -> "SDL_PIXELTYPE_ARRAYF32";
            case SDL_PixelType.ARRAYU16 -> "SDL_PIXELTYPE_ARRAYU16";
            case SDL_PixelType.ARRAYU32 -> "SDL_PIXELTYPE_ARRAYU32";
            case SDL_PixelType.ARRAYU8 -> "SDL_PIXELTYPE_ARRAYU8";
            case SDL_PixelType.INDEX1 -> "SDL_PIXELTYPE_INDEX1";
            case SDL_PixelType.INDEX2 -> "SDL_PIXELTYPE_INDEX2";
            case SDL_PixelType.INDEX4 -> "SDL_PIXELTYPE_INDEX4";
            case SDL_PixelType.INDEX8 -> "SDL_PIXELTYPE_INDEX8";
            case SDL_PixelType.PACKED16 -> "SDL_PIXELTYPE_PACKED16";
            case SDL_PixelType.PACKED32 -> "SDL_PIXELTYPE_PACKED32";
            case SDL_PixelType.PACKED8 -> "SDL_PIXELTYPE_PACKED8";
            case SDL_PixelType.UNKNOWN -> "SDL_PIXELTYPE_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PixelType() {}
}
