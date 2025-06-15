package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class RequestAdapterStatus {
    public static final int SUCCESS = 0x1;
    public static final int CALLBACK_CANCELLED = 0x2;
    public static final int UNAVAILABLE = 0x3;
    public static final int ERROR = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(RequestAdapterStatus.class) int value) {
        return switch (value) {
            case RequestAdapterStatus.CALLBACK_CANCELLED -> "CALLBACK_CANCELLED";
            case RequestAdapterStatus.ERROR -> "ERROR";
            case RequestAdapterStatus.FORCE32 -> "FORCE32";
            case RequestAdapterStatus.SUCCESS -> "SUCCESS";
            case RequestAdapterStatus.UNAVAILABLE -> "UNAVAILABLE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private RequestAdapterStatus() {}
}
