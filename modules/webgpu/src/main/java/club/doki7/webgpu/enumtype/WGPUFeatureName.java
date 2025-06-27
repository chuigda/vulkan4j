package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUFeatureName {
    public static final int UNDEFINED = 0x0;
    public static final int DEPTH_CLIP_CONTROL = 0x1;
    public static final int DEPTH32_FLOAT_STENCIL8 = 0x2;
    public static final int TIMESTAMP_QUERY = 0x3;
    public static final int TEXTURE_COMPRESSION_BC = 0x4;
    public static final int TEXTURE_COMPRESSION_BC_SLICED_3D = 0x5;
    public static final int TEXTURE_COMPRESSION_ETC2 = 0x6;
    public static final int TEXTURE_COMPRESSION_ASTC = 0x7;
    public static final int TEXTURE_COMPRESSION_ASTC_SLICED_3D = 0x8;
    public static final int INDIRECT_FIRST_INSTANCE = 0x9;
    public static final int SHADER_F16 = 0xa;
    public static final int RG11B10_UFLOAT_RENDERABLE = 0xb;
    public static final int BGRA8_UNORM_STORAGE = 0xc;
    public static final int FLOAT32_FILTERABLE = 0xd;
    public static final int FLOAT32_BLENDABLE = 0xe;
    public static final int CLIP_DISTANCES = 0xf;
    public static final int DUAL_SOURCE_BLENDING = 0x10;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUFeatureName.class) int value) {
        return switch (value) {
            case WGPUFeatureName.BGRA8_UNORM_STORAGE -> "BGRA8_UNORM_STORAGE";
            case WGPUFeatureName.CLIP_DISTANCES -> "CLIP_DISTANCES";
            case WGPUFeatureName.DEPTH32_FLOAT_STENCIL8 -> "DEPTH32_FLOAT_STENCIL8";
            case WGPUFeatureName.DEPTH_CLIP_CONTROL -> "DEPTH_CLIP_CONTROL";
            case WGPUFeatureName.DUAL_SOURCE_BLENDING -> "DUAL_SOURCE_BLENDING";
            case WGPUFeatureName.FLOAT32_BLENDABLE -> "FLOAT32_BLENDABLE";
            case WGPUFeatureName.FLOAT32_FILTERABLE -> "FLOAT32_FILTERABLE";
            case WGPUFeatureName.FORCE32 -> "FORCE32";
            case WGPUFeatureName.INDIRECT_FIRST_INSTANCE -> "INDIRECT_FIRST_INSTANCE";
            case WGPUFeatureName.RG11B10_UFLOAT_RENDERABLE -> "RG11B10_UFLOAT_RENDERABLE";
            case WGPUFeatureName.SHADER_F16 -> "SHADER_F16";
            case WGPUFeatureName.TEXTURE_COMPRESSION_ASTC -> "TEXTURE_COMPRESSION_ASTC";
            case WGPUFeatureName.TEXTURE_COMPRESSION_ASTC_SLICED_3D -> "TEXTURE_COMPRESSION_ASTC_SLICED_3D";
            case WGPUFeatureName.TEXTURE_COMPRESSION_BC -> "TEXTURE_COMPRESSION_BC";
            case WGPUFeatureName.TEXTURE_COMPRESSION_BC_SLICED_3D -> "TEXTURE_COMPRESSION_BC_SLICED_3D";
            case WGPUFeatureName.TEXTURE_COMPRESSION_ETC2 -> "TEXTURE_COMPRESSION_ETC2";
            case WGPUFeatureName.TIMESTAMP_QUERY -> "TIMESTAMP_QUERY";
            case WGPUFeatureName.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFeatureName() {}
}
