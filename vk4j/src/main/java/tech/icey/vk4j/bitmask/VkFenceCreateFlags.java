package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkFenceCreateFlags {
    public static final int VK_FENCE_CREATE_SIGNALED_BIT = 1;

    public static String explain(@enumtype(VkFenceCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_FENCE_CREATE_SIGNALED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FENCE_CREATE_SIGNALED_BIT");
        }

        return sb.toString();
    }
}
