package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceConfidenceFB.html"><code>XrFaceConfidenceFB</code></a>
public final class XrFaceConfidenceFB {
    public static final int LOWER_FACE = 0x0;
    public static final int UPPER_FACE = 0x1;
    public static final int COUNT = 0x2;

    public static String explain(@EnumType(XrFaceConfidenceFB.class) int value) {
        return switch (value) {
            case XrFaceConfidenceFB.COUNT -> "XR_FACE_CONFIDENCE_COUNT_FB";
            case XrFaceConfidenceFB.LOWER_FACE -> "XR_FACE_CONFIDENCE_LOWER_FACE_FB";
            case XrFaceConfidenceFB.UPPER_FACE -> "XR_FACE_CONFIDENCE_UPPER_FACE_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFaceConfidenceFB() {}
}
