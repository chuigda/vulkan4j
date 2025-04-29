package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264LevelIdc.html">StdVideoH264LevelIdc</a>
public final class StdVideoH264LevelIdc {
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_0 = 0;
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_1 = 1;
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_2 = 2;
    public static final int STD_VIDEO_H264_LEVEL_IDC_1_3 = 3;
    public static final int STD_VIDEO_H264_LEVEL_IDC_2_0 = 4;
    public static final int STD_VIDEO_H264_LEVEL_IDC_2_1 = 5;
    public static final int STD_VIDEO_H264_LEVEL_IDC_2_2 = 6;
    public static final int STD_VIDEO_H264_LEVEL_IDC_3_0 = 7;
    public static final int STD_VIDEO_H264_LEVEL_IDC_3_1 = 8;
    public static final int STD_VIDEO_H264_LEVEL_IDC_3_2 = 9;
    public static final int STD_VIDEO_H264_LEVEL_IDC_4_0 = 10;
    public static final int STD_VIDEO_H264_LEVEL_IDC_4_1 = 11;
    public static final int STD_VIDEO_H264_LEVEL_IDC_4_2 = 12;
    public static final int STD_VIDEO_H264_LEVEL_IDC_5_0 = 13;
    public static final int STD_VIDEO_H264_LEVEL_IDC_5_1 = 14;
    public static final int STD_VIDEO_H264_LEVEL_IDC_5_2 = 15;
    public static final int STD_VIDEO_H264_LEVEL_IDC_6_0 = 16;
    public static final int STD_VIDEO_H264_LEVEL_IDC_6_1 = 17;
    public static final int STD_VIDEO_H264_LEVEL_IDC_6_2 = 18;
    public static final int STD_VIDEO_H264_LEVEL_IDC_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264LevelIdc.class) int value) {
        return switch (value) {
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_1_0 -> "STD_VIDEO_H264_LEVEL_IDC_1_0";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_1_1 -> "STD_VIDEO_H264_LEVEL_IDC_1_1";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_1_2 -> "STD_VIDEO_H264_LEVEL_IDC_1_2";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_1_3 -> "STD_VIDEO_H264_LEVEL_IDC_1_3";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_2_0 -> "STD_VIDEO_H264_LEVEL_IDC_2_0";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_2_1 -> "STD_VIDEO_H264_LEVEL_IDC_2_1";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_2_2 -> "STD_VIDEO_H264_LEVEL_IDC_2_2";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_3_0 -> "STD_VIDEO_H264_LEVEL_IDC_3_0";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_3_1 -> "STD_VIDEO_H264_LEVEL_IDC_3_1";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_3_2 -> "STD_VIDEO_H264_LEVEL_IDC_3_2";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_4_0 -> "STD_VIDEO_H264_LEVEL_IDC_4_0";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_4_1 -> "STD_VIDEO_H264_LEVEL_IDC_4_1";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_4_2 -> "STD_VIDEO_H264_LEVEL_IDC_4_2";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_5_0 -> "STD_VIDEO_H264_LEVEL_IDC_5_0";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_5_1 -> "STD_VIDEO_H264_LEVEL_IDC_5_1";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_5_2 -> "STD_VIDEO_H264_LEVEL_IDC_5_2";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_6_0 -> "STD_VIDEO_H264_LEVEL_IDC_6_0";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_6_1 -> "STD_VIDEO_H264_LEVEL_IDC_6_1";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_6_2 -> "STD_VIDEO_H264_LEVEL_IDC_6_2";
            case StdVideoH264LevelIdc.STD_VIDEO_H264_LEVEL_IDC_INVALID -> "STD_VIDEO_H264_LEVEL_IDC_INVALID";
            default -> "Unknown StdVideoH264LevelIdc: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264LevelIdc() {}
}
