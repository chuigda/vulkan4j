package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFullScreenExclusiveEXT.html">VkFullScreenExclusiveEXT</a>
public final class VkFullScreenExclusiveEXT {
    public static final int DEFAULT = 0;
    public static final int ALLOWED = 1;
    public static final int DISALLOWED = 2;
    public static final int APPLICATION_CONTROLLED = 3;

    public static String explain(@enumtype(VkFullScreenExclusiveEXT.class) int value) {
        return switch (value) {
            case VkFullScreenExclusiveEXT.ALLOWED -> "VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT";
            case VkFullScreenExclusiveEXT.APPLICATION_CONTROLLED -> "VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT";
            case VkFullScreenExclusiveEXT.DEFAULT -> "VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT";
            case VkFullScreenExclusiveEXT.DISALLOWED -> "VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT";
            default -> "Unknown VkFullScreenExclusiveEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkFullScreenExclusiveEXT() {}
}
