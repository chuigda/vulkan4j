package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkBuildMicromapModeEXT {
    public static final int VK_BUILD_MICROMAP_MODE_BUILD_EXT = 0;

    public static String explain(@enumtype(VkBuildMicromapModeEXT.class) int value) {
        return switch (value) {
            case VK_BUILD_MICROMAP_MODE_BUILD_EXT -> "VK_BUILD_MICROMAP_MODE_BUILD_EXT";
            default -> "Unknown";
        };
    }
}
