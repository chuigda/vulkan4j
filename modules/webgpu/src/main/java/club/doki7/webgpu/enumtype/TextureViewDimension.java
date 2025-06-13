package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class TextureViewDimension {
    public static final int TEXTURE_VIEW_DIMENSION_UNDEFINED = 0x0;
    public static final int TEXTURE_VIEW_DIMENSION_1D = 0x1;
    public static final int TEXTURE_VIEW_DIMENSION_2D = 0x2;
    public static final int TEXTURE_VIEW_DIMENSION_2D_ARRAY = 0x3;
    public static final int TEXTURE_VIEW_DIMENSION_CUBE = 0x4;
    public static final int TEXTURE_VIEW_DIMENSION_CUBE_ARRAY = 0x5;
    public static final int TEXTURE_VIEW_DIMENSION_3D = 0x6;
    public static final int TEXTURE_VIEW_DIMENSION_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(TextureViewDimension.class) int value) {
        return switch (value) {
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_1D -> "TEXTURE_VIEW_DIMENSION_1D";
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_2D -> "TEXTURE_VIEW_DIMENSION_2D";
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_2D_ARRAY -> "TEXTURE_VIEW_DIMENSION_2D_ARRAY";
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_3D -> "TEXTURE_VIEW_DIMENSION_3D";
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_CUBE -> "TEXTURE_VIEW_DIMENSION_CUBE";
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_CUBE_ARRAY -> "TEXTURE_VIEW_DIMENSION_CUBE_ARRAY";
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_FORCE32 -> "TEXTURE_VIEW_DIMENSION_FORCE32";
            case TextureViewDimension.TEXTURE_VIEW_DIMENSION_UNDEFINED -> "TEXTURE_VIEW_DIMENSION_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private TextureViewDimension() {}
}
