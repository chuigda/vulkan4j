package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1InterpolationFilter.html">StdVideoAV1InterpolationFilter</a>
public final class StdVideoAV1InterpolationFilter {
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP = 0;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH = 1;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SHARP = 2;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_BILINEAR = 3;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_SWITCHABLE = 4;
    public static final int STD_VIDEO_AV1_INTERPOLATION_FILTER_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1InterpolationFilter.class) int value) {
        return switch (value) {
            case StdVideoAV1InterpolationFilter.STD_VIDEO_AV1_INTERPOLATION_FILTER_BILINEAR -> "STD_VIDEO_AV1_INTERPOLATION_FILTER_BILINEAR";
            case StdVideoAV1InterpolationFilter.STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP -> "STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP";
            case StdVideoAV1InterpolationFilter.STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SHARP -> "STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SHARP";
            case StdVideoAV1InterpolationFilter.STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH -> "STD_VIDEO_AV1_INTERPOLATION_FILTER_EIGHTTAP_SMOOTH";
            case StdVideoAV1InterpolationFilter.STD_VIDEO_AV1_INTERPOLATION_FILTER_INVALID -> "STD_VIDEO_AV1_INTERPOLATION_FILTER_INVALID";
            case StdVideoAV1InterpolationFilter.STD_VIDEO_AV1_INTERPOLATION_FILTER_SWITCHABLE -> "STD_VIDEO_AV1_INTERPOLATION_FILTER_SWITCHABLE";
            default -> "Unknown StdVideoAV1InterpolationFilter: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1InterpolationFilter() {}
}
