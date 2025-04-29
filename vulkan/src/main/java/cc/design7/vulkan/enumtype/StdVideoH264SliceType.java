package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoH264SliceType.html">StdVideoH264SliceType</a>
public final class StdVideoH264SliceType {
    public static final int STD_VIDEO_H264_SLICE_TYPE_P = 0;
    public static final int STD_VIDEO_H264_SLICE_TYPE_B = 1;
    public static final int STD_VIDEO_H264_SLICE_TYPE_I = 2;
    public static final int STD_VIDEO_H264_SLICE_TYPE_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoH264SliceType.class) int value) {
        return switch (value) {
            case StdVideoH264SliceType.STD_VIDEO_H264_SLICE_TYPE_B -> "STD_VIDEO_H264_SLICE_TYPE_B";
            case StdVideoH264SliceType.STD_VIDEO_H264_SLICE_TYPE_I -> "STD_VIDEO_H264_SLICE_TYPE_I";
            case StdVideoH264SliceType.STD_VIDEO_H264_SLICE_TYPE_INVALID -> "STD_VIDEO_H264_SLICE_TYPE_INVALID";
            case StdVideoH264SliceType.STD_VIDEO_H264_SLICE_TYPE_P -> "STD_VIDEO_H264_SLICE_TYPE_P";
            default -> "Unknown StdVideoH264SliceType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoH264SliceType() {}
}
