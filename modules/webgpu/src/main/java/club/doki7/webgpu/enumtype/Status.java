package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class Status {
    public static final int STATUS_SUCCESS = 0x1;
    public static final int STATUS_ERROR = 0x2;
    public static final int STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(Status.class) int value) {
        return switch (value) {
            case Status.STATUS_ERROR -> "STATUS_ERROR";
            case Status.STATUS_FORCE32 -> "STATUS_FORCE32";
            case Status.STATUS_SUCCESS -> "STATUS_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private Status() {}
}
