package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUCullMode {
    public static final int UNDEFINED = 0x0;
    public static final int NONE = 0x1;
    public static final int FRONT = 0x2;
    public static final int BACK = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUCullMode.class) int value) {
        return switch (value) {
            case WGPUCullMode.BACK -> "BACK";
            case WGPUCullMode.FORCE32 -> "FORCE32";
            case WGPUCullMode.FRONT -> "FRONT";
            case WGPUCullMode.NONE -> "NONE";
            case WGPUCullMode.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUCullMode() {}
}
