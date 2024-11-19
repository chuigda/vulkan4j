package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkDebugReportFlagsEXT {
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 1;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 2;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 4;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 8;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 16;

    public static String explain(@enumtype(VkDebugReportFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DEBUG_REPORT_INFORMATION_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_REPORT_INFORMATION_BIT_EXT");
        }

        if ((flags & VK_DEBUG_REPORT_WARNING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_REPORT_WARNING_BIT_EXT");
        }

        if ((flags & VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT");
        }

        if ((flags & VK_DEBUG_REPORT_ERROR_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_REPORT_ERROR_BIT_EXT");
        }

        if ((flags & VK_DEBUG_REPORT_DEBUG_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEBUG_REPORT_DEBUG_BIT_EXT");
        }

        return sb.toString();
    }
}
