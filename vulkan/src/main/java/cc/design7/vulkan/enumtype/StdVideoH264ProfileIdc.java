package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264ProfileIdc.html">StdVideoH264ProfileIdc</a>
public final class StdVideoH264ProfileIdc {
    public static final int STD_VIDEO_H264_PROFILE_IDC_BASELINE = 66;
    public static final int STD_VIDEO_H264_PROFILE_IDC_MAIN = 77;
    public static final int STD_VIDEO_H264_PROFILE_IDC_HIGH = 100;
    public static final int STD_VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE = 244;
    public static final int STD_VIDEO_H264_PROFILE_IDC_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264ProfileIdc.class) int value) {
        return switch (value) {
            case StdVideoH264ProfileIdc.STD_VIDEO_H264_PROFILE_IDC_BASELINE -> "STD_VIDEO_H264_PROFILE_IDC_BASELINE";
            case StdVideoH264ProfileIdc.STD_VIDEO_H264_PROFILE_IDC_HIGH -> "STD_VIDEO_H264_PROFILE_IDC_HIGH";
            case StdVideoH264ProfileIdc.STD_VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE -> "STD_VIDEO_H264_PROFILE_IDC_HIGH_444_PREDICTIVE";
            case StdVideoH264ProfileIdc.STD_VIDEO_H264_PROFILE_IDC_INVALID -> "STD_VIDEO_H264_PROFILE_IDC_INVALID";
            case StdVideoH264ProfileIdc.STD_VIDEO_H264_PROFILE_IDC_MAIN -> "STD_VIDEO_H264_PROFILE_IDC_MAIN";
            default -> "Unknown StdVideoH264ProfileIdc: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264ProfileIdc() {}
}
