package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkFullScreenExclusiveEXT {
    public static final int VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT = 0;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT = 1;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT = 2;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT = 3;

    public static String explain(@enumtype(VkFullScreenExclusiveEXT.class) int value) {
        return switch (value) {
            case VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT -> "VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT";
            case VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT -> "VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT";
            case VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT -> "VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT";
            case VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT -> "VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT";
            default -> "Unknown";
        };
    }
}
