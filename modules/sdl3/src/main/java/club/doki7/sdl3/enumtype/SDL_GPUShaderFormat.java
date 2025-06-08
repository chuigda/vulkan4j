package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the format of shader code.
///
/// Each format corresponds to a specific backend that accepts it.
///
/// \since This datatype is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUShader
///
public final class SDL_GPUShaderFormat {
    public static final int INVALID = 0x0;
    public static final int PRIVATE = 0x1;
    public static final int SPIRV = 0x2;
    public static final int DXBC = 0x4;
    public static final int DXIL = 0x8;
    public static final int MSL = 0x10;
    public static final int METALLIB = 0x20;

    public static String explain(@EnumType(SDL_GPUShaderFormat.class) int value) {
        return switch (value) {
            case SDL_GPUShaderFormat.DXBC -> "SDL_GPU_SHADERFORMAT_DXBC";
            case SDL_GPUShaderFormat.DXIL -> "SDL_GPU_SHADERFORMAT_DXIL";
            case SDL_GPUShaderFormat.INVALID -> "SDL_GPU_SHADERFORMAT_INVALID";
            case SDL_GPUShaderFormat.METALLIB -> "SDL_GPU_SHADERFORMAT_METALLIB";
            case SDL_GPUShaderFormat.MSL -> "SDL_GPU_SHADERFORMAT_MSL";
            case SDL_GPUShaderFormat.PRIVATE -> "SDL_GPU_SHADERFORMAT_PRIVATE";
            case SDL_GPUShaderFormat.SPIRV -> "SDL_GPU_SHADERFORMAT_SPIRV";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUShaderFormat() {}
}
