package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialTrackingTypeHTC.html"><code>XrFacialTrackingTypeHTC</code></a>
public final class XrFacialTrackingTypeHTC {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC.html"><code>XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC</code></a>
    public static final int EYE_DEFAULT = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC.html"><code>XR_FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC</code></a>
    public static final int LIP_DEFAULT = 0x2;

    public static String explain(@EnumType(XrFacialTrackingTypeHTC.class) int value) {
        return switch (value) {
            case XrFacialTrackingTypeHTC.EYE_DEFAULT -> "XR_FACIAL_TRACKING_TYPE_EYE_DEFAULT_HTC";
            case XrFacialTrackingTypeHTC.LIP_DEFAULT -> "XR_FACIAL_TRACKING_TYPE_LIP_DEFAULT_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFacialTrackingTypeHTC() {}
}
