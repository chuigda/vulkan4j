package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PresentMode {
    public static final int PRESENT_MODE_UNDEFINED = 0x0;
    public static final int PRESENT_MODE_FIFO = 0x1;
    public static final int PRESENT_MODE_FIFO_RELAXED = 0x2;
    public static final int PRESENT_MODE_IMMEDIATE = 0x3;
    public static final int PRESENT_MODE_MAILBOX = 0x4;
    public static final int PRESENT_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PresentMode.class) int value) {
        return switch (value) {
            case PresentMode.PRESENT_MODE_FIFO -> "PRESENT_MODE_FIFO";
            case PresentMode.PRESENT_MODE_FIFO_RELAXED -> "PRESENT_MODE_FIFO_RELAXED";
            case PresentMode.PRESENT_MODE_FORCE32 -> "PRESENT_MODE_FORCE32";
            case PresentMode.PRESENT_MODE_IMMEDIATE -> "PRESENT_MODE_IMMEDIATE";
            case PresentMode.PRESENT_MODE_MAILBOX -> "PRESENT_MODE_MAILBOX";
            case PresentMode.PRESENT_MODE_UNDEFINED -> "PRESENT_MODE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PresentMode() {}
}
