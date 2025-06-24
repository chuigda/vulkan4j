package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerTypeML.html"><code>XrMarkerTypeML</code></a>
public final class XrMarkerTypeML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_TYPE_ARUCO_ML.html"><code>XR_MARKER_TYPE_ARUCO_ML</code></a>
    public static final int ARUCO = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_TYPE_APRIL_TAG_ML.html"><code>XR_MARKER_TYPE_APRIL_TAG_ML</code></a>
    public static final int APRIL_TAG = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_TYPE_QR_ML.html"><code>XR_MARKER_TYPE_QR_ML</code></a>
    public static final int QR = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_TYPE_EAN_13_ML.html"><code>XR_MARKER_TYPE_EAN_13_ML</code></a>
    public static final int EAN_13 = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_TYPE_UPC_A_ML.html"><code>XR_MARKER_TYPE_UPC_A_ML</code></a>
    public static final int UPC_A = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MARKER_TYPE_CODE_128_ML.html"><code>XR_MARKER_TYPE_CODE_128_ML</code></a>
    public static final int CODE_128 = 0x5;

    public static String explain(@EnumType(XrMarkerTypeML.class) int value) {
        return switch (value) {
            case XrMarkerTypeML.APRIL_TAG -> "XR_MARKER_TYPE_APRIL_TAG_ML";
            case XrMarkerTypeML.ARUCO -> "XR_MARKER_TYPE_ARUCO_ML";
            case XrMarkerTypeML.CODE_128 -> "XR_MARKER_TYPE_CODE_128_ML";
            case XrMarkerTypeML.EAN_13 -> "XR_MARKER_TYPE_EAN_13_ML";
            case XrMarkerTypeML.QR -> "XR_MARKER_TYPE_QR_ML";
            case XrMarkerTypeML.UPC_A -> "XR_MARKER_TYPE_UPC_A_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerTypeML() {}
}
