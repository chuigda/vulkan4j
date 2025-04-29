package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264PocType.html">StdVideoH264PocType</a>
public final class StdVideoH264PocType {
    public static final int STD_VIDEO_H264_POC_TYPE_0 = 0;
    public static final int STD_VIDEO_H264_POC_TYPE_1 = 1;
    public static final int STD_VIDEO_H264_POC_TYPE_2 = 2;
    public static final int STD_VIDEO_H264_POC_TYPE_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264PocType.class) int value) {
        return switch (value) {
            case StdVideoH264PocType.STD_VIDEO_H264_POC_TYPE_0 -> "STD_VIDEO_H264_POC_TYPE_0";
            case StdVideoH264PocType.STD_VIDEO_H264_POC_TYPE_1 -> "STD_VIDEO_H264_POC_TYPE_1";
            case StdVideoH264PocType.STD_VIDEO_H264_POC_TYPE_2 -> "STD_VIDEO_H264_POC_TYPE_2";
            case StdVideoH264PocType.STD_VIDEO_H264_POC_TYPE_INVALID -> "STD_VIDEO_H264_POC_TYPE_INVALID";
            default -> "Unknown StdVideoH264PocType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264PocType() {}
}
