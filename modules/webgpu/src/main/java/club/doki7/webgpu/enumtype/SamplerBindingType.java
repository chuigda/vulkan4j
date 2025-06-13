package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class SamplerBindingType {
    public static final int SAMPLER_BINDING_TYPE_BINDING_NOT_USED = 0x0;
    public static final int SAMPLER_BINDING_TYPE_UNDEFINED = 0x1;
    public static final int SAMPLER_BINDING_TYPE_FILTERING = 0x2;
    public static final int SAMPLER_BINDING_TYPE_NON_FILTERING = 0x3;
    public static final int SAMPLER_BINDING_TYPE_COMPARISON = 0x4;
    public static final int SAMPLER_BINDING_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(SamplerBindingType.class) int value) {
        return switch (value) {
            case SamplerBindingType.SAMPLER_BINDING_TYPE_BINDING_NOT_USED -> "SAMPLER_BINDING_TYPE_BINDING_NOT_USED";
            case SamplerBindingType.SAMPLER_BINDING_TYPE_COMPARISON -> "SAMPLER_BINDING_TYPE_COMPARISON";
            case SamplerBindingType.SAMPLER_BINDING_TYPE_FILTERING -> "SAMPLER_BINDING_TYPE_FILTERING";
            case SamplerBindingType.SAMPLER_BINDING_TYPE_FORCE32 -> "SAMPLER_BINDING_TYPE_FORCE32";
            case SamplerBindingType.SAMPLER_BINDING_TYPE_NON_FILTERING -> "SAMPLER_BINDING_TYPE_NON_FILTERING";
            case SamplerBindingType.SAMPLER_BINDING_TYPE_UNDEFINED -> "SAMPLER_BINDING_TYPE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SamplerBindingType() {}
}
