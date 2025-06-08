package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the fill mode of the graphics pipeline.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUFillMode {
    public static final int SDL_GPU_FILLMODE_FILL = 0x0;
    public static final int SDL_GPU_FILLMODE_LINE = 0x1;

    public static String explain(@EnumType(SDL_GPUFillMode.class) int value) {
        return switch (value) {
            case SDL_GPUFillMode.SDL_GPU_FILLMODE_FILL -> "SDL_GPU_FILLMODE_FILL";
            case SDL_GPUFillMode.SDL_GPU_FILLMODE_LINE -> "SDL_GPU_FILLMODE_LINE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUFillMode() {}
}
