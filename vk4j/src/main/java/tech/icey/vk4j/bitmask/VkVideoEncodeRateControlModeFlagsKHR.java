package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoEncodeRateControlModeFlagsKHR {
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR = 4;

    public static String explain(@enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR");
        }

        return sb.toString();
    }
}
