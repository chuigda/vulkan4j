package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionSetFB.html"><code>XrFaceExpressionSetFB</code></a>
public final class XrFaceExpressionSetFB {
    public static final int DEFAULT = 0x0;

    public static String explain(@EnumType(XrFaceExpressionSetFB.class) int value) {
        return switch (value) {
            case XrFaceExpressionSetFB.DEFAULT -> "XR_FACE_EXPRESSION_SET_DEFAULT_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFaceExpressionSetFB() {}
}
