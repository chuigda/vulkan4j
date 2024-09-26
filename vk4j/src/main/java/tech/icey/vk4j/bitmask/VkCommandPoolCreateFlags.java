package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkCommandPoolCreateFlags {
    public static final int VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = 1;
    public static final int VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = 2;
    public static final int VK_COMMAND_POOL_CREATE_PROTECTED_BIT = 4;

    public static String explain(@enumtype(VkCommandPoolCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_COMMAND_POOL_CREATE_TRANSIENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_POOL_CREATE_TRANSIENT_BIT");
        }

        if ((flags & VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT");
        }

        if ((flags & VK_COMMAND_POOL_CREATE_PROTECTED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_POOL_CREATE_PROTECTED_BIT");
        }

        return sb.toString();
    }
}
