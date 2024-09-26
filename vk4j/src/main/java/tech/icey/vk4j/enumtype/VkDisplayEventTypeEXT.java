package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDisplayEventTypeEXT {
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    public static String explain(@enumtype(VkDisplayEventTypeEXT.class) int value) {
        return switch (value) {
            case VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT -> "VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT";
            default -> "Unknown";
        };
    }
}
