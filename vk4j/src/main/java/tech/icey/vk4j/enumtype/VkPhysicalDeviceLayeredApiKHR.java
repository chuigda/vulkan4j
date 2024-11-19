package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPhysicalDeviceLayeredApiKHR {
    public static final int VK_PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR = 0;
    public static final int VK_PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR = 1;
    public static final int VK_PHYSICAL_DEVICE_LAYERED_API_METAL_KHR = 2;
    public static final int VK_PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR = 3;
    public static final int VK_PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR = 4;

    public static String explain(@enumtype(VkPhysicalDeviceLayeredApiKHR.class) int value) {
        return switch (value) {
            case VK_PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR -> "VK_PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR";
            case VK_PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR -> "VK_PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR";
            case VK_PHYSICAL_DEVICE_LAYERED_API_METAL_KHR -> "VK_PHYSICAL_DEVICE_LAYERED_API_METAL_KHR";
            case VK_PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR -> "VK_PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR";
            case VK_PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR -> "VK_PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR";
            default -> "Unknown";
        };
    }
}
