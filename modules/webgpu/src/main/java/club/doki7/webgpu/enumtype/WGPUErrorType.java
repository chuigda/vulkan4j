package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUErrorType {
    public static final int NO_ERROR = 0x1;
    public static final int VALIDATION = 0x2;
    public static final int OUT_OF_MEMORY = 0x3;
    public static final int INTERNAL = 0x4;
    public static final int UNKNOWN = 0x5;

    public static String explain(@EnumType(WGPUErrorType.class) int value) {
        return switch (value) {
            case WGPUErrorType.INTERNAL -> "INTERNAL";
            case WGPUErrorType.NO_ERROR -> "NO_ERROR";
            case WGPUErrorType.OUT_OF_MEMORY -> "OUT_OF_MEMORY";
            case WGPUErrorType.UNKNOWN -> "UNKNOWN";
            case WGPUErrorType.VALIDATION -> "VALIDATION";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUErrorType() {}
}
