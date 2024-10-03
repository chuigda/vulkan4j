package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkFragmentShadingRateTypeNV {
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV = 1;

    public static String explain(@enumtype(VkFragmentShadingRateTypeNV.class) int value) {
        return switch (value) {
            case VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV -> "VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV";
            case VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV -> "VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV";
            default -> "Unknown";
        };
    }
}
