package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkConservativeRasterizationModeEXT {
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT = 0;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT = 1;
    public static final int VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT = 2;

    public static String explain(@enumtype(VkConservativeRasterizationModeEXT.class) int value) {
        return switch (value) {
            case VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT -> "VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
            case VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT -> "VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
            case VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT -> "VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
            default -> "Unknown";
        };
    }
}
