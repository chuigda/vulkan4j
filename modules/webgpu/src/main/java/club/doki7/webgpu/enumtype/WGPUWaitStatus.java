package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUWaitStatus {
    public static final int SUCCESS = 0x1;
    public static final int TIMED_OUT = 0x2;
    public static final int UNSUPPORTED_TIMEOUT = 0x3;
    public static final int UNSUPPORTED_COUNT = 0x4;
    public static final int UNSUPPORTED_MIXED_SOURCES = 0x5;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUWaitStatus.class) int value) {
        return switch (value) {
            case WGPUWaitStatus.FORCE32 -> "FORCE32";
            case WGPUWaitStatus.SUCCESS -> "SUCCESS";
            case WGPUWaitStatus.TIMED_OUT -> "TIMED_OUT";
            case WGPUWaitStatus.UNSUPPORTED_COUNT -> "UNSUPPORTED_COUNT";
            case WGPUWaitStatus.UNSUPPORTED_MIXED_SOURCES -> "UNSUPPORTED_MIXED_SOURCES";
            case WGPUWaitStatus.UNSUPPORTED_TIMEOUT -> "UNSUPPORTED_TIMEOUT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUWaitStatus() {}
}
