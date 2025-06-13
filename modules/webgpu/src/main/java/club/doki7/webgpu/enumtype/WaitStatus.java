package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WaitStatus {
    public static final int WAIT_STATUS_SUCCESS = 0x1;
    public static final int WAIT_STATUS_TIMED_OUT = 0x2;
    public static final int WAIT_STATUS_ERROR = 0x3;
    public static final int WAIT_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WaitStatus.class) int value) {
        return switch (value) {
            case WaitStatus.WAIT_STATUS_ERROR -> "WAIT_STATUS_ERROR";
            case WaitStatus.WAIT_STATUS_FORCE32 -> "WAIT_STATUS_FORCE32";
            case WaitStatus.WAIT_STATUS_SUCCESS -> "WAIT_STATUS_SUCCESS";
            case WaitStatus.WAIT_STATUS_TIMED_OUT -> "WAIT_STATUS_TIMED_OUT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WaitStatus() {}
}
