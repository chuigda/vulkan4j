package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class TextureDimension {
    public static final int UNDEFINED = 0x0;
    public static final int 1D = 0x1;
    public static final int 2D = 0x2;
    public static final int 3D = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(TextureDimension.class) int value) {
        return switch (value) {
            case TextureDimension.1D -> "1D";
            case TextureDimension.2D -> "2D";
            case TextureDimension.3D -> "3D";
            case TextureDimension.FORCE32 -> "FORCE32";
            case TextureDimension.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private TextureDimension() {}
}
