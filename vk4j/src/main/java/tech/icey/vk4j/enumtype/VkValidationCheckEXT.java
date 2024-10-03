package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkValidationCheckEXT {
    public static final int VK_VALIDATION_CHECK_ALL_EXT = 0;
    public static final int VK_VALIDATION_CHECK_SHADERS_EXT = 1;

    public static String explain(@enumtype(VkValidationCheckEXT.class) int value) {
        return switch (value) {
            case VK_VALIDATION_CHECK_ALL_EXT -> "VK_VALIDATION_CHECK_ALL_EXT";
            case VK_VALIDATION_CHECK_SHADERS_EXT -> "VK_VALIDATION_CHECK_SHADERS_EXT";
            default -> "Unknown";
        };
    }
}
