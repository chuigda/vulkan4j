package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialCapabilityEXT.html"><code>XrSpatialCapabilityEXT</code></a>
public final class XrSpatialCapabilityEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_PLANE_TRACKING_EXT.html"><code>XR_SPATIAL_CAPABILITY_PLANE_TRACKING_EXT</code></a>
    public static final int PLANE_TRACKING = 0x3ba61888;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_MARKER_TRACKING_QR_CODE_EXT.html"><code>XR_SPATIAL_CAPABILITY_MARKER_TRACKING_QR_CODE_EXT</code></a>
    public static final int MARKER_TRACKING_QR_CODE = 0x3ba62058;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_MARKER_TRACKING_MICRO_QR_CODE_EXT.html"><code>XR_SPATIAL_CAPABILITY_MARKER_TRACKING_MICRO_QR_CODE_EXT</code></a>
    public static final int MARKER_TRACKING_MICRO_QR_CODE = 0x3ba62059;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_MARKER_TRACKING_ARUCO_MARKER_EXT.html"><code>XR_SPATIAL_CAPABILITY_MARKER_TRACKING_ARUCO_MARKER_EXT</code></a>
    public static final int MARKER_TRACKING_ARUCO_MARKER = 0x3ba6205a;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_MARKER_TRACKING_APRIL_TAG_EXT.html"><code>XR_SPATIAL_CAPABILITY_MARKER_TRACKING_APRIL_TAG_EXT</code></a>
    public static final int MARKER_TRACKING_APRIL_TAG = 0x3ba6205b;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_CAPABILITY_ANCHOR_EXT.html"><code>XR_SPATIAL_CAPABILITY_ANCHOR_EXT</code></a>
    public static final int ANCHOR = 0x3ba66a90;

    public static String explain(@EnumType(XrSpatialCapabilityEXT.class) int value) {
        return switch (value) {
            case XrSpatialCapabilityEXT.ANCHOR -> "XR_SPATIAL_CAPABILITY_ANCHOR_EXT";
            case XrSpatialCapabilityEXT.MARKER_TRACKING_APRIL_TAG -> "XR_SPATIAL_CAPABILITY_MARKER_TRACKING_APRIL_TAG_EXT";
            case XrSpatialCapabilityEXT.MARKER_TRACKING_ARUCO_MARKER -> "XR_SPATIAL_CAPABILITY_MARKER_TRACKING_ARUCO_MARKER_EXT";
            case XrSpatialCapabilityEXT.MARKER_TRACKING_MICRO_QR_CODE -> "XR_SPATIAL_CAPABILITY_MARKER_TRACKING_MICRO_QR_CODE_EXT";
            case XrSpatialCapabilityEXT.MARKER_TRACKING_QR_CODE -> "XR_SPATIAL_CAPABILITY_MARKER_TRACKING_QR_CODE_EXT";
            case XrSpatialCapabilityEXT.PLANE_TRACKING -> "XR_SPATIAL_CAPABILITY_PLANE_TRACKING_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialCapabilityEXT() {}
}
