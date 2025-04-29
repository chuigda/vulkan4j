package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBorderColor.html">VkBorderColor</a>
public final class VkBorderColor {
    public static final int FLOAT_TRANSPARENT_BLACK = 0;
    public static final int INT_TRANSPARENT_BLACK = 1;
    public static final int FLOAT_OPAQUE_BLACK = 2;
    public static final int INT_OPAQUE_BLACK = 3;
    public static final int FLOAT_OPAQUE_WHITE = 4;
    public static final int INT_OPAQUE_WHITE = 5;
    public static final int FLOAT_CUSTOM_EXT = 1000287003;
    public static final int INT_CUSTOM_EXT = 1000287004;

    public static String explain(@enumtype(VkBorderColor.class) int value) {
        return switch (value) {
            case VkBorderColor.FLOAT_CUSTOM_EXT -> "VK_BORDER_COLOR_FLOAT_CUSTOM_EXT";
            case VkBorderColor.FLOAT_OPAQUE_BLACK -> "VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK";
            case VkBorderColor.FLOAT_OPAQUE_WHITE -> "VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE";
            case VkBorderColor.FLOAT_TRANSPARENT_BLACK -> "VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK";
            case VkBorderColor.INT_CUSTOM_EXT -> "VK_BORDER_COLOR_INT_CUSTOM_EXT";
            case VkBorderColor.INT_OPAQUE_BLACK -> "VK_BORDER_COLOR_INT_OPAQUE_BLACK";
            case VkBorderColor.INT_OPAQUE_WHITE -> "VK_BORDER_COLOR_INT_OPAQUE_WHITE";
            case VkBorderColor.INT_TRANSPARENT_BLACK -> "VK_BORDER_COLOR_INT_TRANSPARENT_BLACK";
            default -> "Unknown VkBorderColor: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkBorderColor() {}
}
