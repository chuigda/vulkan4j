package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUFilterMode {
    public static final int UNDEFINED = 0x0;
    public static final int NEAREST = 0x1;
    public static final int LINEAR = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUFilterMode.class) int value) {
        return switch (value) {
            case WGPUFilterMode.FORCE32 -> "FORCE32";
            case WGPUFilterMode.LINEAR -> "LINEAR";
            case WGPUFilterMode.NEAREST -> "NEAREST";
            case WGPUFilterMode.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUFilterMode() {}
}
