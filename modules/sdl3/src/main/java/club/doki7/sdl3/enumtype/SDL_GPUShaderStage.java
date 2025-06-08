package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies which stage a shader program corresponds to.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_CreateGPUShader`
///
public final class SDL_GPUShaderStage {
    public static final int VERTEX = 0x0;
    public static final int FRAGMENT = 0x1;

    public static String explain(@EnumType(SDL_GPUShaderStage.class) int value) {
        return switch (value) {
            case SDL_GPUShaderStage.FRAGMENT -> "SDL_GPU_SHADERSTAGE_FRAGMENT";
            case SDL_GPUShaderStage.VERTEX -> "SDL_GPU_SHADERSTAGE_VERTEX";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUShaderStage() {}
}
