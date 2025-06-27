package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUCallbackMode {
    public static final int WAIT_ANY_ONLY = 0x1;
    public static final int ALLOW_PROCESS_EVENTS = 0x2;
    public static final int ALLOW_SPONTANEOUS = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUCallbackMode.class) int value) {
        return switch (value) {
            case WGPUCallbackMode.ALLOW_PROCESS_EVENTS -> "ALLOW_PROCESS_EVENTS";
            case WGPUCallbackMode.ALLOW_SPONTANEOUS -> "ALLOW_SPONTANEOUS";
            case WGPUCallbackMode.FORCE32 -> "FORCE32";
            case WGPUCallbackMode.WAIT_ANY_ONLY -> "WAIT_ANY_ONLY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUCallbackMode() {}
}
