package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompareFunction {
    public static final int UNDEFINED = 0x0;
    public static final int NEVER = 0x1;
    public static final int LESS = 0x2;
    public static final int EQUAL = 0x3;
    public static final int LESS_EQUAL = 0x4;
    public static final int GREATER = 0x5;
    public static final int NOT_EQUAL = 0x6;
    public static final int GREATER_EQUAL = 0x7;
    public static final int ALWAYS = 0x8;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompareFunction.class) int value) {
        return switch (value) {
            case CompareFunction.ALWAYS -> "ALWAYS";
            case CompareFunction.EQUAL -> "EQUAL";
            case CompareFunction.FORCE32 -> "FORCE32";
            case CompareFunction.GREATER -> "GREATER";
            case CompareFunction.GREATER_EQUAL -> "GREATER_EQUAL";
            case CompareFunction.LESS -> "LESS";
            case CompareFunction.LESS_EQUAL -> "LESS_EQUAL";
            case CompareFunction.NEVER -> "NEVER";
            case CompareFunction.NOT_EQUAL -> "NOT_EQUAL";
            case CompareFunction.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompareFunction() {}
}
