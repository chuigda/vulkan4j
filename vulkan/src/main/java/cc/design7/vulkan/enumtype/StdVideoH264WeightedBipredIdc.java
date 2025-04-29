package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264WeightedBipredIdc.html">StdVideoH264WeightedBipredIdc</a>
public final class StdVideoH264WeightedBipredIdc {
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT = 0;
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT = 1;
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT = 2;
    public static final int STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264WeightedBipredIdc.class) int value) {
        return switch (value) {
            case StdVideoH264WeightedBipredIdc.STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT -> "STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_DEFAULT";
            case StdVideoH264WeightedBipredIdc.STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT -> "STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_EXPLICIT";
            case StdVideoH264WeightedBipredIdc.STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT -> "STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_IMPLICIT";
            case StdVideoH264WeightedBipredIdc.STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID -> "STD_VIDEO_H264_WEIGHTED_BIPRED_IDC_INVALID";
            default -> "Unknown StdVideoH264WeightedBipredIdc: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264WeightedBipredIdc() {}
}
