package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkVideoComponentBitDepthFlagsKHR {
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR = 0;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR = 1;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR = 4;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR = 16;

    public static String explain(@enumtype(VkVideoComponentBitDepthFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR");
        }

        if ((flags & VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR");
        }

        if ((flags & VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR");
        }

        if ((flags & VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR");
        }

        return sb.toString();
    }
}
