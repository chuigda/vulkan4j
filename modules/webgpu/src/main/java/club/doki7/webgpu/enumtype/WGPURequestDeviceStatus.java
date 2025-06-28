package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPURequestDeviceStatus {
    public static final int SUCCESS = 0x1;
    public static final int INSTANCE_DROPPED = 0x2;
    public static final int ERROR = 0x3;
    public static final int UNKNOWN = 0x4;

    public static String explain(@EnumType(WGPURequestDeviceStatus.class) int value) {
        return switch (value) {
            case WGPURequestDeviceStatus.ERROR -> "ERROR";
            case WGPURequestDeviceStatus.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPURequestDeviceStatus.SUCCESS -> "SUCCESS";
            case WGPURequestDeviceStatus.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPURequestDeviceStatus() {}
}
