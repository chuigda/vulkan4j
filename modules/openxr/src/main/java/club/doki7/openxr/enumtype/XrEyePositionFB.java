package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyePositionFB.html"><code>XrEyePositionFB</code></a>
public final class XrEyePositionFB {
    public static final int LEFT = 0x0;
    public static final int RIGHT = 0x1;
    public static final int COUNT = 0x2;

    public static String explain(@EnumType(XrEyePositionFB.class) int value) {
        return switch (value) {
            case XrEyePositionFB.COUNT -> "XR_EYE_POSITION_COUNT_FB";
            case XrEyePositionFB.LEFT -> "XR_EYE_POSITION_LEFT_FB";
            case XrEyePositionFB.RIGHT -> "XR_EYE_POSITION_RIGHT_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrEyePositionFB() {}
}
