package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpacityMicromapFormatEXT.html">VkOpacityMicromapFormatEXT</a>
public final class VkOpacityMicromapFormatEXT {
    public static final int _2_STATE = 0x1;
    public static final int _4_STATE = 0x2;

    public static String explain(@enumtype(VkOpacityMicromapFormatEXT.class) int value) {
        return switch (value) {
            case VkOpacityMicromapFormatEXT._2_STATE -> "VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT";
            case VkOpacityMicromapFormatEXT._4_STATE -> "VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT";
            default -> "Unknown VkOpacityMicromapFormatEXT: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkOpacityMicromapFormatEXT() {}
}
