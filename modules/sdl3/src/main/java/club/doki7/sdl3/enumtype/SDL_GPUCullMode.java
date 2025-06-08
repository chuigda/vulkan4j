package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the facing direction in which triangle faces will be culled.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUCullMode {
    public static final int NONE = 0x0;
    public static final int FRONT = 0x1;
    public static final int BACK = 0x2;

    public static String explain(@EnumType(SDL_GPUCullMode.class) int value) {
        return switch (value) {
            case SDL_GPUCullMode.BACK -> "SDL_GPU_CULLMODE_BACK";
            case SDL_GPUCullMode.FRONT -> "SDL_GPU_CULLMODE_FRONT";
            case SDL_GPUCullMode.NONE -> "SDL_GPU_CULLMODE_NONE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUCullMode() {}
}
