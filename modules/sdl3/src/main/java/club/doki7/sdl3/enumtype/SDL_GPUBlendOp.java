package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the operator to be used when pixels in a render target are
/// blended with existing pixels in the texture.
///
/// The source color is the value written by the fragment shader. The
/// destination color is the value currently existing in the texture.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUBlendOp {
    public static final int SDL_GPU_BLENDOP_INVALID = 0x0;
    public static final int SDL_GPU_BLENDOP_ADD = 0x1;
    public static final int SDL_GPU_BLENDOP_SUBTRACT = 0x2;
    public static final int SDL_GPU_BLENDOP_REVERSE_SUBTRACT = 0x3;
    public static final int SDL_GPU_BLENDOP_MIN = 0x4;
    public static final int SDL_GPU_BLENDOP_MAX = 0x5;

    public static String explain(@EnumType(SDL_GPUBlendOp.class) int value) {
        return switch (value) {
            case SDL_GPUBlendOp.SDL_GPU_BLENDOP_ADD -> "SDL_GPU_BLENDOP_ADD";
            case SDL_GPUBlendOp.SDL_GPU_BLENDOP_INVALID -> "SDL_GPU_BLENDOP_INVALID";
            case SDL_GPUBlendOp.SDL_GPU_BLENDOP_MAX -> "SDL_GPU_BLENDOP_MAX";
            case SDL_GPUBlendOp.SDL_GPU_BLENDOP_MIN -> "SDL_GPU_BLENDOP_MIN";
            case SDL_GPUBlendOp.SDL_GPU_BLENDOP_REVERSE_SUBTRACT -> "SDL_GPU_BLENDOP_REVERSE_SUBTRACT";
            case SDL_GPUBlendOp.SDL_GPU_BLENDOP_SUBTRACT -> "SDL_GPU_BLENDOP_SUBTRACT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUBlendOp() {}
}
