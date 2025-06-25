package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorSemanticTypeEXT.html"><code>XrPlaneDetectorSemanticTypeEXT</code></a>
public final class XrPlaneDetectorSemanticTypeEXT {
    public static final int UNDEFINED = 0x0;
    public static final int CEILING = 0x1;
    public static final int FLOOR = 0x2;
    public static final int WALL = 0x3;
    public static final int PLATFORM = 0x4;

    public static String explain(@EnumType(XrPlaneDetectorSemanticTypeEXT.class) int value) {
        return switch (value) {
            case XrPlaneDetectorSemanticTypeEXT.CEILING -> "XR_PLANE_DETECTOR_SEMANTIC_TYPE_CEILING_EXT";
            case XrPlaneDetectorSemanticTypeEXT.FLOOR -> "XR_PLANE_DETECTOR_SEMANTIC_TYPE_FLOOR_EXT";
            case XrPlaneDetectorSemanticTypeEXT.PLATFORM -> "XR_PLANE_DETECTOR_SEMANTIC_TYPE_PLATFORM_EXT";
            case XrPlaneDetectorSemanticTypeEXT.UNDEFINED -> "XR_PLANE_DETECTOR_SEMANTIC_TYPE_UNDEFINED_EXT";
            case XrPlaneDetectorSemanticTypeEXT.WALL -> "XR_PLANE_DETECTOR_SEMANTIC_TYPE_WALL_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPlaneDetectorSemanticTypeEXT() {}
}
