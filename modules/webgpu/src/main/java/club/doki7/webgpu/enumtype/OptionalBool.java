package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class OptionalBool {
    public static final int FALSE = 0x0;
    public static final int TRUE = 0x1;
    public static final int UNDEFINED = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(OptionalBool.class) int value) {
        return switch (value) {
            case OptionalBool.FALSE -> "FALSE";
            case OptionalBool.FORCE32 -> "FORCE32";
            case OptionalBool.TRUE -> "TRUE";
            case OptionalBool.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private OptionalBool() {}
}
