package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkEventCreateFlags {
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT = 1;

    public static String explain(@enumtype(VkEventCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_EVENT_CREATE_DEVICE_ONLY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EVENT_CREATE_DEVICE_ONLY_BIT");
        }

        return sb.toString();
    }
}
