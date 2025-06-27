package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUCompilationInfoRequestStatus {
    public static final int SUCCESS = 0x1;
    public static final int INSTANCE_DROPPED = 0x2;
    public static final int ERROR = 0x3;
    public static final int UNKNOWN = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUCompilationInfoRequestStatus.class) int value) {
        return switch (value) {
            case WGPUCompilationInfoRequestStatus.ERROR -> "ERROR";
            case WGPUCompilationInfoRequestStatus.FORCE32 -> "FORCE32";
            case WGPUCompilationInfoRequestStatus.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPUCompilationInfoRequestStatus.SUCCESS -> "SUCCESS";
            case WGPUCompilationInfoRequestStatus.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUCompilationInfoRequestStatus() {}
}
