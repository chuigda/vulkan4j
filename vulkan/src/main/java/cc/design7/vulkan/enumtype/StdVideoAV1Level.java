package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1Level.html">StdVideoAV1Level</a>
public final class StdVideoAV1Level {
    public static final int STD_VIDEO_AV1_LEVEL_2_0 = 0;
    public static final int STD_VIDEO_AV1_LEVEL_2_1 = 1;
    public static final int STD_VIDEO_AV1_LEVEL_2_2 = 2;
    public static final int STD_VIDEO_AV1_LEVEL_2_3 = 3;
    public static final int STD_VIDEO_AV1_LEVEL_3_0 = 4;
    public static final int STD_VIDEO_AV1_LEVEL_3_1 = 5;
    public static final int STD_VIDEO_AV1_LEVEL_3_2 = 6;
    public static final int STD_VIDEO_AV1_LEVEL_3_3 = 7;
    public static final int STD_VIDEO_AV1_LEVEL_4_0 = 8;
    public static final int STD_VIDEO_AV1_LEVEL_4_1 = 9;
    public static final int STD_VIDEO_AV1_LEVEL_4_2 = 10;
    public static final int STD_VIDEO_AV1_LEVEL_4_3 = 11;
    public static final int STD_VIDEO_AV1_LEVEL_5_0 = 12;
    public static final int STD_VIDEO_AV1_LEVEL_5_1 = 13;
    public static final int STD_VIDEO_AV1_LEVEL_5_2 = 14;
    public static final int STD_VIDEO_AV1_LEVEL_5_3 = 15;
    public static final int STD_VIDEO_AV1_LEVEL_6_0 = 16;
    public static final int STD_VIDEO_AV1_LEVEL_6_1 = 17;
    public static final int STD_VIDEO_AV1_LEVEL_6_2 = 18;
    public static final int STD_VIDEO_AV1_LEVEL_6_3 = 19;
    public static final int STD_VIDEO_AV1_LEVEL_7_0 = 20;
    public static final int STD_VIDEO_AV1_LEVEL_7_1 = 21;
    public static final int STD_VIDEO_AV1_LEVEL_7_2 = 22;
    public static final int STD_VIDEO_AV1_LEVEL_7_3 = 23;
    public static final int STD_VIDEO_AV1_LEVEL_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1Level.class) int value) {
        return switch (value) {
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_2_0 -> "STD_VIDEO_AV1_LEVEL_2_0";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_2_1 -> "STD_VIDEO_AV1_LEVEL_2_1";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_2_2 -> "STD_VIDEO_AV1_LEVEL_2_2";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_2_3 -> "STD_VIDEO_AV1_LEVEL_2_3";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_3_0 -> "STD_VIDEO_AV1_LEVEL_3_0";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_3_1 -> "STD_VIDEO_AV1_LEVEL_3_1";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_3_2 -> "STD_VIDEO_AV1_LEVEL_3_2";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_3_3 -> "STD_VIDEO_AV1_LEVEL_3_3";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_4_0 -> "STD_VIDEO_AV1_LEVEL_4_0";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_4_1 -> "STD_VIDEO_AV1_LEVEL_4_1";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_4_2 -> "STD_VIDEO_AV1_LEVEL_4_2";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_4_3 -> "STD_VIDEO_AV1_LEVEL_4_3";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_5_0 -> "STD_VIDEO_AV1_LEVEL_5_0";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_5_1 -> "STD_VIDEO_AV1_LEVEL_5_1";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_5_2 -> "STD_VIDEO_AV1_LEVEL_5_2";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_5_3 -> "STD_VIDEO_AV1_LEVEL_5_3";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_6_0 -> "STD_VIDEO_AV1_LEVEL_6_0";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_6_1 -> "STD_VIDEO_AV1_LEVEL_6_1";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_6_2 -> "STD_VIDEO_AV1_LEVEL_6_2";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_6_3 -> "STD_VIDEO_AV1_LEVEL_6_3";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_7_0 -> "STD_VIDEO_AV1_LEVEL_7_0";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_7_1 -> "STD_VIDEO_AV1_LEVEL_7_1";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_7_2 -> "STD_VIDEO_AV1_LEVEL_7_2";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_7_3 -> "STD_VIDEO_AV1_LEVEL_7_3";
            case StdVideoAV1Level.STD_VIDEO_AV1_LEVEL_INVALID -> "STD_VIDEO_AV1_LEVEL_INVALID";
            default -> "Unknown StdVideoAV1Level: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1Level() {}
}
