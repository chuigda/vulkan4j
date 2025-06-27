package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUCompilationMessageType {
    public static final int ERROR = 0x1;
    public static final int WARNING = 0x2;
    public static final int INFO = 0x3;

    public static String explain(@EnumType(WGPUCompilationMessageType.class) int value) {
        return switch (value) {
            case WGPUCompilationMessageType.ERROR -> "ERROR";
            case WGPUCompilationMessageType.INFO -> "INFO";
            case WGPUCompilationMessageType.WARNING -> "WARNING";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUCompilationMessageType() {}
}
