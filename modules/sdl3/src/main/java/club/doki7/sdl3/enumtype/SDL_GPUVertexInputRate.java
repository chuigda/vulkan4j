package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the rate at which vertex attributes are pulled from buffers.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUVertexInputRate {
    public static final int SDL_GPU_VERTEXINPUTRATE_VERTEX = 0x0;
    public static final int SDL_GPU_VERTEXINPUTRATE_INSTANCE = 0x1;

    public static String explain(@EnumType(SDL_GPUVertexInputRate.class) int value) {
        return switch (value) {
            case SDL_GPUVertexInputRate.SDL_GPU_VERTEXINPUTRATE_INSTANCE -> "SDL_GPU_VERTEXINPUTRATE_INSTANCE";
            case SDL_GPUVertexInputRate.SDL_GPU_VERTEXINPUTRATE_VERTEX -> "SDL_GPU_VERTEXINPUTRATE_VERTEX";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUVertexInputRate() {}
}
