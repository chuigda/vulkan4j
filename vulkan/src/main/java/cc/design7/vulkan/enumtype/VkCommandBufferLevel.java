package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferLevel.html">VkCommandBufferLevel</a>
public final class VkCommandBufferLevel {
    public static final int PRIMARY = 0x0;
    public static final int SECONDARY = 0x1;

    public static String explain(@enumtype(VkCommandBufferLevel.class) int value) {
        return switch (value) {
            case VkCommandBufferLevel.PRIMARY -> "VK_COMMAND_BUFFER_LEVEL_PRIMARY";
            case VkCommandBufferLevel.SECONDARY -> "VK_COMMAND_BUFFER_LEVEL_SECONDARY";
            default -> "Unknown VkCommandBufferLevel: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkCommandBufferLevel() {}
}
