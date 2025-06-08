package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the format of a vertex attribute.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUGraphicsPipeline
///
public final class SDL_GPUVertexElementFormat {
    public static final int INVALID = 0x0;
    public static final int INT = 0x1;
    public static final int INT2 = 0x2;
    public static final int INT3 = 0x3;
    public static final int INT4 = 0x4;
    public static final int UINT = 0x5;
    public static final int UINT2 = 0x6;
    public static final int UINT3 = 0x7;
    public static final int UINT4 = 0x8;
    public static final int FLOAT = 0x9;
    public static final int FLOAT2 = 0xa;
    public static final int FLOAT3 = 0xb;
    public static final int FLOAT4 = 0xc;
    public static final int BYTE2 = 0xd;
    public static final int BYTE4 = 0xe;
    public static final int UBYTE2 = 0xf;
    public static final int UBYTE4 = 0x10;
    public static final int BYTE2_NORM = 0x11;
    public static final int BYTE4_NORM = 0x12;
    public static final int UBYTE2_NORM = 0x13;
    public static final int UBYTE4_NORM = 0x14;
    public static final int SHORT2 = 0x15;
    public static final int SHORT4 = 0x16;
    public static final int USHORT2 = 0x17;
    public static final int USHORT4 = 0x18;
    public static final int SHORT2_NORM = 0x19;
    public static final int SHORT4_NORM = 0x1a;
    public static final int USHORT2_NORM = 0x1b;
    public static final int USHORT4_NORM = 0x1c;
    public static final int HALF2 = 0x1d;
    public static final int HALF4 = 0x1e;

    public static String explain(@EnumType(SDL_GPUVertexElementFormat.class) int value) {
        return switch (value) {
            case SDL_GPUVertexElementFormat.BYTE2 -> "SDL_GPU_VERTEXELEMENTFORMAT_BYTE2";
            case SDL_GPUVertexElementFormat.BYTE2_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_BYTE2_NORM";
            case SDL_GPUVertexElementFormat.BYTE4 -> "SDL_GPU_VERTEXELEMENTFORMAT_BYTE4";
            case SDL_GPUVertexElementFormat.BYTE4_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_BYTE4_NORM";
            case SDL_GPUVertexElementFormat.FLOAT -> "SDL_GPU_VERTEXELEMENTFORMAT_FLOAT";
            case SDL_GPUVertexElementFormat.FLOAT2 -> "SDL_GPU_VERTEXELEMENTFORMAT_FLOAT2";
            case SDL_GPUVertexElementFormat.FLOAT3 -> "SDL_GPU_VERTEXELEMENTFORMAT_FLOAT3";
            case SDL_GPUVertexElementFormat.FLOAT4 -> "SDL_GPU_VERTEXELEMENTFORMAT_FLOAT4";
            case SDL_GPUVertexElementFormat.HALF2 -> "SDL_GPU_VERTEXELEMENTFORMAT_HALF2";
            case SDL_GPUVertexElementFormat.HALF4 -> "SDL_GPU_VERTEXELEMENTFORMAT_HALF4";
            case SDL_GPUVertexElementFormat.INT -> "SDL_GPU_VERTEXELEMENTFORMAT_INT";
            case SDL_GPUVertexElementFormat.INT2 -> "SDL_GPU_VERTEXELEMENTFORMAT_INT2";
            case SDL_GPUVertexElementFormat.INT3 -> "SDL_GPU_VERTEXELEMENTFORMAT_INT3";
            case SDL_GPUVertexElementFormat.INT4 -> "SDL_GPU_VERTEXELEMENTFORMAT_INT4";
            case SDL_GPUVertexElementFormat.INVALID -> "SDL_GPU_VERTEXELEMENTFORMAT_INVALID";
            case SDL_GPUVertexElementFormat.SHORT2 -> "SDL_GPU_VERTEXELEMENTFORMAT_SHORT2";
            case SDL_GPUVertexElementFormat.SHORT2_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_SHORT2_NORM";
            case SDL_GPUVertexElementFormat.SHORT4 -> "SDL_GPU_VERTEXELEMENTFORMAT_SHORT4";
            case SDL_GPUVertexElementFormat.SHORT4_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_SHORT4_NORM";
            case SDL_GPUVertexElementFormat.UBYTE2 -> "SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2";
            case SDL_GPUVertexElementFormat.UBYTE2_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_UBYTE2_NORM";
            case SDL_GPUVertexElementFormat.UBYTE4 -> "SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4";
            case SDL_GPUVertexElementFormat.UBYTE4_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_UBYTE4_NORM";
            case SDL_GPUVertexElementFormat.UINT -> "SDL_GPU_VERTEXELEMENTFORMAT_UINT";
            case SDL_GPUVertexElementFormat.UINT2 -> "SDL_GPU_VERTEXELEMENTFORMAT_UINT2";
            case SDL_GPUVertexElementFormat.UINT3 -> "SDL_GPU_VERTEXELEMENTFORMAT_UINT3";
            case SDL_GPUVertexElementFormat.UINT4 -> "SDL_GPU_VERTEXELEMENTFORMAT_UINT4";
            case SDL_GPUVertexElementFormat.USHORT2 -> "SDL_GPU_VERTEXELEMENTFORMAT_USHORT2";
            case SDL_GPUVertexElementFormat.USHORT2_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_USHORT2_NORM";
            case SDL_GPUVertexElementFormat.USHORT4 -> "SDL_GPU_VERTEXELEMENTFORMAT_USHORT4";
            case SDL_GPUVertexElementFormat.USHORT4_NORM -> "SDL_GPU_VERTEXELEMENTFORMAT_USHORT4_NORM";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUVertexElementFormat() {}
}
