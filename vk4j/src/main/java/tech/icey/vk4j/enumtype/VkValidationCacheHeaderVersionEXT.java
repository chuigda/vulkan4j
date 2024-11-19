package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkValidationCacheHeaderVersionEXT {
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;

    public static String explain(@enumtype(VkValidationCacheHeaderVersionEXT.class) int value) {
        return switch (value) {
            case VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT -> "VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT";
            default -> "Unknown";
        };
    }
}
