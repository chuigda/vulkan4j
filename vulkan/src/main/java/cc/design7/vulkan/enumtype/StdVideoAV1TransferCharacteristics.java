package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1TransferCharacteristics.html">StdVideoAV1TransferCharacteristics</a>
public final class StdVideoAV1TransferCharacteristics {
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_0 = 0x0;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_709 = 0x1;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_UNSPECIFIED = 0x2;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_3 = 0x3;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_M = 0x4;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_B_G = 0x5;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_601 = 0x6;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_240 = 0x7;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LINEAR = 0x8;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100 = 0x9;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100_SQRT10 = 0xa;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_IEC_61966 = 0xb;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_1361 = 0xc;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SRGB = 0xd;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_10_BIT = 0xe;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_12_BIT = 0xf;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_2084 = 0x10;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_428 = 0x11;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_HLG = 0x12;
    public static final int STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_INVALID = 0x7fffffff;

    public static String explain(@enumtype(StdVideoAV1TransferCharacteristics.class) int value) {
        return switch (value) {
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_1361 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_1361";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_10_BIT -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_10_BIT";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_12_BIT -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_2020_12_BIT";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_B_G -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_B_G";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_M -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_470_M";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_601 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_601";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_709 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_BT_709";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_HLG -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_HLG";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_IEC_61966 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_IEC_61966";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_INVALID -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_INVALID";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LINEAR -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LINEAR";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100_SQRT10 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_LOG_100_SQRT10";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_0 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_0";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_3 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_RESERVED_3";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_2084 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_2084";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_240 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_240";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_428 -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SMPTE_428";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SRGB -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_SRGB";
            case StdVideoAV1TransferCharacteristics.STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_UNSPECIFIED -> "STD_VIDEO_AV1_TRANSFER_CHARACTERISTICS_UNSPECIFIED";
            default -> "Unknown StdVideoAV1TransferCharacteristics: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1TransferCharacteristics() {}
}
