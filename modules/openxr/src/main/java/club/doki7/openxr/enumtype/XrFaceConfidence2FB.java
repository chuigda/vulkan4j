package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceConfidence2FB.html"><code>XrFaceConfidence2FB</code></a>
public final class XrFaceConfidence2FB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACE_CONFIDENCE2_LOWER_FACE_FB.html"><code>XR_FACE_CONFIDENCE2_LOWER_FACE_FB</code></a>
    public static final int LOWER_FACE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACE_CONFIDENCE2_UPPER_FACE_FB.html"><code>XR_FACE_CONFIDENCE2_UPPER_FACE_FB</code></a>
    public static final int UPPER_FACE = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACE_CONFIDENCE2_COUNT_FB.html"><code>XR_FACE_CONFIDENCE2_COUNT_FB</code></a>
    public static final int COUNT = 0x2;

    public static String explain(@EnumType(XrFaceConfidence2FB.class) int value) {
        return switch (value) {
            case XrFaceConfidence2FB.COUNT -> "XR_FACE_CONFIDENCE2_COUNT_FB";
            case XrFaceConfidence2FB.LOWER_FACE -> "XR_FACE_CONFIDENCE2_LOWER_FACE_FB";
            case XrFaceConfidence2FB.UPPER_FACE -> "XR_FACE_CONFIDENCE2_UPPER_FACE_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFaceConfidence2FB() {}
}
