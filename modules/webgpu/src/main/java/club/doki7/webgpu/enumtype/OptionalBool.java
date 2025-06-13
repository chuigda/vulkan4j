package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class OptionalBool {
    public static final int OPTIONAL_BOOL_FALSE = 0x0;
    public static final int OPTIONAL_BOOL_TRUE = 0x1;
    public static final int OPTIONAL_BOOL_UNDEFINED = 0x2;
    public static final int OPTIONAL_BOOL_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(OptionalBool.class) int value) {
        return switch (value) {
            case OptionalBool.OPTIONAL_BOOL_FALSE -> "OPTIONAL_BOOL_FALSE";
            case OptionalBool.OPTIONAL_BOOL_FORCE32 -> "OPTIONAL_BOOL_FORCE32";
            case OptionalBool.OPTIONAL_BOOL_TRUE -> "OPTIONAL_BOOL_TRUE";
            case OptionalBool.OPTIONAL_BOOL_UNDEFINED -> "OPTIONAL_BOOL_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private OptionalBool() {}
}
