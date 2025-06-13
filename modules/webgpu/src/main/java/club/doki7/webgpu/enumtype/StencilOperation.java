package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class StencilOperation {
    public static final int STENCIL_OPERATION_UNDEFINED = 0x0;
    public static final int STENCIL_OPERATION_KEEP = 0x1;
    public static final int STENCIL_OPERATION_ZERO = 0x2;
    public static final int STENCIL_OPERATION_REPLACE = 0x3;
    public static final int STENCIL_OPERATION_INVERT = 0x4;
    public static final int STENCIL_OPERATION_INCREMENT_CLAMP = 0x5;
    public static final int STENCIL_OPERATION_DECREMENT_CLAMP = 0x6;
    public static final int STENCIL_OPERATION_INCREMENT_WRAP = 0x7;
    public static final int STENCIL_OPERATION_DECREMENT_WRAP = 0x8;
    public static final int STENCIL_OPERATION_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(StencilOperation.class) int value) {
        return switch (value) {
            case StencilOperation.STENCIL_OPERATION_DECREMENT_CLAMP -> "STENCIL_OPERATION_DECREMENT_CLAMP";
            case StencilOperation.STENCIL_OPERATION_DECREMENT_WRAP -> "STENCIL_OPERATION_DECREMENT_WRAP";
            case StencilOperation.STENCIL_OPERATION_FORCE32 -> "STENCIL_OPERATION_FORCE32";
            case StencilOperation.STENCIL_OPERATION_INCREMENT_CLAMP -> "STENCIL_OPERATION_INCREMENT_CLAMP";
            case StencilOperation.STENCIL_OPERATION_INCREMENT_WRAP -> "STENCIL_OPERATION_INCREMENT_WRAP";
            case StencilOperation.STENCIL_OPERATION_INVERT -> "STENCIL_OPERATION_INVERT";
            case StencilOperation.STENCIL_OPERATION_KEEP -> "STENCIL_OPERATION_KEEP";
            case StencilOperation.STENCIL_OPERATION_REPLACE -> "STENCIL_OPERATION_REPLACE";
            case StencilOperation.STENCIL_OPERATION_UNDEFINED -> "STENCIL_OPERATION_UNDEFINED";
            case StencilOperation.STENCIL_OPERATION_ZERO -> "STENCIL_OPERATION_ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private StencilOperation() {}
}
