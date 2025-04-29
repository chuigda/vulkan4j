package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueGlobalPriority.html">VkQueueGlobalPriority</a>
public final class VkQueueGlobalPriority {
    public static final int LOW = 128;
    public static final int MEDIUM = 256;
    public static final int HIGH = 512;
    public static final int REALTIME = 1024;

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
