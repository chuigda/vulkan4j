package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class RequestDeviceStatus {
    public static final int REQUEST_DEVICE_STATUS_SUCCESS = 0x1;
    public static final int REQUEST_DEVICE_STATUS_CALLBACK_CANCELLED = 0x2;
    public static final int REQUEST_DEVICE_STATUS_ERROR = 0x3;
    public static final int REQUEST_DEVICE_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(RequestDeviceStatus.class) int value) {
        return switch (value) {
            case RequestDeviceStatus.REQUEST_DEVICE_STATUS_CALLBACK_CANCELLED -> "REQUEST_DEVICE_STATUS_CALLBACK_CANCELLED";
            case RequestDeviceStatus.REQUEST_DEVICE_STATUS_ERROR -> "REQUEST_DEVICE_STATUS_ERROR";
            case RequestDeviceStatus.REQUEST_DEVICE_STATUS_FORCE32 -> "REQUEST_DEVICE_STATUS_FORCE32";
            case RequestDeviceStatus.REQUEST_DEVICE_STATUS_SUCCESS -> "REQUEST_DEVICE_STATUS_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private RequestDeviceStatus() {}
}
