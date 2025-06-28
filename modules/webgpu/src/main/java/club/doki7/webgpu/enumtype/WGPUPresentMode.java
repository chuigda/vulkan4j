package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUPresentMode {
    public static final int UNDEFINED = 0x0;
    public static final int FIFO = 0x1;
    public static final int FIFO_RELAXED = 0x2;
    public static final int IMMEDIATE = 0x3;
    public static final int MAILBOX = 0x4;

    public static String explain(@EnumType(WGPUPresentMode.class) int value) {
        return switch (value) {
            case WGPUPresentMode.FIFO -> "FIFO";
            case WGPUPresentMode.FIFO_RELAXED -> "FIFO_RELAXED";
            case WGPUPresentMode.IMMEDIATE -> "IMMEDIATE";
            case WGPUPresentMode.MAILBOX -> "MAILBOX";
            case WGPUPresentMode.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUPresentMode() {}
}
