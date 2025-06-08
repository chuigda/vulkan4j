package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the primitive topology of a graphics pipeline.
///
/// If you are using POINTLIST you must include a point size output in the
/// vertex shader.
///
/// - For HLSL compiling to SPIRV you must decorate a float output with
///   [[vk::builtin("PointSize")]].
/// - For GLSL you must set the gl_PointSize builtin.
/// - For MSL you must include a float output with the [[point_size]]
///   decorator.
///
/// Note that sized point topology is totally unsupported on D3D12. Any size
/// other than 1 will be ignored. In general, you should avoid using point
/// topology for both compatibility and performance reasons. You WILL regret
/// using it.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUPrimitiveType {
    public static final int TRIANGLELIST = 0x0;
    public static final int TRIANGLESTRIP = 0x1;
    public static final int LINELIST = 0x2;
    public static final int LINESTRIP = 0x3;
    public static final int POINTLIST = 0x4;

    public static String explain(@EnumType(SDL_GPUPrimitiveType.class) int value) {
        return switch (value) {
            case SDL_GPUPrimitiveType.LINELIST -> "SDL_GPU_PRIMITIVETYPE_LINELIST";
            case SDL_GPUPrimitiveType.LINESTRIP -> "SDL_GPU_PRIMITIVETYPE_LINESTRIP";
            case SDL_GPUPrimitiveType.POINTLIST -> "SDL_GPU_PRIMITIVETYPE_POINTLIST";
            case SDL_GPUPrimitiveType.TRIANGLELIST -> "SDL_GPU_PRIMITIVETYPE_TRIANGLELIST";
            case SDL_GPUPrimitiveType.TRIANGLESTRIP -> "SDL_GPU_PRIMITIVETYPE_TRIANGLESTRIP";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUPrimitiveType() {}
}
