package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkOpacityMicromapFormatEXT {
    public static final int VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT = 1;
    public static final int VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT = 2;

    public static String explain(@enumtype(VkOpacityMicromapFormatEXT.class) int value) {
        return switch (value) {
            case VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT -> "VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT";
            case VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT -> "VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT";
            default -> "Unknown";
        };
    }
}
