package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPULogLevel {
    public static final int Off = 0x0;
    public static final int Error = 0x1;
    public static final int Warn = 0x2;
    public static final int Info = 0x3;
    public static final int Debug = 0x4;
    public static final int Trace = 0x5;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPULogLevel.class) int value) {
        return switch (value) {
            case WGPULogLevel.Debug -> "Debug";
            case WGPULogLevel.Error -> "Error";
            case WGPULogLevel.Force32 -> "Force32";
            case WGPULogLevel.Info -> "Info";
            case WGPULogLevel.Off -> "Off";
            case WGPULogLevel.Trace -> "Trace";
            case WGPULogLevel.Warn -> "Warn";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPULogLevel() {}
}
