package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class TextureDimension {
    public static final int TEXTURE_DIMENSION_UNDEFINED = 0x0;
    public static final int TEXTURE_DIMENSION_1D = 0x1;
    public static final int TEXTURE_DIMENSION_2D = 0x2;
    public static final int TEXTURE_DIMENSION_3D = 0x3;
    public static final int TEXTURE_DIMENSION_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(TextureDimension.class) int value) {
        return switch (value) {
            case TextureDimension.TEXTURE_DIMENSION_1D -> "TEXTURE_DIMENSION_1D";
            case TextureDimension.TEXTURE_DIMENSION_2D -> "TEXTURE_DIMENSION_2D";
            case TextureDimension.TEXTURE_DIMENSION_3D -> "TEXTURE_DIMENSION_3D";
            case TextureDimension.TEXTURE_DIMENSION_FORCE32 -> "TEXTURE_DIMENSION_FORCE32";
            case TextureDimension.TEXTURE_DIMENSION_UNDEFINED -> "TEXTURE_DIMENSION_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private TextureDimension() {}
}
