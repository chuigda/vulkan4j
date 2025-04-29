package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1ColorPrimaries.html">StdVideoAV1ColorPrimaries</a>
public final class StdVideoAV1ColorPrimaries {
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_709 = 1;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_UNSPECIFIED = 2;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_M = 4;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_B_G = 5;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_601 = 6;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_240 = 7;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_GENERIC_FILM = 8;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_BT_2020 = 9;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_XYZ = 10;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_431 = 11;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_432 = 12;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_EBU_3213 = 22;
    public static final int STD_VIDEO_AV1_COLOR_PRIMARIES_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1ColorPrimaries.class) int value) {
        return switch (value) {
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_BT_2020 -> "STD_VIDEO_AV1_COLOR_PRIMARIES_BT_2020";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_B_G -> "STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_B_G";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_M -> "STD_VIDEO_AV1_COLOR_PRIMARIES_BT_470_M";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_BT_601 -> "STD_VIDEO_AV1_COLOR_PRIMARIES_BT_601";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_BT_709 -> "STD_VIDEO_AV1_COLOR_PRIMARIES_BT_709";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_EBU_3213 -> "STD_VIDEO_AV1_COLOR_PRIMARIES_EBU_3213";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_GENERIC_FILM -> "STD_VIDEO_AV1_COLOR_PRIMARIES_GENERIC_FILM";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_INVALID -> "STD_VIDEO_AV1_COLOR_PRIMARIES_INVALID";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_240 -> "STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_240";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_431 -> "STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_431";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_432 -> "STD_VIDEO_AV1_COLOR_PRIMARIES_SMPTE_432";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_UNSPECIFIED -> "STD_VIDEO_AV1_COLOR_PRIMARIES_UNSPECIFIED";
            case StdVideoAV1ColorPrimaries.STD_VIDEO_AV1_COLOR_PRIMARIES_XYZ -> "STD_VIDEO_AV1_COLOR_PRIMARIES_XYZ";
            default -> "Unknown StdVideoAV1ColorPrimaries: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1ColorPrimaries() {}
}
