package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Colorspace color primaries, as described by
/// https://www.itu.int/rec/T-REC-H.273-201612-S/en
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_ColorPrimaries {
    public static final int SDL_COLOR_PRIMARIES_UNKNOWN = 0x0;
    public static final int SDL_COLOR_PRIMARIES_BT709 = 0x1;
    public static final int SDL_COLOR_PRIMARIES_UNSPECIFIED = 0x2;
    public static final int SDL_COLOR_PRIMARIES_BT470M = 0x4;
    public static final int SDL_COLOR_PRIMARIES_BT470BG = 0x5;
    public static final int SDL_COLOR_PRIMARIES_BT601 = 0x6;
    public static final int SDL_COLOR_PRIMARIES_SMPTE240 = 0x7;
    public static final int SDL_COLOR_PRIMARIES_GENERIC_FILM = 0x8;
    public static final int SDL_COLOR_PRIMARIES_BT2020 = 0x9;
    public static final int SDL_COLOR_PRIMARIES_XYZ = 0xa;
    public static final int SDL_COLOR_PRIMARIES_SMPTE431 = 0xb;
    public static final int SDL_COLOR_PRIMARIES_SMPTE432 = 0xc;
    public static final int SDL_COLOR_PRIMARIES_EBU3213 = 0x16;
    public static final int SDL_COLOR_PRIMARIES_CUSTOM = 0x1f;

    public static String explain(@EnumType(SDL_ColorPrimaries.class) int value) {
        return switch (value) {
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_BT2020 -> "SDL_COLOR_PRIMARIES_BT2020";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_BT470BG -> "SDL_COLOR_PRIMARIES_BT470BG";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_BT470M -> "SDL_COLOR_PRIMARIES_BT470M";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_BT601 -> "SDL_COLOR_PRIMARIES_BT601";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_BT709 -> "SDL_COLOR_PRIMARIES_BT709";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_CUSTOM -> "SDL_COLOR_PRIMARIES_CUSTOM";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_EBU3213 -> "SDL_COLOR_PRIMARIES_EBU3213";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_GENERIC_FILM -> "SDL_COLOR_PRIMARIES_GENERIC_FILM";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_SMPTE240 -> "SDL_COLOR_PRIMARIES_SMPTE240";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_SMPTE431 -> "SDL_COLOR_PRIMARIES_SMPTE431";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_SMPTE432 -> "SDL_COLOR_PRIMARIES_SMPTE432";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_UNKNOWN -> "SDL_COLOR_PRIMARIES_UNKNOWN";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_UNSPECIFIED -> "SDL_COLOR_PRIMARIES_UNSPECIFIED";
            case SDL_ColorPrimaries.SDL_COLOR_PRIMARIES_XYZ -> "SDL_COLOR_PRIMARIES_XYZ";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ColorPrimaries() {}
}
