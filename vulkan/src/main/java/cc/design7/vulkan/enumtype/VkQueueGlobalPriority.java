package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueGlobalPriority.html">VkQueueGlobalPriority</a>
public final class VkQueueGlobalPriority {
    public static final int LOW = 0x80;
    public static final int MEDIUM = 0x100;
    public static final int HIGH = 0x200;
    public static final int REALTIME = 0x400;

    public static String explain(@enumtype(VkQueueGlobalPriority.class) int value) {
        return switch (value) {
            case VkQueueGlobalPriority.HIGH -> "VK_QUEUE_GLOBAL_PRIORITY_HIGH";
            case VkQueueGlobalPriority.LOW -> "VK_QUEUE_GLOBAL_PRIORITY_LOW";
            case VkQueueGlobalPriority.MEDIUM -> "VK_QUEUE_GLOBAL_PRIORITY_MEDIUM";
            case VkQueueGlobalPriority.REALTIME -> "VK_QUEUE_GLOBAL_PRIORITY_REALTIME";
            default -> "Unknown VkQueueGlobalPriority: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkQueueGlobalPriority() {}
}
