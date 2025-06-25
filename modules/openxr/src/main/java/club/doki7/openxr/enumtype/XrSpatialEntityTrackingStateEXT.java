package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityTrackingStateEXT.html"><code>XrSpatialEntityTrackingStateEXT</code></a>
public final class XrSpatialEntityTrackingStateEXT {
    public static final int STOPPED = 0x1;
    public static final int PAUSED = 0x2;
    public static final int TRACKING = 0x3;

    public static String explain(@EnumType(XrSpatialEntityTrackingStateEXT.class) int value) {
        return switch (value) {
            case XrSpatialEntityTrackingStateEXT.PAUSED -> "XR_SPATIAL_ENTITY_TRACKING_STATE_PAUSED_EXT";
            case XrSpatialEntityTrackingStateEXT.STOPPED -> "XR_SPATIAL_ENTITY_TRACKING_STATE_STOPPED_EXT";
            case XrSpatialEntityTrackingStateEXT.TRACKING -> "XR_SPATIAL_ENTITY_TRACKING_STATE_TRACKING_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialEntityTrackingStateEXT() {}
}
