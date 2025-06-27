package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUIndexFormat {
    public static final int UNDEFINED = 0x0;
    public static final int UINT16 = 0x1;
    public static final int UINT32 = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUIndexFormat.class) int value) {
        return switch (value) {
            case WGPUIndexFormat.FORCE32 -> "FORCE32";
            case WGPUIndexFormat.UINT16 -> "UINT16";
            case WGPUIndexFormat.UINT32 -> "UINT32";
            case WGPUIndexFormat.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUIndexFormat() {}
}
