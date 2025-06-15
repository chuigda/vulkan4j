package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class DeviceLostReason {
    public static final int UNKNOWN = 0x1;
    public static final int DESTROYED = 0x2;
    public static final int CALLBACK_CANCELLED = 0x3;
    public static final int FAILED_CREATION = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(DeviceLostReason.class) int value) {
        return switch (value) {
            case DeviceLostReason.CALLBACK_CANCELLED -> "CALLBACK_CANCELLED";
            case DeviceLostReason.DESTROYED -> "DESTROYED";
            case DeviceLostReason.FAILED_CREATION -> "FAILED_CREATION";
            case DeviceLostReason.FORCE32 -> "FORCE32";
            case DeviceLostReason.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private DeviceLostReason() {}
}
