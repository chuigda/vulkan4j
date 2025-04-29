package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSystemAllocationScope.html">VkSystemAllocationScope</a>
public final class VkSystemAllocationScope {
    public static final int COMMAND = 0;
    public static final int OBJECT = 1;
    public static final int CACHE = 2;
    public static final int DEVICE = 3;
    public static final int INSTANCE = 4;

    public static String explain(@enumtype(VkSystemAllocationScope.class) int value) {
        return switch (value) {
            case VkSystemAllocationScope.CACHE -> "VK_SYSTEM_ALLOCATION_SCOPE_CACHE";
            case VkSystemAllocationScope.COMMAND -> "VK_SYSTEM_ALLOCATION_SCOPE_COMMAND";
            case VkSystemAllocationScope.DEVICE -> "VK_SYSTEM_ALLOCATION_SCOPE_DEVICE";
            case VkSystemAllocationScope.INSTANCE -> "VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE";
            case VkSystemAllocationScope.OBJECT -> "VK_SYSTEM_ALLOCATION_SCOPE_OBJECT";
            default -> "Unknown VkSystemAllocationScope: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSystemAllocationScope() {}
}
