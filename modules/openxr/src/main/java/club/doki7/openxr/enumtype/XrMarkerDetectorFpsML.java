package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorFpsML.html"><code>XrMarkerDetectorFpsML</code></a>
public final class XrMarkerDetectorFpsML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_FPS_LOW_ML.html"><code>XR_MARKER_DETECTOR_FPS_LOW_ML</code></a>
    public static final int LOW = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_FPS_MEDIUM_ML.html"><code>XR_MARKER_DETECTOR_FPS_MEDIUM_ML</code></a>
    public static final int MEDIUM = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_FPS_HIGH_ML.html"><code>XR_MARKER_DETECTOR_FPS_HIGH_ML</code></a>
    public static final int HIGH = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_FPS_MAX_ML.html"><code>XR_MARKER_DETECTOR_FPS_MAX_ML</code></a>
    public static final int MAX = 0x3;

    public static String explain(@EnumType(XrMarkerDetectorFpsML.class) int value) {
        return switch (value) {
            case XrMarkerDetectorFpsML.HIGH -> "XR_MARKER_DETECTOR_FPS_HIGH_ML";
            case XrMarkerDetectorFpsML.LOW -> "XR_MARKER_DETECTOR_FPS_LOW_ML";
            case XrMarkerDetectorFpsML.MAX -> "XR_MARKER_DETECTOR_FPS_MAX_ML";
            case XrMarkerDetectorFpsML.MEDIUM -> "XR_MARKER_DETECTOR_FPS_MEDIUM_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerDetectorFpsML() {}
}
