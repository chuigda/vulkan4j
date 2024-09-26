package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkQueryResultFlags {
    public static final int VK_QUERY_RESULT_64_BIT = 1;
    public static final int VK_QUERY_RESULT_WAIT_BIT = 2;
    public static final int VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 4;
    public static final int VK_QUERY_RESULT_PARTIAL_BIT = 8;
    public static final int VK_QUERY_RESULT_WITH_STATUS_BIT_KHR = 16;

    public static String explain(@enumtype(VkQueryResultFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_QUERY_RESULT_64_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUERY_RESULT_64_BIT");
        }

        if ((flags & VK_QUERY_RESULT_WAIT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUERY_RESULT_WAIT_BIT");
        }

        if ((flags & VK_QUERY_RESULT_WITH_AVAILABILITY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUERY_RESULT_WITH_AVAILABILITY_BIT");
        }

        if ((flags & VK_QUERY_RESULT_PARTIAL_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUERY_RESULT_PARTIAL_BIT");
        }

        if ((flags & VK_QUERY_RESULT_WITH_STATUS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUERY_RESULT_WITH_STATUS_BIT_KHR");
        }

        return sb.toString();
    }
}
