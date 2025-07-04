package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompareOpFB.html"><code>XrCompareOpFB</code></a>
public final class XrCompareOpFB {
    public static final int NEVER = 0x0;
    public static final int LESS = 0x1;
    public static final int EQUAL = 0x2;
    public static final int LESS_OR_EQUAL = 0x3;
    public static final int GREATER = 0x4;
    public static final int NOT_EQUAL = 0x5;
    public static final int GREATER_OR_EQUAL = 0x6;
    public static final int ALWAYS = 0x7;

    public static String explain(@EnumType(XrCompareOpFB.class) int value) {
        return switch (value) {
            case XrCompareOpFB.ALWAYS -> "XR_COMPARE_OP_ALWAYS_FB";
            case XrCompareOpFB.EQUAL -> "XR_COMPARE_OP_EQUAL_FB";
            case XrCompareOpFB.GREATER -> "XR_COMPARE_OP_GREATER_FB";
            case XrCompareOpFB.GREATER_OR_EQUAL -> "XR_COMPARE_OP_GREATER_OR_EQUAL_FB";
            case XrCompareOpFB.LESS -> "XR_COMPARE_OP_LESS_FB";
            case XrCompareOpFB.LESS_OR_EQUAL -> "XR_COMPARE_OP_LESS_OR_EQUAL_FB";
            case XrCompareOpFB.NEVER -> "XR_COMPARE_OP_NEVER_FB";
            case XrCompareOpFB.NOT_EQUAL -> "XR_COMPARE_OP_NOT_EQUAL_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrCompareOpFB() {}
}
