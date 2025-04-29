package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH265LevelIdc.html">StdVideoH265LevelIdc</a>
public final class StdVideoH265LevelIdc {
    public static final int STD_VIDEO_H265_LEVEL_IDC_1_0 = 0;
    public static final int STD_VIDEO_H265_LEVEL_IDC_2_0 = 1;
    public static final int STD_VIDEO_H265_LEVEL_IDC_2_1 = 2;
    public static final int STD_VIDEO_H265_LEVEL_IDC_3_0 = 3;
    public static final int STD_VIDEO_H265_LEVEL_IDC_3_1 = 4;
    public static final int STD_VIDEO_H265_LEVEL_IDC_4_0 = 5;
    public static final int STD_VIDEO_H265_LEVEL_IDC_4_1 = 6;
    public static final int STD_VIDEO_H265_LEVEL_IDC_5_0 = 7;
    public static final int STD_VIDEO_H265_LEVEL_IDC_5_1 = 8;
    public static final int STD_VIDEO_H265_LEVEL_IDC_5_2 = 9;
    public static final int STD_VIDEO_H265_LEVEL_IDC_6_0 = 10;
    public static final int STD_VIDEO_H265_LEVEL_IDC_6_1 = 11;
    public static final int STD_VIDEO_H265_LEVEL_IDC_6_2 = 12;
    public static final int STD_VIDEO_H265_LEVEL_IDC_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH265LevelIdc.class) int value) {
        return switch (value) {
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_1_0 -> "STD_VIDEO_H265_LEVEL_IDC_1_0";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_2_0 -> "STD_VIDEO_H265_LEVEL_IDC_2_0";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_2_1 -> "STD_VIDEO_H265_LEVEL_IDC_2_1";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_3_0 -> "STD_VIDEO_H265_LEVEL_IDC_3_0";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_3_1 -> "STD_VIDEO_H265_LEVEL_IDC_3_1";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_4_0 -> "STD_VIDEO_H265_LEVEL_IDC_4_0";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_4_1 -> "STD_VIDEO_H265_LEVEL_IDC_4_1";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_5_0 -> "STD_VIDEO_H265_LEVEL_IDC_5_0";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_5_1 -> "STD_VIDEO_H265_LEVEL_IDC_5_1";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_5_2 -> "STD_VIDEO_H265_LEVEL_IDC_5_2";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_6_0 -> "STD_VIDEO_H265_LEVEL_IDC_6_0";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_6_1 -> "STD_VIDEO_H265_LEVEL_IDC_6_1";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_6_2 -> "STD_VIDEO_H265_LEVEL_IDC_6_2";
            case StdVideoH265LevelIdc.STD_VIDEO_H265_LEVEL_IDC_INVALID -> "STD_VIDEO_H265_LEVEL_IDC_INVALID";
            default -> "Unknown StdVideoH265LevelIdc: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH265LevelIdc() {}
}
