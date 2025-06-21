package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class LoadOp {
    public static final int UNDEFINED = 0x0;
    public static final int LOAD = 0x1;
    public static final int CLEAR = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(LoadOp.class) int value) {
        return switch (value) {
            case LoadOp.CLEAR -> "CLEAR";
            case LoadOp.FORCE32 -> "FORCE32";
            case LoadOp.LOAD -> "LOAD";
            case LoadOp.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private LoadOp() {}
}
