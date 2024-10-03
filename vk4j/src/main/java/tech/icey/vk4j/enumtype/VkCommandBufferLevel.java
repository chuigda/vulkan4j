package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkCommandBufferLevel {
    public static final int VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0;
    public static final int VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1;

    public static String explain(@enumtype(VkCommandBufferLevel.class) int value) {
        return switch (value) {
            case VK_COMMAND_BUFFER_LEVEL_PRIMARY -> "VK_COMMAND_BUFFER_LEVEL_PRIMARY";
            case VK_COMMAND_BUFFER_LEVEL_SECONDARY -> "VK_COMMAND_BUFFER_LEVEL_SECONDARY";
            default -> "Unknown";
        };
    }
}
