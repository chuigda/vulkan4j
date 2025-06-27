package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUTextureAspect {
    public static final int UNDEFINED = 0x0;
    public static final int ALL = 0x1;
    public static final int STENCIL_ONLY = 0x2;
    public static final int DEPTH_ONLY = 0x3;

    public static String explain(@EnumType(WGPUTextureAspect.class) int value) {
        return switch (value) {
            case WGPUTextureAspect.ALL -> "ALL";
            case WGPUTextureAspect.DEPTH_ONLY -> "DEPTH_ONLY";
            case WGPUTextureAspect.STENCIL_ONLY -> "STENCIL_ONLY";
            case WGPUTextureAspect.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUTextureAspect() {}
}
