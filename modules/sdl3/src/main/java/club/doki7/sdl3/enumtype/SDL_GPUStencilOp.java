package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies what happens to a stored stencil value if stencil tests fail or
/// pass.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUStencilOp {
    public static final int INVALID = 0x0;
    public static final int KEEP = 0x1;
    public static final int ZERO = 0x2;
    public static final int REPLACE = 0x3;
    public static final int INCREMENT_AND_CLAMP = 0x4;
    public static final int DECREMENT_AND_CLAMP = 0x5;
    public static final int INVERT = 0x6;
    public static final int INCREMENT_AND_WRAP = 0x7;
    public static final int DECREMENT_AND_WRAP = 0x8;

    public static String explain(@EnumType(SDL_GPUStencilOp.class) int value) {
        return switch (value) {
            case SDL_GPUStencilOp.DECREMENT_AND_CLAMP -> "SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP";
            case SDL_GPUStencilOp.DECREMENT_AND_WRAP -> "SDL_GPU_STENCILOP_DECREMENT_AND_WRAP";
            case SDL_GPUStencilOp.INCREMENT_AND_CLAMP -> "SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP";
            case SDL_GPUStencilOp.INCREMENT_AND_WRAP -> "SDL_GPU_STENCILOP_INCREMENT_AND_WRAP";
            case SDL_GPUStencilOp.INVALID -> "SDL_GPU_STENCILOP_INVALID";
            case SDL_GPUStencilOp.INVERT -> "SDL_GPU_STENCILOP_INVERT";
            case SDL_GPUStencilOp.KEEP -> "SDL_GPU_STENCILOP_KEEP";
            case SDL_GPUStencilOp.REPLACE -> "SDL_GPU_STENCILOP_REPLACE";
            case SDL_GPUStencilOp.ZERO -> "SDL_GPU_STENCILOP_ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUStencilOp() {}
}
