package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorResolutionML.html"><code>XrMarkerDetectorResolutionML</code></a>
public final class XrMarkerDetectorResolutionML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_RESOLUTION_LOW_ML.html"><code>XR_MARKER_DETECTOR_RESOLUTION_LOW_ML</code></a>
    public static final int LOW = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_RESOLUTION_MEDIUM_ML.html"><code>XR_MARKER_DETECTOR_RESOLUTION_MEDIUM_ML</code></a>
    public static final int MEDIUM = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_RESOLUTION_HIGH_ML.html"><code>XR_MARKER_DETECTOR_RESOLUTION_HIGH_ML</code></a>
    public static final int HIGH = 0x2;

    public static String explain(@EnumType(XrMarkerDetectorResolutionML.class) int value) {
        return switch (value) {
            case XrMarkerDetectorResolutionML.HIGH -> "XR_MARKER_DETECTOR_RESOLUTION_HIGH_ML";
            case XrMarkerDetectorResolutionML.LOW -> "XR_MARKER_DETECTOR_RESOLUTION_LOW_ML";
            case XrMarkerDetectorResolutionML.MEDIUM -> "XR_MARKER_DETECTOR_RESOLUTION_MEDIUM_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerDetectorResolutionML() {}
}
