package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUStencilOperation {
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

    public static String explain(@EnumType(WGPUStencilOperation.class) int value) {
        return switch (value) {
            case WGPUStencilOperation.DECREMENT_CLAMP -> "DECREMENT_CLAMP";
            case WGPUStencilOperation.DECREMENT_WRAP -> "DECREMENT_WRAP";
            case WGPUStencilOperation.FORCE32 -> "FORCE32";
            case WGPUStencilOperation.INCREMENT_CLAMP -> "INCREMENT_CLAMP";
            case WGPUStencilOperation.INCREMENT_WRAP -> "INCREMENT_WRAP";
            case WGPUStencilOperation.INVERT -> "INVERT";
            case WGPUStencilOperation.KEEP -> "KEEP";
            case WGPUStencilOperation.REPLACE -> "REPLACE";
            case WGPUStencilOperation.UNDEFINED -> "UNDEFINED";
            case WGPUStencilOperation.ZERO -> "ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUStencilOperation() {}
}
