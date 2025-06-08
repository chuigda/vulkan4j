package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies a comparison operator for depth, stencil and sampler operations.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUCompareOp {
    public static final int INVALID = 0x0;
    public static final int NEVER = 0x1;
    public static final int LESS = 0x2;
    public static final int EQUAL = 0x3;
    public static final int LESS_OR_EQUAL = 0x4;
    public static final int GREATER = 0x5;
    public static final int NOT_EQUAL = 0x6;
    public static final int GREATER_OR_EQUAL = 0x7;
    public static final int ALWAYS = 0x8;

    public static String explain(@EnumType(SDL_GPUCompareOp.class) int value) {
        return switch (value) {
            case SDL_GPUCompareOp.ALWAYS -> "SDL_GPU_COMPAREOP_ALWAYS";
            case SDL_GPUCompareOp.EQUAL -> "SDL_GPU_COMPAREOP_EQUAL";
            case SDL_GPUCompareOp.GREATER -> "SDL_GPU_COMPAREOP_GREATER";
            case SDL_GPUCompareOp.GREATER_OR_EQUAL -> "SDL_GPU_COMPAREOP_GREATER_OR_EQUAL";
            case SDL_GPUCompareOp.INVALID -> "SDL_GPU_COMPAREOP_INVALID";
            case SDL_GPUCompareOp.LESS -> "SDL_GPU_COMPAREOP_LESS";
            case SDL_GPUCompareOp.LESS_OR_EQUAL -> "SDL_GPU_COMPAREOP_LESS_OR_EQUAL";
            case SDL_GPUCompareOp.NEVER -> "SDL_GPU_COMPAREOP_NEVER";
            case SDL_GPUCompareOp.NOT_EQUAL -> "SDL_GPU_COMPAREOP_NOT_EQUAL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUCompareOp() {}
}
