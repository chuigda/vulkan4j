package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class RequestAdapterStatus {
    public static final int REQUEST_ADAPTER_STATUS_SUCCESS = 0x1;
    public static final int REQUEST_ADAPTER_STATUS_CALLBACK_CANCELLED = 0x2;
    public static final int REQUEST_ADAPTER_STATUS_UNAVAILABLE = 0x3;
    public static final int REQUEST_ADAPTER_STATUS_ERROR = 0x4;
    public static final int REQUEST_ADAPTER_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(RequestAdapterStatus.class) int value) {
        return switch (value) {
            case RequestAdapterStatus.REQUEST_ADAPTER_STATUS_CALLBACK_CANCELLED -> "REQUEST_ADAPTER_STATUS_CALLBACK_CANCELLED";
            case RequestAdapterStatus.REQUEST_ADAPTER_STATUS_ERROR -> "REQUEST_ADAPTER_STATUS_ERROR";
            case RequestAdapterStatus.REQUEST_ADAPTER_STATUS_FORCE32 -> "REQUEST_ADAPTER_STATUS_FORCE32";
            case RequestAdapterStatus.REQUEST_ADAPTER_STATUS_SUCCESS -> "REQUEST_ADAPTER_STATUS_SUCCESS";
            case RequestAdapterStatus.REQUEST_ADAPTER_STATUS_UNAVAILABLE -> "REQUEST_ADAPTER_STATUS_UNAVAILABLE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private RequestAdapterStatus() {}
}
