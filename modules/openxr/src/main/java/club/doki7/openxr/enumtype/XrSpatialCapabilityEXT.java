package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialCapabilityEXT.html"><code>XrSpatialCapabilityEXT</code></a>
public final class XrSpatialCapabilityEXT {
    public static final int PLANE_TRACKING = 0x3ba61888;
    public static final int MARKER_TRACKING_QR_CODE = 0x3ba62058;
    public static final int MARKER_TRACKING_MICRO_QR_CODE = 0x3ba62059;
    public static final int MARKER_TRACKING_ARUCO_MARKER = 0x3ba6205a;
    public static final int MARKER_TRACKING_APRIL_TAG = 0x3ba6205b;
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
