package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the type of a texture.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUTexture
///
public final class SDL_GPUTextureType {
    public static final int _2D = 0x0;
    public static final int _2D_ARRAY = 0x1;
    public static final int _3D = 0x2;
    public static final int CUBE = 0x3;
    public static final int CUBE_ARRAY = 0x4;

    public static String explain(@EnumType(SDL_GPUTextureType.class) int value) {
        return switch (value) {
            case SDL_GPUTextureType._2D -> "SDL_GPU_TEXTURETYPE_2D";
            case SDL_GPUTextureType._2D_ARRAY -> "SDL_GPU_TEXTURETYPE_2D_ARRAY";
            case SDL_GPUTextureType._3D -> "SDL_GPU_TEXTURETYPE_3D";
            case SDL_GPUTextureType.CUBE -> "SDL_GPU_TEXTURETYPE_CUBE";
            case SDL_GPUTextureType.CUBE_ARRAY -> "SDL_GPU_TEXTURETYPE_CUBE_ARRAY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUTextureType() {}
}
