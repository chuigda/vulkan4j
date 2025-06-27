package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUBlendOperation {
    public static final int UNDEFINED = 0x0;
    public static final int ADD = 0x1;
    public static final int SUBTRACT = 0x2;
    public static final int REVERSE_SUBTRACT = 0x3;
    public static final int MIN = 0x4;
    public static final int MAX = 0x5;

    public static String explain(@EnumType(WGPUBlendOperation.class) int value) {
        return switch (value) {
            case WGPUBlendOperation.ADD -> "ADD";
            case WGPUBlendOperation.MAX -> "MAX";
            case WGPUBlendOperation.MIN -> "MIN";
            case WGPUBlendOperation.REVERSE_SUBTRACT -> "REVERSE_SUBTRACT";
            case WGPUBlendOperation.SUBTRACT -> "SUBTRACT";
            case WGPUBlendOperation.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUBlendOperation() {}
}
