package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialCapabilityFeatureEXT.html"><code>XrSpatialCapabilityFeatureEXT</code></a>
public final class XrSpatialCapabilityFeatureEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_FEATURE_MARKER_TRACKING_FIXED_SIZE_MARKERS_EXT.html"><code>XR_SPATIAL_CAPABILITY_FEATURE_MARKER_TRACKING_FIXED_SIZE_MARKERS_EXT</code></a>
    public static final int MARKER_TRACKING_FIXED_SIZE_MARKERS = 0x3ba62058;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_FEATURE_MARKER_TRACKING_STATIC_MARKERS_EXT.html"><code>XR_SPATIAL_CAPABILITY_FEATURE_MARKER_TRACKING_STATIC_MARKERS_EXT</code></a>
    public static final int MARKER_TRACKING_STATIC_MARKERS = 0x3ba62059;

    public static String explain(@EnumType(XrSpatialCapabilityFeatureEXT.class) int value) {
        return switch (value) {
            case XrSpatialCapabilityFeatureEXT.MARKER_TRACKING_FIXED_SIZE_MARKERS -> "XR_SPATIAL_CAPABILITY_FEATURE_MARKER_TRACKING_FIXED_SIZE_MARKERS_EXT";
            case XrSpatialCapabilityFeatureEXT.MARKER_TRACKING_STATIC_MARKERS -> "XR_SPATIAL_CAPABILITY_FEATURE_MARKER_TRACKING_STATIC_MARKERS_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialCapabilityFeatureEXT() {}
}
