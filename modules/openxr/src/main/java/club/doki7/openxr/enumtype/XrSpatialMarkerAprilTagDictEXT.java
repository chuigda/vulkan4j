package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMarkerAprilTagDictEXT.html"><code>XrSpatialMarkerAprilTagDictEXT</code></a>
public final class XrSpatialMarkerAprilTagDictEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MARKER_APRIL_TAG_DICT_16H5_EXT.html"><code>XR_SPATIAL_MARKER_APRIL_TAG_DICT_16H5_EXT</code></a>
    public static final int _16H5 = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MARKER_APRIL_TAG_DICT_25H9_EXT.html"><code>XR_SPATIAL_MARKER_APRIL_TAG_DICT_25H9_EXT</code></a>
    public static final int _25H9 = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MARKER_APRIL_TAG_DICT_36H10_EXT.html"><code>XR_SPATIAL_MARKER_APRIL_TAG_DICT_36H10_EXT</code></a>
    public static final int _36H10 = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MARKER_APRIL_TAG_DICT_36H11_EXT.html"><code>XR_SPATIAL_MARKER_APRIL_TAG_DICT_36H11_EXT</code></a>
    public static final int _36H11 = 0x4;

    public static String explain(@EnumType(XrSpatialMarkerAprilTagDictEXT.class) int value) {
        return switch (value) {
            case XrSpatialMarkerAprilTagDictEXT._16H5 -> "XR_SPATIAL_MARKER_APRIL_TAG_DICT_16H5_EXT";
            case XrSpatialMarkerAprilTagDictEXT._25H9 -> "XR_SPATIAL_MARKER_APRIL_TAG_DICT_25H9_EXT";
            case XrSpatialMarkerAprilTagDictEXT._36H10 -> "XR_SPATIAL_MARKER_APRIL_TAG_DICT_36H10_EXT";
            case XrSpatialMarkerAprilTagDictEXT._36H11 -> "XR_SPATIAL_MARKER_APRIL_TAG_DICT_36H11_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialMarkerAprilTagDictEXT() {}
}
