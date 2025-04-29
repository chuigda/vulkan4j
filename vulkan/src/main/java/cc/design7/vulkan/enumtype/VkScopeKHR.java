package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkScopeKHR.html">VkScopeKHR</a>
public final class VkScopeKHR {
    public static final int DEVICE = 1;
    public static final int WORKGROUP = 2;
    public static final int SUBGROUP = 3;
    public static final int QUEUE_FAMILY = 5;

    public static String explain(@enumtype(VkScopeKHR.class) int value) {
        return switch (value) {
            case VkScopeKHR.DEVICE -> "VK_SCOPE_DEVICE_KHR";
            case VkScopeKHR.QUEUE_FAMILY -> "VK_SCOPE_QUEUE_FAMILY_KHR";
            case VkScopeKHR.SUBGROUP -> "VK_SCOPE_SUBGROUP_KHR";
            case VkScopeKHR.WORKGROUP -> "VK_SCOPE_WORKGROUP_KHR";
            default -> "Unknown VkScopeKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkScopeKHR() {}
}
