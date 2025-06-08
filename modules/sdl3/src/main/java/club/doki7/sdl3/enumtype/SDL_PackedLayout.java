package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Packed component layout.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_PackedLayout {
    public static final int NONE = 0x0;
    public static final int _332 = 0x1;
    public static final int _4444 = 0x2;
    public static final int _1555 = 0x3;
    public static final int _5551 = 0x4;
    public static final int _565 = 0x5;
    public static final int _8888 = 0x6;
    public static final int _2101010 = 0x7;
    public static final int _1010102 = 0x8;

    public static String explain(@EnumType(SDL_PackedLayout.class) int value) {
        return switch (value) {
            case SDL_PackedLayout._1010102 -> "SDL_PACKEDLAYOUT_1010102";
            case SDL_PackedLayout._1555 -> "SDL_PACKEDLAYOUT_1555";
            case SDL_PackedLayout._2101010 -> "SDL_PACKEDLAYOUT_2101010";
            case SDL_PackedLayout._332 -> "SDL_PACKEDLAYOUT_332";
            case SDL_PackedLayout._4444 -> "SDL_PACKEDLAYOUT_4444";
            case SDL_PackedLayout._5551 -> "SDL_PACKEDLAYOUT_5551";
            case SDL_PackedLayout._565 -> "SDL_PACKEDLAYOUT_565";
            case SDL_PackedLayout._8888 -> "SDL_PACKEDLAYOUT_8888";
            case SDL_PackedLayout.NONE -> "SDL_PACKEDLAYOUT_NONE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PackedLayout() {}
}
