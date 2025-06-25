package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionSet2FB.html"><code>XrFaceExpressionSet2FB</code></a>
public final class XrFaceExpressionSet2FB {
    public static final int DEFAULT = 0x0;

    public static String explain(@EnumType(XrFaceExpressionSet2FB.class) int value) {
        return switch (value) {
            case XrFaceExpressionSet2FB.DEFAULT -> "XR_FACE_EXPRESSION_SET2_DEFAULT_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFaceExpressionSet2FB() {}
}
