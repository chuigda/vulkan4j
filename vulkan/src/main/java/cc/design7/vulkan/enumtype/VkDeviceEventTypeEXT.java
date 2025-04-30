package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceEventTypeEXT.html">VkDeviceEventTypeEXT</a>
public final class VkDeviceEventTypeEXT {
    public static final int DISPLAY_HOTPLUG = 0x0;

    public static String explain(@enumtype(VkDeviceEventTypeEXT.class) int value) {
        return switch (value) {
            case VkDeviceEventTypeEXT.DISPLAY_HOTPLUG -> "VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT";
            default -> "Unknown VkDeviceEventTypeEXT: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDeviceEventTypeEXT() {}
}
