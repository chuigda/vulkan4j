package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayEventTypeEXT.html">VkDisplayEventTypeEXT</a>
public final class VkDisplayEventTypeEXT {
    public static final int FIRST_PIXEL_OUT = 0x0;

    public static String explain(@enumtype(VkDisplayEventTypeEXT.class) int value) {
        return switch (value) {
            case VkDisplayEventTypeEXT.FIRST_PIXEL_OUT -> "VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT";
            default -> "Unknown VkDisplayEventTypeEXT: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDisplayEventTypeEXT() {}
}
