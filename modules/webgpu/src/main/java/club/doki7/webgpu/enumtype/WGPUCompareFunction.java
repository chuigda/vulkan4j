package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUCompareFunction {
    public static final int UNDEFINED = 0x0;
    public static final int NEVER = 0x1;
    public static final int LESS = 0x2;
    public static final int EQUAL = 0x3;
    public static final int LESS_EQUAL = 0x4;
    public static final int GREATER = 0x5;
    public static final int NOT_EQUAL = 0x6;
    public static final int GREATER_EQUAL = 0x7;
    public static final int ALWAYS = 0x8;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUCompareFunction.class) int value) {
        return switch (value) {
            case WGPUCompareFunction.ALWAYS -> "ALWAYS";
            case WGPUCompareFunction.EQUAL -> "EQUAL";
            case WGPUCompareFunction.FORCE32 -> "FORCE32";
            case WGPUCompareFunction.GREATER -> "GREATER";
            case WGPUCompareFunction.GREATER_EQUAL -> "GREATER_EQUAL";
            case WGPUCompareFunction.LESS -> "LESS";
            case WGPUCompareFunction.LESS_EQUAL -> "LESS_EQUAL";
            case WGPUCompareFunction.NEVER -> "NEVER";
            case WGPUCompareFunction.NOT_EQUAL -> "NOT_EQUAL";
            case WGPUCompareFunction.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUCompareFunction() {}
}
