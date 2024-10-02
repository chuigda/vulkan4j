package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkCommandBufferResetFlags {
    public static final int VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 1;

    public static String explain(@enumtype(VkCommandBufferResetFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT");
        }

        return sb.toString();
    }
}
