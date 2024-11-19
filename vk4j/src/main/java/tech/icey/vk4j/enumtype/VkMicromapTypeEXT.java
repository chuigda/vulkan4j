package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkMicromapTypeEXT {
    public static final int VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT = 0;
    public static final int VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV = 1000397000;

    public static String explain(@enumtype(VkMicromapTypeEXT.class) int value) {
        return switch (value) {
            case VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT -> "VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT";
            case VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV -> "VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV";
            default -> "Unknown";
        };
    }
}
