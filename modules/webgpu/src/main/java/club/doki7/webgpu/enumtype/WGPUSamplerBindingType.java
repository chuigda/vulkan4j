package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUSamplerBindingType {
    public static final int BINDING_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int FILTERING = 0x2;
    public static final int NON_FILTERING = 0x3;
    public static final int COMPARISON = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUSamplerBindingType.class) int value) {
        return switch (value) {
            case WGPUSamplerBindingType.BINDING_NOT_USED -> "BINDING_NOT_USED";
            case WGPUSamplerBindingType.COMPARISON -> "COMPARISON";
            case WGPUSamplerBindingType.FILTERING -> "FILTERING";
            case WGPUSamplerBindingType.FORCE32 -> "FORCE32";
            case WGPUSamplerBindingType.NON_FILTERING -> "NON_FILTERING";
            case WGPUSamplerBindingType.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUSamplerBindingType() {}
}
