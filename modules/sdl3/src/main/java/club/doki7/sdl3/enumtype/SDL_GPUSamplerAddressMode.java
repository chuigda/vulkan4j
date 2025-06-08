package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies behavior of texture sampling when the coordinates exceed the 0-1
/// range.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUSampler
///
public final class SDL_GPUSamplerAddressMode {
    public static final int SDL_GPU_SAMPLERADDRESSMODE_REPEAT = 0x0;
    public static final int SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT = 0x1;
    public static final int SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE = 0x2;

    public static String explain(@EnumType(SDL_GPUSamplerAddressMode.class) int value) {
        return switch (value) {
            case SDL_GPUSamplerAddressMode.SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE -> "SDL_GPU_SAMPLERADDRESSMODE_CLAMP_TO_EDGE";
            case SDL_GPUSamplerAddressMode.SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT -> "SDL_GPU_SAMPLERADDRESSMODE_MIRRORED_REPEAT";
            case SDL_GPUSamplerAddressMode.SDL_GPU_SAMPLERADDRESSMODE_REPEAT -> "SDL_GPU_SAMPLERADDRESSMODE_REPEAT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUSamplerAddressMode() {}
}
