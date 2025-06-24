package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectionStateEXT.html"><code>XrPlaneDetectionStateEXT</code></a>
public final class XrPlaneDetectionStateEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_STATE_NONE_EXT.html"><code>XR_PLANE_DETECTION_STATE_NONE_EXT</code></a>
    public static final int NONE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_STATE_PENDING_EXT.html"><code>XR_PLANE_DETECTION_STATE_PENDING_EXT</code></a>
    public static final int PENDING = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_STATE_DONE_EXT.html"><code>XR_PLANE_DETECTION_STATE_DONE_EXT</code></a>
    public static final int DONE = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_STATE_ERROR_EXT.html"><code>XR_PLANE_DETECTION_STATE_ERROR_EXT</code></a>
    public static final int ERROR = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_STATE_FATAL_EXT.html"><code>XR_PLANE_DETECTION_STATE_FATAL_EXT</code></a>
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
