package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUFrontFace {
    public static final int UNDEFINED = 0x0;
    public static final int CCW = 0x1;
    public static final int CW = 0x2;

    public static String explain(@EnumType(WGPUFrontFace.class) int value) {
        return switch (value) {
            case WGPUFrontFace.CCW -> "CCW";
            case WGPUFrontFace.CW -> "CW";
            case WGPUFrontFace.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFrontFace() {}
}
