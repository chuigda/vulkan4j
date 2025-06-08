package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the vertex winding that will cause a triangle to be determined to
/// be front-facing.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_CreateGPUGraphicsPipeline`
///
public final class SDL_GPUFrontFace {
    public static final int COUNTER_CLOCKWISE = 0x0;
    public static final int CLOCKWISE = 0x1;

    public static String explain(@EnumType(SDL_GPUFrontFace.class) int value) {
        return switch (value) {
            case SDL_GPUFrontFace.CLOCKWISE -> "SDL_GPU_FRONTFACE_CLOCKWISE";
            case SDL_GPUFrontFace.COUNTER_CLOCKWISE -> "SDL_GPU_FRONTFACE_COUNTER_CLOCKWISE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUFrontFace() {}
}
