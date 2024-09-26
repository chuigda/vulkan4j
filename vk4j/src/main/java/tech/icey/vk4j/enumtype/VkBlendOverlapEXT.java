package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkBlendOverlapEXT {
    public static final int VK_BLEND_OVERLAP_UNCORRELATED_EXT = 0;
    public static final int VK_BLEND_OVERLAP_DISJOINT_EXT = 1;
    public static final int VK_BLEND_OVERLAP_CONJOINT_EXT = 2;

    public static String explain(@enumtype(VkBlendOverlapEXT.class) int value) {
        return switch (value) {
            case VK_BLEND_OVERLAP_UNCORRELATED_EXT -> "VK_BLEND_OVERLAP_UNCORRELATED_EXT";
            case VK_BLEND_OVERLAP_DISJOINT_EXT -> "VK_BLEND_OVERLAP_DISJOINT_EXT";
            case VK_BLEND_OVERLAP_CONJOINT_EXT -> "VK_BLEND_OVERLAP_CONJOINT_EXT";
            default -> "Unknown";
        };
    }
}
