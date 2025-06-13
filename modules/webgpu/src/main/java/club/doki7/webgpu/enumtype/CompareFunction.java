package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompareFunction {
    public static final int COMPARE_FUNCTION_UNDEFINED = 0x0;
    public static final int COMPARE_FUNCTION_NEVER = 0x1;
    public static final int COMPARE_FUNCTION_LESS = 0x2;
    public static final int COMPARE_FUNCTION_EQUAL = 0x3;
    public static final int COMPARE_FUNCTION_LESS_EQUAL = 0x4;
    public static final int COMPARE_FUNCTION_GREATER = 0x5;
    public static final int COMPARE_FUNCTION_NOT_EQUAL = 0x6;
    public static final int COMPARE_FUNCTION_GREATER_EQUAL = 0x7;
    public static final int COMPARE_FUNCTION_ALWAYS = 0x8;
    public static final int COMPARE_FUNCTION_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompareFunction.class) int value) {
        return switch (value) {
            case CompareFunction.COMPARE_FUNCTION_ALWAYS -> "COMPARE_FUNCTION_ALWAYS";
            case CompareFunction.COMPARE_FUNCTION_EQUAL -> "COMPARE_FUNCTION_EQUAL";
            case CompareFunction.COMPARE_FUNCTION_FORCE32 -> "COMPARE_FUNCTION_FORCE32";
            case CompareFunction.COMPARE_FUNCTION_GREATER -> "COMPARE_FUNCTION_GREATER";
            case CompareFunction.COMPARE_FUNCTION_GREATER_EQUAL -> "COMPARE_FUNCTION_GREATER_EQUAL";
            case CompareFunction.COMPARE_FUNCTION_LESS -> "COMPARE_FUNCTION_LESS";
            case CompareFunction.COMPARE_FUNCTION_LESS_EQUAL -> "COMPARE_FUNCTION_LESS_EQUAL";
            case CompareFunction.COMPARE_FUNCTION_NEVER -> "COMPARE_FUNCTION_NEVER";
            case CompareFunction.COMPARE_FUNCTION_NOT_EQUAL -> "COMPARE_FUNCTION_NOT_EQUAL";
            case CompareFunction.COMPARE_FUNCTION_UNDEFINED -> "COMPARE_FUNCTION_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompareFunction() {}
}
