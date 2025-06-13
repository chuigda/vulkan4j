package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class StoreOp {
    public static final int STORE_OP_UNDEFINED = 0x0;
    public static final int STORE_OP_STORE = 0x1;
    public static final int STORE_OP_DISCARD = 0x2;
    public static final int STORE_OP_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(StoreOp.class) int value) {
        return switch (value) {
            case StoreOp.STORE_OP_DISCARD -> "STORE_OP_DISCARD";
            case StoreOp.STORE_OP_FORCE32 -> "STORE_OP_FORCE32";
            case StoreOp.STORE_OP_STORE -> "STORE_OP_STORE";
            case StoreOp.STORE_OP_UNDEFINED -> "STORE_OP_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private StoreOp() {}
}
