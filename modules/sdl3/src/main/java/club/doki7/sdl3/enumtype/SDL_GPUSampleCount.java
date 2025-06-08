package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the sample count of a texture.
///
/// Used in multisampling. Note that this value only applies when the texture
/// is used as a render target.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUTexture
/// \sa SDL_GPUTextureSupportsSampleCount
///
public final class SDL_GPUSampleCount {
    public static final int SDL_GPU_SAMPLECOUNT_1 = 0x0;
    public static final int SDL_GPU_SAMPLECOUNT_2 = 0x1;
    public static final int SDL_GPU_SAMPLECOUNT_4 = 0x2;
    public static final int SDL_GPU_SAMPLECOUNT_8 = 0x3;

    public static String explain(@EnumType(SDL_GPUSampleCount.class) int value) {
        return switch (value) {
            case SDL_GPUSampleCount.SDL_GPU_SAMPLECOUNT_1 -> "SDL_GPU_SAMPLECOUNT_1";
            case SDL_GPUSampleCount.SDL_GPU_SAMPLECOUNT_2 -> "SDL_GPU_SAMPLECOUNT_2";
            case SDL_GPUSampleCount.SDL_GPU_SAMPLECOUNT_4 -> "SDL_GPU_SAMPLECOUNT_4";
            case SDL_GPUSampleCount.SDL_GPU_SAMPLECOUNT_8 -> "SDL_GPU_SAMPLECOUNT_8";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUSampleCount() {}
}
