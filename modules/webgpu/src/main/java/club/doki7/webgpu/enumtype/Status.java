package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class Status {
    public static final int SUCCESS = 0x1;
    public static final int ERROR = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(Status.class) int value) {
        return switch (value) {
            case Status.ERROR -> "ERROR";
            case Status.FORCE32 -> "FORCE32";
            case Status.SUCCESS -> "SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private Status() {}
}
