package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies how the contents of a texture attached to a render pass are
/// treated at the beginning of the render pass.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_BeginGPURenderPass
///
public final class SDL_GPULoadOp {
    public static final int SDL_GPU_LOADOP_LOAD = 0x0;
    public static final int SDL_GPU_LOADOP_CLEAR = 0x1;
    public static final int SDL_GPU_LOADOP_DONT_CARE = 0x2;

    public static String explain(@EnumType(SDL_GPULoadOp.class) int value) {
        return switch (value) {
            case SDL_GPULoadOp.SDL_GPU_LOADOP_CLEAR -> "SDL_GPU_LOADOP_CLEAR";
            case SDL_GPULoadOp.SDL_GPU_LOADOP_DONT_CARE -> "SDL_GPU_LOADOP_DONT_CARE";
            case SDL_GPULoadOp.SDL_GPU_LOADOP_LOAD -> "SDL_GPU_LOADOP_LOAD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPULoadOp() {}
}
