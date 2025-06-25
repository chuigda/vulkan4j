package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneOrientationBD.html"><code>XrPlaneOrientationBD</code></a>
public final class XrPlaneOrientationBD {
    public static final int HORIZONTAL_UPWARD = 0x0;
    public static final int HORIZONTAL_DOWNWARD = 0x1;
    public static final int VERTICAL = 0x2;
    public static final int ARBITRARY = 0x3;

    public static String explain(@EnumType(XrPlaneOrientationBD.class) int value) {
        return switch (value) {
            case XrPlaneOrientationBD.ARBITRARY -> "XR_PLANE_ORIENTATION_ARBITRARY_BD";
            case XrPlaneOrientationBD.HORIZONTAL_DOWNWARD -> "XR_PLANE_ORIENTATION_HORIZONTAL_DOWNWARD_BD";
            case XrPlaneOrientationBD.HORIZONTAL_UPWARD -> "XR_PLANE_ORIENTATION_HORIZONTAL_UPWARD_BD";
            case XrPlaneOrientationBD.VERTICAL -> "XR_PLANE_ORIENTATION_VERTICAL_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPlaneOrientationBD() {}
}
