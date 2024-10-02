package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkDeviceQueueCreateFlags {
    public static final int VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT = 1;

    public static String explain(@enumtype(VkDeviceQueueCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT");
        }

        return sb.toString();
    }
}
