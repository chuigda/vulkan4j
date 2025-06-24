package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHeadsetFitStatusML.html"><code>XrHeadsetFitStatusML</code></a>
public final class XrHeadsetFitStatusML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HEADSET_FIT_STATUS_UNKNOWN_ML.html"><code>XR_HEADSET_FIT_STATUS_UNKNOWN_ML</code></a>
    public static final int UNKNOWN = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HEADSET_FIT_STATUS_NOT_WORN_ML.html"><code>XR_HEADSET_FIT_STATUS_NOT_WORN_ML</code></a>
    public static final int NOT_WORN = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HEADSET_FIT_STATUS_GOOD_FIT_ML.html"><code>XR_HEADSET_FIT_STATUS_GOOD_FIT_ML</code></a>
    public static final int GOOD_FIT = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HEADSET_FIT_STATUS_BAD_FIT_ML.html"><code>XR_HEADSET_FIT_STATUS_BAD_FIT_ML</code></a>
    public static final int BAD_FIT = 0x3;

    public static String explain(@EnumType(XrHeadsetFitStatusML.class) int value) {
        return switch (value) {
            case XrHeadsetFitStatusML.BAD_FIT -> "XR_HEADSET_FIT_STATUS_BAD_FIT_ML";
            case XrHeadsetFitStatusML.GOOD_FIT -> "XR_HEADSET_FIT_STATUS_GOOD_FIT_ML";
            case XrHeadsetFitStatusML.NOT_WORN -> "XR_HEADSET_FIT_STATUS_NOT_WORN_ML";
            case XrHeadsetFitStatusML.UNKNOWN -> "XR_HEADSET_FIT_STATUS_UNKNOWN_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHeadsetFitStatusML() {}
}
