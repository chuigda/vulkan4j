package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class TextureAspect {
    public static final int UNDEFINED = 0x0;
    public static final int ALL = 0x1;
    public static final int STENCIL_ONLY = 0x2;
    public static final int DEPTH_ONLY = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(TextureAspect.class) int value) {
        return switch (value) {
            case TextureAspect.ALL -> "ALL";
            case TextureAspect.DEPTH_ONLY -> "DEPTH_ONLY";
            case TextureAspect.FORCE32 -> "FORCE32";
            case TextureAspect.STENCIL_ONLY -> "STENCIL_ONLY";
            case TextureAspect.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private TextureAspect() {}
}
