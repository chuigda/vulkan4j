package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkCommandBufferUsageFlags {
    public static final int VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 1;
    public static final int VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 2;
    public static final int VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 4;

    public static String explain(@enumtype(VkCommandBufferUsageFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT");
        }

        if ((flags & VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT");
        }

        if ((flags & VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT");
        }

        return sb.toString();
    }
}
