package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectionStateEXT.html"><code>XrPlaneDetectionStateEXT</code></a>
public final class XrPlaneDetectionStateEXT {
    public static final int NONE = 0x0;
    public static final int PENDING = 0x1;
    public static final int DONE = 0x2;
    public static final int ERROR = 0x3;
    public static final int FATAL = 0x4;

    public static String explain(@EnumType(XrPlaneDetectionStateEXT.class) int value) {
        return switch (value) {
            case XrPlaneDetectionStateEXT.DONE -> "XR_PLANE_DETECTION_STATE_DONE_EXT";
            case XrPlaneDetectionStateEXT.ERROR -> "XR_PLANE_DETECTION_STATE_ERROR_EXT";
            case XrPlaneDetectionStateEXT.FATAL -> "XR_PLANE_DETECTION_STATE_FATAL_EXT";
            case XrPlaneDetectionStateEXT.NONE -> "XR_PLANE_DETECTION_STATE_NONE_EXT";
            case XrPlaneDetectionStateEXT.PENDING -> "XR_PLANE_DETECTION_STATE_PENDING_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPlaneDetectionStateEXT() {}
}
