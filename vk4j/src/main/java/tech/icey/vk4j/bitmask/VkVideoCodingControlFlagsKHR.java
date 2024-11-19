package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoCodingControlFlagsKHR {
    public static final int VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR = 1;
    public static final int VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR = 2;
    public static final int VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR = 4;

    public static String explain(@enumtype(VkVideoCodingControlFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR");
        }

        return sb.toString();
    }
}
