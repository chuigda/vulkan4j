package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkInternalAllocationType.html">VkInternalAllocationType</a>
public final class VkInternalAllocationType {
    public static final int EXECUTABLE = 0;

    public static String explain(@enumtype(VkInternalAllocationType.class) int value) {
        return switch (value) {
            case VkInternalAllocationType.EXECUTABLE -> "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE";
            default -> "Unknown VkInternalAllocationType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkInternalAllocationType() {}
}
