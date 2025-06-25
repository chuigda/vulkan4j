package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPlaneAlignmentEXT.html"><code>XrSpatialPlaneAlignmentEXT</code></a>
public final class XrSpatialPlaneAlignmentEXT {
    public static final int HORIZONTAL_UPWARD = 0x0;
    public static final int HORIZONTAL_DOWNWARD = 0x1;
    public static final int VERTICAL = 0x2;
    public static final int ARBITRARY = 0x3;

    public static String explain(@EnumType(XrSpatialPlaneAlignmentEXT.class) int value) {
        return switch (value) {
            case XrSpatialPlaneAlignmentEXT.ARBITRARY -> "XR_SPATIAL_PLANE_ALIGNMENT_ARBITRARY_EXT";
            case XrSpatialPlaneAlignmentEXT.HORIZONTAL_DOWNWARD -> "XR_SPATIAL_PLANE_ALIGNMENT_HORIZONTAL_DOWNWARD_EXT";
            case XrSpatialPlaneAlignmentEXT.HORIZONTAL_UPWARD -> "XR_SPATIAL_PLANE_ALIGNMENT_HORIZONTAL_UPWARD_EXT";
            case XrSpatialPlaneAlignmentEXT.VERTICAL -> "XR_SPATIAL_PLANE_ALIGNMENT_VERTICAL_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialPlaneAlignmentEXT() {}
}
