package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorCornerRefineMethodML.html"><code>XrMarkerDetectorCornerRefineMethodML</code></a>
public final class XrMarkerDetectorCornerRefineMethodML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML.html"><code>XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML</code></a>
    public static final int NONE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML.html"><code>XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML</code></a>
    public static final int SUBPIX = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML.html"><code>XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML</code></a>
    public static final int CONTOUR = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML.html"><code>XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML</code></a>
    public static final int APRIL_TAG = 0x3;

    public static String explain(@EnumType(XrMarkerDetectorCornerRefineMethodML.class) int value) {
        return switch (value) {
            case XrMarkerDetectorCornerRefineMethodML.APRIL_TAG -> "XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_APRIL_TAG_ML";
            case XrMarkerDetectorCornerRefineMethodML.CONTOUR -> "XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_CONTOUR_ML";
            case XrMarkerDetectorCornerRefineMethodML.NONE -> "XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_NONE_ML";
            case XrMarkerDetectorCornerRefineMethodML.SUBPIX -> "XR_MARKER_DETECTOR_CORNER_REFINE_METHOD_SUBPIX_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerDetectorCornerRefineMethodML() {}
}
