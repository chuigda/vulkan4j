package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDeviceEventTypeEXT {
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;

    public static String explain(@enumtype(VkDeviceEventTypeEXT.class) int value) {
        return switch (value) {
            case VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT -> "VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT";
            default -> "Unknown";
        };
    }
}
