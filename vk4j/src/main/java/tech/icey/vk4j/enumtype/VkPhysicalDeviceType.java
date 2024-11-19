package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPhysicalDeviceType {
    public static final int VK_PHYSICAL_DEVICE_TYPE_OTHER = 0;
    public static final int VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1;
    public static final int VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2;
    public static final int VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3;
    public static final int VK_PHYSICAL_DEVICE_TYPE_CPU = 4;

    public static String explain(@enumtype(VkPhysicalDeviceType.class) int value) {
        return switch (value) {
            case VK_PHYSICAL_DEVICE_TYPE_OTHER -> "VK_PHYSICAL_DEVICE_TYPE_OTHER";
            case VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU -> "VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU";
            case VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU -> "VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU";
            case VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU -> "VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU";
            case VK_PHYSICAL_DEVICE_TYPE_CPU -> "VK_PHYSICAL_DEVICE_TYPE_CPU";
            default -> "Unknown";
        };
    }
}
