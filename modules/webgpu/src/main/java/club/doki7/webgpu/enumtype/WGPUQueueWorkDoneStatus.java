package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUQueueWorkDoneStatus {
    public static final int SUCCESS = 0x1;
    public static final int INSTANCE_DROPPED = 0x2;
    public static final int ERROR = 0x3;
    public static final int UNKNOWN = 0x4;

    public static String explain(@EnumType(WGPUQueueWorkDoneStatus.class) int value) {
        return switch (value) {
            case WGPUQueueWorkDoneStatus.ERROR -> "ERROR";
            case WGPUQueueWorkDoneStatus.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPUQueueWorkDoneStatus.SUCCESS -> "SUCCESS";
            case WGPUQueueWorkDoneStatus.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUQueueWorkDoneStatus() {}
}
