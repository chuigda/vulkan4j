package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreType.html">VkSemaphoreType</a>
public final class VkSemaphoreType {
    public static final int BINARY = 0x0;
    public static final int TIMELINE = 0x1;

    public static String explain(@enumtype(VkSemaphoreType.class) int value) {
        return switch (value) {
            case VkSemaphoreType.BINARY -> "VK_SEMAPHORE_TYPE_BINARY";
            case VkSemaphoreType.TIMELINE -> "VK_SEMAPHORE_TYPE_TIMELINE";
            default -> "Unknown VkSemaphoreType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSemaphoreType() {}
}
