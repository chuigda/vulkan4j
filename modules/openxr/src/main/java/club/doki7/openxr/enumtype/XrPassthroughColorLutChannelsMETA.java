package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughColorLutChannelsMETA.html"><code>XrPassthroughColorLutChannelsMETA</code></a>
public final class XrPassthroughColorLutChannelsMETA {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META.html"><code>XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META</code></a>
    public static final int RGB = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META.html"><code>XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META</code></a>
    public static final int RGBA = 0x2;

    public static String explain(@EnumType(XrPassthroughColorLutChannelsMETA.class) int value) {
        return switch (value) {
            case XrPassthroughColorLutChannelsMETA.RGBA -> "XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGBA_META";
            case XrPassthroughColorLutChannelsMETA.RGB -> "XR_PASSTHROUGH_COLOR_LUT_CHANNELS_RGB_META";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughColorLutChannelsMETA() {}
}
