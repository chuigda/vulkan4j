package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUStoreOp {
    public static final int UNDEFINED = 0x0;
    public static final int STORE = 0x1;
    public static final int DISCARD = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUStoreOp.class) int value) {
        return switch (value) {
            case WGPUStoreOp.DISCARD -> "DISCARD";
            case WGPUStoreOp.FORCE32 -> "FORCE32";
            case WGPUStoreOp.STORE -> "STORE";
            case WGPUStoreOp.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUStoreOp() {}
}
