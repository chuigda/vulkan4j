package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoDecodeH264PictureLayoutFlagsKHR {
    public static final int VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR = 0;
    public static final int VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR = 1;
    public static final int VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR = 2;

    public static String explain(@enumtype(VkVideoDecodeH264PictureLayoutFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_PROGRESSIVE_KHR");
        }

        if ((flags & VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_INTERLEAVED_LINES_BIT_KHR");
        }

        if ((flags & VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_H264_PICTURE_LAYOUT_INTERLACED_SEPARATE_PLANES_BIT_KHR");
        }

        return sb.toString();
    }
}
