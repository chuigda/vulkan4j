package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkSamplerYcbcrRange {
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_FULL = 0;
    public static final int VK_SAMPLER_YCBCR_RANGE_ITU_NARROW = 1;

    public static String explain(@enumtype(VkSamplerYcbcrRange.class) int value) {
        return switch (value) {
            case VK_SAMPLER_YCBCR_RANGE_ITU_FULL -> "VK_SAMPLER_YCBCR_RANGE_ITU_FULL";
            case VK_SAMPLER_YCBCR_RANGE_ITU_NARROW -> "VK_SAMPLER_YCBCR_RANGE_ITU_NARROW";
            default -> "Unknown";
        };
    }
}
