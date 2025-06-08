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
    public static final int SDL_GPU_SHADERFORMAT_INVALID = 0x0;
    public static final int SDL_GPU_SHADERFORMAT_PRIVATE = 0x1;
    public static final int SDL_GPU_SHADERFORMAT_SPIRV = 0x2;
    public static final int SDL_GPU_SHADERFORMAT_DXBC = 0x4;
    public static final int SDL_GPU_SHADERFORMAT_DXIL = 0x8;
    public static final int SDL_GPU_SHADERFORMAT_MSL = 0x10;
    public static final int SDL_GPU_SHADERFORMAT_METALLIB = 0x20;

    public static String explain(@EnumType(SDL_GPUShaderFormat.class) int value) {
        return switch (value) {
            case SDL_GPUShaderFormat.SDL_GPU_SHADERFORMAT_DXBC -> "SDL_GPU_SHADERFORMAT_DXBC";
            case SDL_GPUShaderFormat.SDL_GPU_SHADERFORMAT_DXIL -> "SDL_GPU_SHADERFORMAT_DXIL";
            case SDL_GPUShaderFormat.SDL_GPU_SHADERFORMAT_INVALID -> "SDL_GPU_SHADERFORMAT_INVALID";
            case SDL_GPUShaderFormat.SDL_GPU_SHADERFORMAT_METALLIB -> "SDL_GPU_SHADERFORMAT_METALLIB";
            case SDL_GPUShaderFormat.SDL_GPU_SHADERFORMAT_MSL -> "SDL_GPU_SHADERFORMAT_MSL";
            case SDL_GPUShaderFormat.SDL_GPU_SHADERFORMAT_PRIVATE -> "SDL_GPU_SHADERFORMAT_PRIVATE";
            case SDL_GPUShaderFormat.SDL_GPU_SHADERFORMAT_SPIRV -> "SDL_GPU_SHADERFORMAT_SPIRV";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUShaderFormat() {}
}
