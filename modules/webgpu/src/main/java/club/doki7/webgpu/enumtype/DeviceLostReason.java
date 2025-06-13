package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class DeviceLostReason {
    public static final int DEVICE_LOST_REASON_UNKNOWN = 0x1;
    public static final int DEVICE_LOST_REASON_DESTROYED = 0x2;
    public static final int DEVICE_LOST_REASON_CALLBACK_CANCELLED = 0x3;
    public static final int DEVICE_LOST_REASON_FAILED_CREATION = 0x4;
    public static final int DEVICE_LOST_REASON_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(DeviceLostReason.class) int value) {
        return switch (value) {
            case DeviceLostReason.DEVICE_LOST_REASON_CALLBACK_CANCELLED -> "DEVICE_LOST_REASON_CALLBACK_CANCELLED";
            case DeviceLostReason.DEVICE_LOST_REASON_DESTROYED -> "DEVICE_LOST_REASON_DESTROYED";
            case DeviceLostReason.DEVICE_LOST_REASON_FAILED_CREATION -> "DEVICE_LOST_REASON_FAILED_CREATION";
            case DeviceLostReason.DEVICE_LOST_REASON_FORCE32 -> "DEVICE_LOST_REASON_FORCE32";
            case DeviceLostReason.DEVICE_LOST_REASON_UNKNOWN -> "DEVICE_LOST_REASON_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private DeviceLostReason() {}
}
