package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrForceFeedbackCurlLocationMNDX.html"><code>XrForceFeedbackCurlLocationMNDX</code></a>
public final class XrForceFeedbackCurlLocationMNDX {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX.html"><code>XR_FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX</code></a>
    public static final int THUMB_CURL = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX.html"><code>XR_FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX</code></a>
    public static final int INDEX_CURL = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX.html"><code>XR_FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX</code></a>
    public static final int MIDDLE_CURL = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX.html"><code>XR_FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX</code></a>
    public static final int RING_CURL = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX.html"><code>XR_FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX</code></a>
    public static final int LITTLE_CURL = 0x4;

    public static String explain(@EnumType(XrForceFeedbackCurlLocationMNDX.class) int value) {
        return switch (value) {
            case XrForceFeedbackCurlLocationMNDX.INDEX_CURL -> "XR_FORCE_FEEDBACK_CURL_LOCATION_INDEX_CURL_MNDX";
            case XrForceFeedbackCurlLocationMNDX.LITTLE_CURL -> "XR_FORCE_FEEDBACK_CURL_LOCATION_LITTLE_CURL_MNDX";
            case XrForceFeedbackCurlLocationMNDX.MIDDLE_CURL -> "XR_FORCE_FEEDBACK_CURL_LOCATION_MIDDLE_CURL_MNDX";
            case XrForceFeedbackCurlLocationMNDX.RING_CURL -> "XR_FORCE_FEEDBACK_CURL_LOCATION_RING_CURL_MNDX";
            case XrForceFeedbackCurlLocationMNDX.THUMB_CURL -> "XR_FORCE_FEEDBACK_CURL_LOCATION_THUMB_CURL_MNDX";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrForceFeedbackCurlLocationMNDX() {}
}
