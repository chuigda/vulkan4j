package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceLayeredApiKHR.html">VkPhysicalDeviceLayeredApiKHR</a>
public final class VkPhysicalDeviceLayeredApiKHR {
    public static final int VULKAN = 0x0;
    public static final int D3D12 = 0x1;
    public static final int METAL = 0x2;
    public static final int OPENGL = 0x3;
    public static final int OPENGLES = 0x4;

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
