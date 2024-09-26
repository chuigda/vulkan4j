package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkVideoDecodeUsageFlagsKHR {
    public static final int VK_VIDEO_DECODE_USAGE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR = 1;
    public static final int VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR = 2;
    public static final int VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR = 4;

    public static String explain(@enumtype(VkVideoDecodeUsageFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_DECODE_USAGE_DEFAULT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_USAGE_DEFAULT_KHR");
        }

        if ((flags & VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR");
        }

        if ((flags & VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR");
        }

        if ((flags & VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR");
        }

        return sb.toString();
    }
}
