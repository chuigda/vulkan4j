package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUAddressMode {
    public static final int UNDEFINED = 0x0;
    public static final int CLAMP_TO_EDGE = 0x1;
    public static final int REPEAT = 0x2;
    public static final int MIRROR_REPEAT = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUAddressMode.class) int value) {
        return switch (value) {
            case WGPUAddressMode.CLAMP_TO_EDGE -> "CLAMP_TO_EDGE";
            case WGPUAddressMode.FORCE32 -> "FORCE32";
            case WGPUAddressMode.MIRROR_REPEAT -> "MIRROR_REPEAT";
            case WGPUAddressMode.REPEAT -> "REPEAT";
            case WGPUAddressMode.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUAddressMode() {}
}
