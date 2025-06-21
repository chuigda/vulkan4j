package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class SamplerBindingType {
    public static final int BINDING_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int FILTERING = 0x2;
    public static final int NON_FILTERING = 0x3;
    public static final int COMPARISON = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(SamplerBindingType.class) int value) {
        return switch (value) {
            case SamplerBindingType.BINDING_NOT_USED -> "BINDING_NOT_USED";
            case SamplerBindingType.COMPARISON -> "COMPARISON";
            case SamplerBindingType.FILTERING -> "FILTERING";
            case SamplerBindingType.FORCE32 -> "FORCE32";
            case SamplerBindingType.NON_FILTERING -> "NON_FILTERING";
            case SamplerBindingType.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SamplerBindingType() {}
}
