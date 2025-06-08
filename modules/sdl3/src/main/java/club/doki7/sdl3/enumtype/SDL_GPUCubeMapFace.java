package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the face of a cube map.
///
/// Can be passed in as the layer field in texture-related structs.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_GPUCubeMapFace {
    public static final int POSITIVEX = 0x0;
    public static final int NEGATIVEX = 0x1;
    public static final int POSITIVEY = 0x2;
    public static final int NEGATIVEY = 0x3;
    public static final int POSITIVEZ = 0x4;
    public static final int NEGATIVEZ = 0x5;

    public static String explain(@EnumType(SDL_GPUCubeMapFace.class) int value) {
        return switch (value) {
            case SDL_GPUCubeMapFace.NEGATIVEX -> "SDL_GPU_CUBEMAPFACE_NEGATIVEX";
            case SDL_GPUCubeMapFace.NEGATIVEY -> "SDL_GPU_CUBEMAPFACE_NEGATIVEY";
            case SDL_GPUCubeMapFace.NEGATIVEZ -> "SDL_GPU_CUBEMAPFACE_NEGATIVEZ";
            case SDL_GPUCubeMapFace.POSITIVEX -> "SDL_GPU_CUBEMAPFACE_POSITIVEX";
            case SDL_GPUCubeMapFace.POSITIVEY -> "SDL_GPU_CUBEMAPFACE_POSITIVEY";
            case SDL_GPUCubeMapFace.POSITIVEZ -> "SDL_GPU_CUBEMAPFACE_POSITIVEZ";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUCubeMapFace() {}
}
