package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerAprilTagDictML.html"><code>XrMarkerAprilTagDictML</code></a>
public final class XrMarkerAprilTagDictML {
    public static final int _16H5 = 0x0;
    public static final int _25H9 = 0x1;
    public static final int _36H10 = 0x2;
    public static final int _36H11 = 0x3;

    public static String explain(@EnumType(XrMarkerAprilTagDictML.class) int value) {
        return switch (value) {
            case XrMarkerAprilTagDictML._16H5 -> "XR_MARKER_APRIL_TAG_DICT_16H5_ML";
            case XrMarkerAprilTagDictML._25H9 -> "XR_MARKER_APRIL_TAG_DICT_25H9_ML";
            case XrMarkerAprilTagDictML._36H10 -> "XR_MARKER_APRIL_TAG_DICT_36H10_ML";
            case XrMarkerAprilTagDictML._36H11 -> "XR_MARKER_APRIL_TAG_DICT_36H11_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerAprilTagDictML() {}
}
