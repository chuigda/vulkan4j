package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Colorspace definitions.
///
/// Since similar colorspaces may vary in their details (matrix, transfer
/// function, etc.), this is not an exhaustive list, but rather a
/// representative sample of the kinds of colorspaces supported in SDL.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_ColorPrimaries
/// \sa SDL_ColorRange
/// \sa SDL_ColorType
/// \sa SDL_MatrixCoefficients
/// \sa SDL_TransferCharacteristics
///
public final class SDL_Colorspace {
    public static final int SDL_COLORSPACE_UNKNOWN = 0x0;
    public static final int SDL_COLORSPACE_SRGB = 0x120005a0;
    public static final int SDL_COLORSPACE_SRGB_LINEAR = 0x12000500;
    public static final int SDL_COLORSPACE_HDR10 = 0x12002600;
    public static final int SDL_COLORSPACE_JPEG = 0x220004c6;
    public static final int SDL_COLORSPACE_BT601_LIMITED = 0x211018c6;
    public static final int SDL_COLORSPACE_BT601_FULL = 0x221018c6;
    public static final int SDL_COLORSPACE_BT709_LIMITED = 0x21100421;
    public static final int SDL_COLORSPACE_BT709_FULL = 0x22100421;
    public static final int SDL_COLORSPACE_BT2020_LIMITED = 0x21102609;
    public static final int SDL_COLORSPACE_BT2020_FULL = 0x22102609;
    public static final int SDL_COLORSPACE_RGB_DEFAULT = SDL_COLORSPACE_SRGB;
    public static final int SDL_COLORSPACE_YUV_DEFAULT = SDL_COLORSPACE_JPEG;

    public static String explain(@EnumType(SDL_Colorspace.class) int value) {
        return switch (value) {
            case SDL_Colorspace.SDL_COLORSPACE_BT2020_FULL -> "SDL_COLORSPACE_BT2020_FULL";
            case SDL_Colorspace.SDL_COLORSPACE_BT2020_LIMITED -> "SDL_COLORSPACE_BT2020_LIMITED";
            case SDL_Colorspace.SDL_COLORSPACE_BT601_FULL -> "SDL_COLORSPACE_BT601_FULL";
            case SDL_Colorspace.SDL_COLORSPACE_BT601_LIMITED -> "SDL_COLORSPACE_BT601_LIMITED";
            case SDL_Colorspace.SDL_COLORSPACE_BT709_FULL -> "SDL_COLORSPACE_BT709_FULL";
            case SDL_Colorspace.SDL_COLORSPACE_BT709_LIMITED -> "SDL_COLORSPACE_BT709_LIMITED";
            case SDL_Colorspace.SDL_COLORSPACE_HDR10 -> "SDL_COLORSPACE_HDR10";
            case SDL_Colorspace.SDL_COLORSPACE_JPEG -> "SDL_COLORSPACE_JPEG";
            case SDL_Colorspace.SDL_COLORSPACE_SRGB -> "SDL_COLORSPACE_SRGB";
            case SDL_Colorspace.SDL_COLORSPACE_SRGB_LINEAR -> "SDL_COLORSPACE_SRGB_LINEAR";
            case SDL_Colorspace.SDL_COLORSPACE_UNKNOWN -> "SDL_COLORSPACE_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_Colorspace() {}
}
