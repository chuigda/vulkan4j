package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorOrientationEXT.html"><code>XrPlaneDetectorOrientationEXT</code></a>
public final class XrPlaneDetectorOrientationEXT {
    public static final int HORIZONTAL_UPWARD = 0x0;
    public static final int HORIZONTAL_DOWNWARD = 0x1;
    public static final int VERTICAL = 0x2;
    public static final int ARBITRARY = 0x3;

    public static String explain(@EnumType(XrPlaneDetectorOrientationEXT.class) int value) {
        return switch (value) {
            case XrPlaneDetectorOrientationEXT.ARBITRARY -> "XR_PLANE_DETECTOR_ORIENTATION_ARBITRARY_EXT";
            case XrPlaneDetectorOrientationEXT.HORIZONTAL_DOWNWARD -> "XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_DOWNWARD_EXT";
            case XrPlaneDetectorOrientationEXT.HORIZONTAL_UPWARD -> "XR_PLANE_DETECTOR_ORIENTATION_HORIZONTAL_UPWARD_EXT";
            case XrPlaneDetectorOrientationEXT.VERTICAL -> "XR_PLANE_DETECTOR_ORIENTATION_VERTICAL_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPlaneDetectorOrientationEXT() {}
}
