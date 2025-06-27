package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUMapAsyncStatus {
    public static final int SUCCESS = 0x1;
    public static final int INSTANCE_DROPPED = 0x2;
    public static final int ERROR = 0x3;
    public static final int ABORTED = 0x4;
    public static final int UNKNOWN = 0x5;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUMapAsyncStatus.class) int value) {
        return switch (value) {
            case WGPUMapAsyncStatus.ABORTED -> "ABORTED";
            case WGPUMapAsyncStatus.ERROR -> "ERROR";
            case WGPUMapAsyncStatus.FORCE32 -> "FORCE32";
            case WGPUMapAsyncStatus.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPUMapAsyncStatus.SUCCESS -> "SUCCESS";
            case WGPUMapAsyncStatus.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUMapAsyncStatus() {}
}
