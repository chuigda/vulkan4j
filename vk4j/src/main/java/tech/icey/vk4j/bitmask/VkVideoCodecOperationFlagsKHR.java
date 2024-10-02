package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoCodecOperationFlagsKHR {
    public static final int VK_VIDEO_CODEC_OPERATION_NONE_KHR = 0;
    public static final int VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR = 65536;
    public static final int VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR = 131072;
    public static final int VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR = 1;
    public static final int VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR = 2;
    public static final int VK_VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR = 4;

    public static String explain(@enumtype(VkVideoCodecOperationFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_CODEC_OPERATION_NONE_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODEC_OPERATION_NONE_KHR");
        }

        if ((flags & VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODEC_OPERATION_ENCODE_H264_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODEC_OPERATION_ENCODE_H265_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODEC_OPERATION_DECODE_H264_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODEC_OPERATION_DECODE_H265_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODEC_OPERATION_DECODE_AV1_BIT_KHR");
        }

        return sb.toString();
    }
}
