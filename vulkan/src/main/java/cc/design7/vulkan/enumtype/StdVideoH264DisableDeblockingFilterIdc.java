package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264DisableDeblockingFilterIdc.html">StdVideoH264DisableDeblockingFilterIdc</a>
public final class StdVideoH264DisableDeblockingFilterIdc {
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED = 0;
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED = 1;
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL = 2;
    public static final int STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264DisableDeblockingFilterIdc.class) int value) {
        return switch (value) {
            case StdVideoH264DisableDeblockingFilterIdc.STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED -> "STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_DISABLED";
            case StdVideoH264DisableDeblockingFilterIdc.STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED -> "STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_ENABLED";
            case StdVideoH264DisableDeblockingFilterIdc.STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID -> "STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_INVALID";
            case StdVideoH264DisableDeblockingFilterIdc.STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL -> "STD_VIDEO_H264_DISABLE_DEBLOCKING_FILTER_IDC_PARTIAL";
            default -> "Unknown StdVideoH264DisableDeblockingFilterIdc: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264DisableDeblockingFilterIdc() {}
}
