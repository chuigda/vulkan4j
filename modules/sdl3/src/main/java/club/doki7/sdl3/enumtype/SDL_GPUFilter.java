package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies a filter operation used by a sampler.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUSampler
///
public final class SDL_GPUFilter {
    public static final int NEAREST = 0x0;
    public static final int LINEAR = 0x1;

    public static String explain(@EnumType(SDL_GPUFilter.class) int value) {
        return switch (value) {
            case SDL_GPUFilter.LINEAR -> "SDL_GPU_FILTER_LINEAR";
            case SDL_GPUFilter.NEAREST -> "SDL_GPU_FILTER_NEAREST";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUFilter() {}
}
