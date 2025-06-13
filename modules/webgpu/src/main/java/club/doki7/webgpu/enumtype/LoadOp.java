package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class LoadOp {
    public static final int LOAD_OP_UNDEFINED = 0x0;
    public static final int LOAD_OP_LOAD = 0x1;
    public static final int LOAD_OP_CLEAR = 0x2;
    public static final int LOAD_OP_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(LoadOp.class) int value) {
        return switch (value) {
            case LoadOp.LOAD_OP_CLEAR -> "LOAD_OP_CLEAR";
            case LoadOp.LOAD_OP_FORCE32 -> "LOAD_OP_FORCE32";
            case LoadOp.LOAD_OP_LOAD -> "LOAD_OP_LOAD";
            case LoadOp.LOAD_OP_UNDEFINED -> "LOAD_OP_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private LoadOp() {}
}
