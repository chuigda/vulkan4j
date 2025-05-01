package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264CabacInitIdc.html">StdVideoH264CabacInitIdc</a>
public final class StdVideoH264CabacInitIdc {
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_0 = 0x0;
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_1 = 0x1;
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_2 = 0x2;
    public static final int STD_VIDEO_H264_CABAC_INIT_IDC_INVALID = 0x7fffffff;

    public static String explain(@enumtype(StdVideoH264CabacInitIdc.class) int value) {
        return switch (value) {
            case StdVideoH264CabacInitIdc.STD_VIDEO_H264_CABAC_INIT_IDC_0 -> "STD_VIDEO_H264_CABAC_INIT_IDC_0";
            case StdVideoH264CabacInitIdc.STD_VIDEO_H264_CABAC_INIT_IDC_1 -> "STD_VIDEO_H264_CABAC_INIT_IDC_1";
            case StdVideoH264CabacInitIdc.STD_VIDEO_H264_CABAC_INIT_IDC_2 -> "STD_VIDEO_H264_CABAC_INIT_IDC_2";
            case StdVideoH264CabacInitIdc.STD_VIDEO_H264_CABAC_INIT_IDC_INVALID -> "STD_VIDEO_H264_CABAC_INIT_IDC_INVALID";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264CabacInitIdc() {}
}
