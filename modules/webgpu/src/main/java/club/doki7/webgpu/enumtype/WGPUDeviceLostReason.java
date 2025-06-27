package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUDeviceLostReason {
    public static final int UNKNOWN = 0x1;
    public static final int DESTROYED = 0x2;
    public static final int INSTANCE_DROPPED = 0x3;
    public static final int FAILED_CREATION = 0x4;

    public static String explain(@EnumType(WGPUDeviceLostReason.class) int value) {
        return switch (value) {
            case WGPUDeviceLostReason.DESTROYED -> "DESTROYED";
            case WGPUDeviceLostReason.FAILED_CREATION -> "FAILED_CREATION";
            case WGPUDeviceLostReason.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPUDeviceLostReason.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUDeviceLostReason() {}
}
