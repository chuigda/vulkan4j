package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class FeatureName {
    public static final int FEATURE_NAME_DEPTH_CLIP_CONTROL = 0x1;
    public static final int FEATURE_NAME_DEPTH32_FLOAT_STENCIL8 = 0x2;
    public static final int FEATURE_NAME_TIMESTAMP_QUERY = 0x3;
    public static final int FEATURE_NAME_TEXTURE_COMPRESSION_BC = 0x4;
    public static final int FEATURE_NAME_TEXTURE_COMPRESSION_BC_SLICED_3D = 0x5;
    public static final int FEATURE_NAME_TEXTURE_COMPRESSION_ETC2 = 0x6;
    public static final int FEATURE_NAME_TEXTURE_COMPRESSION_ASTC = 0x7;
    public static final int FEATURE_NAME_TEXTURE_COMPRESSION_ASTC_SLICED_3D = 0x8;
    public static final int FEATURE_NAME_INDIRECT_FIRST_INSTANCE = 0x9;
    public static final int FEATURE_NAME_SHADER_F16 = 0xa;
    public static final int FEATURE_NAME_RG11B10_UFLOAT_RENDERABLE = 0xb;
    public static final int FEATURE_NAME_BGRA8_UNORM_STORAGE = 0xc;
    public static final int FEATURE_NAME_FLOAT32_FILTERABLE = 0xd;
    public static final int FEATURE_NAME_FLOAT32_BLENDABLE = 0xe;
    public static final int FEATURE_NAME_CLIP_DISTANCES = 0xf;
    public static final int FEATURE_NAME_DUAL_SOURCE_BLENDING = 0x10;
    public static final int FEATURE_NAME_SUBGROUPS = 0x11;
    public static final int FEATURE_NAME_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(FeatureName.class) int value) {
        return switch (value) {
            case FeatureName.FEATURE_NAME_BGRA8_UNORM_STORAGE -> "FEATURE_NAME_BGRA8_UNORM_STORAGE";
            case FeatureName.FEATURE_NAME_CLIP_DISTANCES -> "FEATURE_NAME_CLIP_DISTANCES";
            case FeatureName.FEATURE_NAME_DEPTH32_FLOAT_STENCIL8 -> "FEATURE_NAME_DEPTH32_FLOAT_STENCIL8";
            case FeatureName.FEATURE_NAME_DEPTH_CLIP_CONTROL -> "FEATURE_NAME_DEPTH_CLIP_CONTROL";
            case FeatureName.FEATURE_NAME_DUAL_SOURCE_BLENDING -> "FEATURE_NAME_DUAL_SOURCE_BLENDING";
            case FeatureName.FEATURE_NAME_FLOAT32_BLENDABLE -> "FEATURE_NAME_FLOAT32_BLENDABLE";
            case FeatureName.FEATURE_NAME_FLOAT32_FILTERABLE -> "FEATURE_NAME_FLOAT32_FILTERABLE";
            case FeatureName.FEATURE_NAME_FORCE32 -> "FEATURE_NAME_FORCE32";
            case FeatureName.FEATURE_NAME_INDIRECT_FIRST_INSTANCE -> "FEATURE_NAME_INDIRECT_FIRST_INSTANCE";
            case FeatureName.FEATURE_NAME_RG11B10_UFLOAT_RENDERABLE -> "FEATURE_NAME_RG11B10_UFLOAT_RENDERABLE";
            case FeatureName.FEATURE_NAME_SHADER_F16 -> "FEATURE_NAME_SHADER_F16";
            case FeatureName.FEATURE_NAME_SUBGROUPS -> "FEATURE_NAME_SUBGROUPS";
            case FeatureName.FEATURE_NAME_TEXTURE_COMPRESSION_ASTC -> "FEATURE_NAME_TEXTURE_COMPRESSION_ASTC";
            case FeatureName.FEATURE_NAME_TEXTURE_COMPRESSION_ASTC_SLICED_3D -> "FEATURE_NAME_TEXTURE_COMPRESSION_ASTC_SLICED_3D";
            case FeatureName.FEATURE_NAME_TEXTURE_COMPRESSION_BC -> "FEATURE_NAME_TEXTURE_COMPRESSION_BC";
            case FeatureName.FEATURE_NAME_TEXTURE_COMPRESSION_BC_SLICED_3D -> "FEATURE_NAME_TEXTURE_COMPRESSION_BC_SLICED_3D";
            case FeatureName.FEATURE_NAME_TEXTURE_COMPRESSION_ETC2 -> "FEATURE_NAME_TEXTURE_COMPRESSION_ETC2";
            case FeatureName.FEATURE_NAME_TIMESTAMP_QUERY -> "FEATURE_NAME_TIMESTAMP_QUERY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FeatureName() {}
}
