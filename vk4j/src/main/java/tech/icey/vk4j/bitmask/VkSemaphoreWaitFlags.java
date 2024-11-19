package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSemaphoreWaitFlags {
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT = 1;

    public static String explain(@enumtype(VkSemaphoreWaitFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SEMAPHORE_WAIT_ANY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SEMAPHORE_WAIT_ANY_BIT");
        }

        return sb.toString();
    }
}
