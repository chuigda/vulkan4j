package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WaitStatus {
    public static final int SUCCESS = 0x1;
    public static final int TIMED_OUT = 0x2;
    public static final int ERROR = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WaitStatus.class) int value) {
        return switch (value) {
            case WaitStatus.ERROR -> "ERROR";
            case WaitStatus.FORCE32 -> "FORCE32";
            case WaitStatus.SUCCESS -> "SUCCESS";
            case WaitStatus.TIMED_OUT -> "TIMED_OUT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WaitStatus() {}
}
