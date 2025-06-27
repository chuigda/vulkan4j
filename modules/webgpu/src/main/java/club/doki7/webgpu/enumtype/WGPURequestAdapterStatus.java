package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPURequestAdapterStatus {
    public static final int SUCCESS = 0x1;
    public static final int INSTANCE_DROPPED = 0x2;
    public static final int UNAVAILABLE = 0x3;
    public static final int ERROR = 0x4;
    public static final int UNKNOWN = 0x5;

    public static String explain(@EnumType(WGPURequestAdapterStatus.class) int value) {
        return switch (value) {
            case WGPURequestAdapterStatus.ERROR -> "ERROR";
            case WGPURequestAdapterStatus.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPURequestAdapterStatus.SUCCESS -> "SUCCESS";
            case WGPURequestAdapterStatus.UNAVAILABLE -> "UNAVAILABLE";
            case WGPURequestAdapterStatus.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPURequestAdapterStatus() {}
}
