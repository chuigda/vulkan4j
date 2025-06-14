package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PresentMode {
    public static final int UNDEFINED = 0x0;
    public static final int FIFO = 0x1;
    public static final int FIFO_RELAXED = 0x2;
    public static final int IMMEDIATE = 0x3;
    public static final int MAILBOX = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PresentMode.class) int value) {
        return switch (value) {
            case PresentMode.FIFO -> "FIFO";
            case PresentMode.FIFO_RELAXED -> "FIFO_RELAXED";
            case PresentMode.FORCE32 -> "FORCE32";
            case PresentMode.IMMEDIATE -> "IMMEDIATE";
            case PresentMode.MAILBOX -> "MAILBOX";
            case PresentMode.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PresentMode() {}
}
