package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDiscardRectangleModeEXT.html">VkDiscardRectangleModeEXT</a>
public final class VkDiscardRectangleModeEXT {
    public static final int INCLUSIVE = 0x0;
    public static final int EXCLUSIVE = 0x1;

    public static String explain(@enumtype(VkDiscardRectangleModeEXT.class) int value) {
        return switch (value) {
            case VkDiscardRectangleModeEXT.EXCLUSIVE -> "VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT";
            case VkDiscardRectangleModeEXT.INCLUSIVE -> "VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT";
            default -> "Unknown VkDiscardRectangleModeEXT: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDiscardRectangleModeEXT() {}
}
