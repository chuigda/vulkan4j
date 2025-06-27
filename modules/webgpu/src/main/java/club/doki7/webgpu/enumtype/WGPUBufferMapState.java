package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUBufferMapState {
    public static final int UNMAPPED = 0x1;
    public static final int PENDING = 0x2;
    public static final int MAPPED = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUBufferMapState.class) int value) {
        return switch (value) {
            case WGPUBufferMapState.FORCE32 -> "FORCE32";
            case WGPUBufferMapState.MAPPED -> "MAPPED";
            case WGPUBufferMapState.PENDING -> "PENDING";
            case WGPUBufferMapState.UNMAPPED -> "UNMAPPED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUBufferMapState() {}
}
