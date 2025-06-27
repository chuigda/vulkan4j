package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUStatus {
    public static final int SUCCESS = 0x1;
    public static final int ERROR = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUStatus.class) int value) {
        return switch (value) {
            case WGPUStatus.ERROR -> "ERROR";
            case WGPUStatus.FORCE32 -> "FORCE32";
            case WGPUStatus.SUCCESS -> "SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUStatus() {}
}
