package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies a blending factor to be used when pixels in a render target are
/// blended with existing pixels in the texture.
///
/// The source color is the value written by the fragment shader. The
/// destination color is the value currently existing in the texture.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_CreateGPUGraphicsPipeline`
///
public final class SDL_GPUBlendFactor {
    public static final int INVALID = 0x0;
    public static final int ZERO = 0x1;
    public static final int ONE = 0x2;
    public static final int SRC_COLOR = 0x3;
    public static final int ONE_MINUS_SRC_COLOR = 0x4;
    public static final int DST_COLOR = 0x5;
    public static final int ONE_MINUS_DST_COLOR = 0x6;
    public static final int SRC_ALPHA = 0x7;
    public static final int ONE_MINUS_SRC_ALPHA = 0x8;
    public static final int DST_ALPHA = 0x9;
    public static final int ONE_MINUS_DST_ALPHA = 0xa;
    public static final int CONSTANT_COLOR = 0xb;
    public static final int ONE_MINUS_CONSTANT_COLOR = 0xc;
    public static final int SRC_ALPHA_SATURATE = 0xd;

    public static String explain(@EnumType(SDL_GPUBlendFactor.class) int value) {
        return switch (value) {
            case SDL_GPUBlendFactor.CONSTANT_COLOR -> "SDL_GPU_BLENDFACTOR_CONSTANT_COLOR";
            case SDL_GPUBlendFactor.DST_ALPHA -> "SDL_GPU_BLENDFACTOR_DST_ALPHA";
            case SDL_GPUBlendFactor.DST_COLOR -> "SDL_GPU_BLENDFACTOR_DST_COLOR";
            case SDL_GPUBlendFactor.INVALID -> "SDL_GPU_BLENDFACTOR_INVALID";
            case SDL_GPUBlendFactor.ONE -> "SDL_GPU_BLENDFACTOR_ONE";
            case SDL_GPUBlendFactor.ONE_MINUS_CONSTANT_COLOR -> "SDL_GPU_BLENDFACTOR_ONE_MINUS_CONSTANT_COLOR";
            case SDL_GPUBlendFactor.ONE_MINUS_DST_ALPHA -> "SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_ALPHA";
            case SDL_GPUBlendFactor.ONE_MINUS_DST_COLOR -> "SDL_GPU_BLENDFACTOR_ONE_MINUS_DST_COLOR";
            case SDL_GPUBlendFactor.ONE_MINUS_SRC_ALPHA -> "SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_ALPHA";
            case SDL_GPUBlendFactor.ONE_MINUS_SRC_COLOR -> "SDL_GPU_BLENDFACTOR_ONE_MINUS_SRC_COLOR";
            case SDL_GPUBlendFactor.SRC_ALPHA -> "SDL_GPU_BLENDFACTOR_SRC_ALPHA";
            case SDL_GPUBlendFactor.SRC_ALPHA_SATURATE -> "SDL_GPU_BLENDFACTOR_SRC_ALPHA_SATURATE";
            case SDL_GPUBlendFactor.SRC_COLOR -> "SDL_GPU_BLENDFACTOR_SRC_COLOR";
            case SDL_GPUBlendFactor.ZERO -> "SDL_GPU_BLENDFACTOR_ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUBlendFactor() {}
}
