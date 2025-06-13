package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BlendOperation {
    public static final int BLEND_OPERATION_UNDEFINED = 0x0;
    public static final int BLEND_OPERATION_ADD = 0x1;
    public static final int BLEND_OPERATION_SUBTRACT = 0x2;
    public static final int BLEND_OPERATION_REVERSE_SUBTRACT = 0x3;
    public static final int BLEND_OPERATION_MIN = 0x4;
    public static final int BLEND_OPERATION_MAX = 0x5;
    public static final int BLEND_OPERATION_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BlendOperation.class) int value) {
        return switch (value) {
            case BlendOperation.BLEND_OPERATION_ADD -> "BLEND_OPERATION_ADD";
            case BlendOperation.BLEND_OPERATION_FORCE32 -> "BLEND_OPERATION_FORCE32";
            case BlendOperation.BLEND_OPERATION_MAX -> "BLEND_OPERATION_MAX";
            case BlendOperation.BLEND_OPERATION_MIN -> "BLEND_OPERATION_MIN";
            case BlendOperation.BLEND_OPERATION_REVERSE_SUBTRACT -> "BLEND_OPERATION_REVERSE_SUBTRACT";
            case BlendOperation.BLEND_OPERATION_SUBTRACT -> "BLEND_OPERATION_SUBTRACT";
            case BlendOperation.BLEND_OPERATION_UNDEFINED -> "BLEND_OPERATION_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BlendOperation() {}
}
