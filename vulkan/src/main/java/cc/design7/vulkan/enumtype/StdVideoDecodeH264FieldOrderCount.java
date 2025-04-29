package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoDecodeH264FieldOrderCount.html">StdVideoDecodeH264FieldOrderCount</a>
public final class StdVideoDecodeH264FieldOrderCount {
    public static final int STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_TOP = 0;
    public static final int STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_BOTTOM = 1;
    public static final int STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoDecodeH264FieldOrderCount.class) int value) {
        return switch (value) {
            case StdVideoDecodeH264FieldOrderCount.STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_BOTTOM -> "STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_BOTTOM";
            case StdVideoDecodeH264FieldOrderCount.STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_INVALID -> "STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_INVALID";
            case StdVideoDecodeH264FieldOrderCount.STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_TOP -> "STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_TOP";
            default -> "Unknown StdVideoDecodeH264FieldOrderCount: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoDecodeH264FieldOrderCount() {}
}
