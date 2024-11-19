package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkQueryControlFlags {
    public static final int VK_QUERY_CONTROL_PRECISE_BIT = 1;

    public static String explain(@enumtype(VkQueryControlFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_QUERY_CONTROL_PRECISE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUERY_CONTROL_PRECISE_BIT");
        }

        return sb.toString();
    }
}
