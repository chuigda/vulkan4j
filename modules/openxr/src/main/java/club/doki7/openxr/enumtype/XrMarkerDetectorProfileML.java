package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorProfileML.html"><code>XrMarkerDetectorProfileML</code></a>
public final class XrMarkerDetectorProfileML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_PROFILE_DEFAULT_ML.html"><code>XR_MARKER_DETECTOR_PROFILE_DEFAULT_ML</code></a>
    public static final int DEFAULT = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_PROFILE_SPEED_ML.html"><code>XR_MARKER_DETECTOR_PROFILE_SPEED_ML</code></a>
    public static final int SPEED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_PROFILE_ACCURACY_ML.html"><code>XR_MARKER_DETECTOR_PROFILE_ACCURACY_ML</code></a>
    public static final int ACCURACY = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML.html"><code>XR_MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML</code></a>
    public static final int SMALL_TARGETS = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_PROFILE_LARGE_FOV_ML.html"><code>XR_MARKER_DETECTOR_PROFILE_LARGE_FOV_ML</code></a>
    public static final int LARGE_FOV = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_PROFILE_CUSTOM_ML.html"><code>XR_MARKER_DETECTOR_PROFILE_CUSTOM_ML</code></a>
    public static final int CUSTOM = 0x5;

    public static String explain(@EnumType(XrMarkerDetectorProfileML.class) int value) {
        return switch (value) {
            case XrMarkerDetectorProfileML.ACCURACY -> "XR_MARKER_DETECTOR_PROFILE_ACCURACY_ML";
            case XrMarkerDetectorProfileML.CUSTOM -> "XR_MARKER_DETECTOR_PROFILE_CUSTOM_ML";
            case XrMarkerDetectorProfileML.DEFAULT -> "XR_MARKER_DETECTOR_PROFILE_DEFAULT_ML";
            case XrMarkerDetectorProfileML.LARGE_FOV -> "XR_MARKER_DETECTOR_PROFILE_LARGE_FOV_ML";
            case XrMarkerDetectorProfileML.SMALL_TARGETS -> "XR_MARKER_DETECTOR_PROFILE_SMALL_TARGETS_ML";
            case XrMarkerDetectorProfileML.SPEED -> "XR_MARKER_DETECTOR_PROFILE_SPEED_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerDetectorProfileML() {}
}
