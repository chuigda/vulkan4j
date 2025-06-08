package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies a mipmap mode used by a sampler.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUSampler
///
public final class SDL_GPUSamplerMipmapMode {
    public static final int NEAREST = 0x0;
    public static final int LINEAR = 0x1;

    public static String explain(@EnumType(SDL_GPUSamplerMipmapMode.class) int value) {
        return switch (value) {
            case SDL_GPUSamplerMipmapMode.LINEAR -> "SDL_GPU_SAMPLERMIPMAPMODE_LINEAR";
            case SDL_GPUSamplerMipmapMode.NEAREST -> "SDL_GPU_SAMPLERMIPMAPMODE_NEAREST";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUSamplerMipmapMode() {}
}
