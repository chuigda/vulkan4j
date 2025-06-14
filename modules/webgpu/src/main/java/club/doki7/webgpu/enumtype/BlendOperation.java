package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BlendOperation {
    public static final int UNDEFINED = 0x0;
    public static final int ADD = 0x1;
    public static final int SUBTRACT = 0x2;
    public static final int REVERSE_SUBTRACT = 0x3;
    public static final int MIN = 0x4;
    public static final int MAX = 0x5;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BlendOperation.class) int value) {
        return switch (value) {
            case BlendOperation.ADD -> "ADD";
            case BlendOperation.FORCE32 -> "FORCE32";
            case BlendOperation.MAX -> "MAX";
            case BlendOperation.MIN -> "MIN";
            case BlendOperation.REVERSE_SUBTRACT -> "REVERSE_SUBTRACT";
            case BlendOperation.SUBTRACT -> "SUBTRACT";
            case BlendOperation.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BlendOperation() {}
}
