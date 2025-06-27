package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUErrorFilter {
    public static final int VALIDATION = 0x1;
    public static final int OUT_OF_MEMORY = 0x2;
    public static final int INTERNAL = 0x3;

    public static String explain(@EnumType(WGPUErrorFilter.class) int value) {
        return switch (value) {
            case WGPUErrorFilter.INTERNAL -> "INTERNAL";
            case WGPUErrorFilter.OUT_OF_MEMORY -> "OUT_OF_MEMORY";
            case WGPUErrorFilter.VALIDATION -> "VALIDATION";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUErrorFilter() {}
}
