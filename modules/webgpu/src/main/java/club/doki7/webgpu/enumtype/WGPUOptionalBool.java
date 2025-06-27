package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUOptionalBool {
    public static final int FALSE = 0x0;
    public static final int TRUE = 0x1;
    public static final int UNDEFINED = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUOptionalBool.class) int value) {
        return switch (value) {
            case WGPUOptionalBool.FALSE -> "FALSE";
            case WGPUOptionalBool.FORCE32 -> "FORCE32";
            case WGPUOptionalBool.TRUE -> "TRUE";
            case WGPUOptionalBool.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUOptionalBool() {}
}
