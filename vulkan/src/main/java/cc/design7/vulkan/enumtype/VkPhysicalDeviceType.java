package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceType.html">VkPhysicalDeviceType</a>
public final class VkPhysicalDeviceType {
    public static final int OTHER = 0;
    public static final int INTEGRATED_GPU = 1;
    public static final int DISCRETE_GPU = 2;
    public static final int VIRTUAL_GPU = 3;
    public static final int CPU = 4;

    public static String explain(@enumtype(VkPhysicalDeviceType.class) int value) {
        return switch (value) {
            case VkPhysicalDeviceType.CPU -> "VK_PHYSICAL_DEVICE_TYPE_CPU";
            case VkPhysicalDeviceType.DISCRETE_GPU -> "VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU";
            case VkPhysicalDeviceType.INTEGRATED_GPU -> "VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU";
            case VkPhysicalDeviceType.OTHER -> "VK_PHYSICAL_DEVICE_TYPE_OTHER";
            case VkPhysicalDeviceType.VIRTUAL_GPU -> "VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU";
            default -> "Unknown VkPhysicalDeviceType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPhysicalDeviceType() {}
}
