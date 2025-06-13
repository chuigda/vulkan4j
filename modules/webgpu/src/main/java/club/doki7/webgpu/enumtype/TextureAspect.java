package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class TextureAspect {
    public static final int TEXTURE_ASPECT_UNDEFINED = 0x0;
    public static final int TEXTURE_ASPECT_ALL = 0x1;
    public static final int TEXTURE_ASPECT_STENCIL_ONLY = 0x2;
    public static final int TEXTURE_ASPECT_DEPTH_ONLY = 0x3;
    public static final int TEXTURE_ASPECT_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(TextureAspect.class) int value) {
        return switch (value) {
            case TextureAspect.TEXTURE_ASPECT_ALL -> "TEXTURE_ASPECT_ALL";
            case TextureAspect.TEXTURE_ASPECT_DEPTH_ONLY -> "TEXTURE_ASPECT_DEPTH_ONLY";
            case TextureAspect.TEXTURE_ASPECT_FORCE32 -> "TEXTURE_ASPECT_FORCE32";
            case TextureAspect.TEXTURE_ASPECT_STENCIL_ONLY -> "TEXTURE_ASPECT_STENCIL_ONLY";
            case TextureAspect.TEXTURE_ASPECT_UNDEFINED -> "TEXTURE_ASPECT_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private TextureAspect() {}
}
