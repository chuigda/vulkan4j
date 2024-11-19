package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkBorderColor {
    public static final int VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0;
    public static final int VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3;
    public static final int VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4;
    public static final int VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5;
    public static final int VK_BORDER_COLOR_FLOAT_CUSTOM_EXT = 1000287003;
    public static final int VK_BORDER_COLOR_INT_CUSTOM_EXT = 1000287004;

    public static String explain(@enumtype(VkBorderColor.class) int value) {
        return switch (value) {
            case VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK -> "VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK";
            case VK_BORDER_COLOR_INT_TRANSPARENT_BLACK -> "VK_BORDER_COLOR_INT_TRANSPARENT_BLACK";
            case VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK -> "VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK";
            case VK_BORDER_COLOR_INT_OPAQUE_BLACK -> "VK_BORDER_COLOR_INT_OPAQUE_BLACK";
            case VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE -> "VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE";
            case VK_BORDER_COLOR_INT_OPAQUE_WHITE -> "VK_BORDER_COLOR_INT_OPAQUE_WHITE";
            case VK_BORDER_COLOR_FLOAT_CUSTOM_EXT -> "VK_BORDER_COLOR_FLOAT_CUSTOM_EXT";
            case VK_BORDER_COLOR_INT_CUSTOM_EXT -> "VK_BORDER_COLOR_INT_CUSTOM_EXT";
            default -> "Unknown";
        };
    }
}
