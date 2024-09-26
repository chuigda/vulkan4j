package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDebugUtilsMessageSeverityFlagsEXT {
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 1;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 16;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 256;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 4096;

    public static String explain(@enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT");
        }

        if ((flags & VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT");
        }

        if ((flags & VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT");
        }

        if ((flags & VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT");
        }

        return sb.toString();
    }
}
