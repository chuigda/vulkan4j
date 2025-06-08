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
    public static final int SDL_GPU_STENCILOP_INVALID = 0x0;
    public static final int SDL_GPU_STENCILOP_KEEP = 0x1;
    public static final int SDL_GPU_STENCILOP_ZERO = 0x2;
    public static final int SDL_GPU_STENCILOP_REPLACE = 0x3;
    public static final int SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP = 0x4;
    public static final int SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP = 0x5;
    public static final int SDL_GPU_STENCILOP_INVERT = 0x6;
    public static final int SDL_GPU_STENCILOP_INCREMENT_AND_WRAP = 0x7;
    public static final int SDL_GPU_STENCILOP_DECREMENT_AND_WRAP = 0x8;

    public static String explain(@EnumType(SDL_GPUStencilOp.class) int value) {
        return switch (value) {
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP -> "SDL_GPU_STENCILOP_DECREMENT_AND_CLAMP";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_DECREMENT_AND_WRAP -> "SDL_GPU_STENCILOP_DECREMENT_AND_WRAP";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP -> "SDL_GPU_STENCILOP_INCREMENT_AND_CLAMP";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_INCREMENT_AND_WRAP -> "SDL_GPU_STENCILOP_INCREMENT_AND_WRAP";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_INVALID -> "SDL_GPU_STENCILOP_INVALID";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_INVERT -> "SDL_GPU_STENCILOP_INVERT";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_KEEP -> "SDL_GPU_STENCILOP_KEEP";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_REPLACE -> "SDL_GPU_STENCILOP_REPLACE";
            case SDL_GPUStencilOp.SDL_GPU_STENCILOP_ZERO -> "SDL_GPU_STENCILOP_ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUStencilOp() {}
}
