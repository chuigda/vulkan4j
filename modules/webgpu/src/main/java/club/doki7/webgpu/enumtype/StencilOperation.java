package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class StencilOperation {
    public static final int UNDEFINED = 0x0;
    public static final int KEEP = 0x1;
    public static final int ZERO = 0x2;
    public static final int REPLACE = 0x3;
    public static final int INVERT = 0x4;
    public static final int INCREMENT_CLAMP = 0x5;
    public static final int DECREMENT_CLAMP = 0x6;
    public static final int INCREMENT_WRAP = 0x7;
    public static final int DECREMENT_WRAP = 0x8;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(StencilOperation.class) int value) {
        return switch (value) {
            case StencilOperation.DECREMENT_CLAMP -> "DECREMENT_CLAMP";
            case StencilOperation.DECREMENT_WRAP -> "DECREMENT_WRAP";
            case StencilOperation.FORCE32 -> "FORCE32";
            case StencilOperation.INCREMENT_CLAMP -> "INCREMENT_CLAMP";
            case StencilOperation.INCREMENT_WRAP -> "INCREMENT_WRAP";
            case StencilOperation.INVERT -> "INVERT";
            case StencilOperation.KEEP -> "KEEP";
            case StencilOperation.REPLACE -> "REPLACE";
            case StencilOperation.UNDEFINED -> "UNDEFINED";
            case StencilOperation.ZERO -> "ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private StencilOperation() {}
}
