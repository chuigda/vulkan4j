package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkCommandPoolResetFlags {
    public static final int VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 1;

    public static String explain(@enumtype(VkCommandPoolResetFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT");
        }

        return sb.toString();
    }
}
