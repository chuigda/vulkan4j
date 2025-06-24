package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorStatusML.html"><code>XrMarkerDetectorStatusML</code></a>
public final class XrMarkerDetectorStatusML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_STATUS_PENDING_ML.html"><code>XR_MARKER_DETECTOR_STATUS_PENDING_ML</code></a>
    public static final int PENDING = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_STATUS_READY_ML.html"><code>XR_MARKER_DETECTOR_STATUS_READY_ML</code></a>
    public static final int READY = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_STATUS_ERROR_ML.html"><code>XR_MARKER_DETECTOR_STATUS_ERROR_ML</code></a>
    public static final int ERROR = 0x2;

    public static String explain(@EnumType(XrMarkerDetectorStatusML.class) int value) {
        return switch (value) {
            case XrMarkerDetectorStatusML.ERROR -> "XR_MARKER_DETECTOR_STATUS_ERROR_ML";
            case XrMarkerDetectorStatusML.PENDING -> "XR_MARKER_DETECTOR_STATUS_PENDING_ML";
            case XrMarkerDetectorStatusML.READY -> "XR_MARKER_DETECTOR_STATUS_READY_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerDetectorStatusML() {}
}
