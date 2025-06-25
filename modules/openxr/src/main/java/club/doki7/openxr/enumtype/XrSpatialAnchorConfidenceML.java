package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorConfidenceML.html"><code>XrSpatialAnchorConfidenceML</code></a>
public final class XrSpatialAnchorConfidenceML {
    public static final int LOW = 0x0;
    public static final int MEDIUM = 0x1;
    public static final int HIGH = 0x2;

    public static String explain(@EnumType(XrSpatialAnchorConfidenceML.class) int value) {
        return switch (value) {
            case XrSpatialAnchorConfidenceML.HIGH -> "XR_SPATIAL_ANCHOR_CONFIDENCE_HIGH_ML";
            case XrSpatialAnchorConfidenceML.LOW -> "XR_SPATIAL_ANCHOR_CONFIDENCE_LOW_ML";
            case XrSpatialAnchorConfidenceML.MEDIUM -> "XR_SPATIAL_ANCHOR_CONFIDENCE_MEDIUM_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialAnchorConfidenceML() {}
}
