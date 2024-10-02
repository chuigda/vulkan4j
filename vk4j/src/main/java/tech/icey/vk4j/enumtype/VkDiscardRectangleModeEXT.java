package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDiscardRectangleModeEXT {
    public static final int VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0;
    public static final int VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    public static String explain(@enumtype(VkDiscardRectangleModeEXT.class) int value) {
        return switch (value) {
            case VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT -> "VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT";
            case VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT -> "VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT";
            default -> "Unknown";
        };
    }
}
