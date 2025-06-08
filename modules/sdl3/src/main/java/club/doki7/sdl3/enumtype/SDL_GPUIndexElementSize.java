package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the size of elements in an index buffer.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUIndexElementSize {
    public static final int SDL_GPU_INDEXELEMENTSIZE_16BIT = 0x0;
    public static final int SDL_GPU_INDEXELEMENTSIZE_32BIT = 0x1;

    public static String explain(@EnumType(SDL_GPUIndexElementSize.class) int value) {
        return switch (value) {
            case SDL_GPUIndexElementSize.SDL_GPU_INDEXELEMENTSIZE_16BIT -> "SDL_GPU_INDEXELEMENTSIZE_16BIT";
            case SDL_GPUIndexElementSize.SDL_GPU_INDEXELEMENTSIZE_32BIT -> "SDL_GPU_INDEXELEMENTSIZE_32BIT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUIndexElementSize() {}
}
