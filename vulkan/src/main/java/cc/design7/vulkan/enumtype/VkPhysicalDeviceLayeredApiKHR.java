package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLayeredApiKHR.html">VkPhysicalDeviceLayeredApiKHR</a>
public final class VkPhysicalDeviceLayeredApiKHR {
    public static final int VULKAN = 0;
    public static final int D3D12 = 1;
    public static final int METAL = 2;
    public static final int OPENGL = 3;
    public static final int OPENGLES = 4;

    public static String explain(@enumtype(VkPhysicalDeviceLayeredApiKHR.class) int value) {
        return switch (value) {
            case VkPhysicalDeviceLayeredApiKHR.D3D12 -> "VK_PHYSICAL_DEVICE_LAYERED_API_D3D12_KHR";
            case VkPhysicalDeviceLayeredApiKHR.METAL -> "VK_PHYSICAL_DEVICE_LAYERED_API_METAL_KHR";
            case VkPhysicalDeviceLayeredApiKHR.OPENGLES -> "VK_PHYSICAL_DEVICE_LAYERED_API_OPENGLES_KHR";
            case VkPhysicalDeviceLayeredApiKHR.OPENGL -> "VK_PHYSICAL_DEVICE_LAYERED_API_OPENGL_KHR";
            case VkPhysicalDeviceLayeredApiKHR.VULKAN -> "VK_PHYSICAL_DEVICE_LAYERED_API_VULKAN_KHR";
            default -> "Unknown VkPhysicalDeviceLayeredApiKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPhysicalDeviceLayeredApiKHR() {}
}
