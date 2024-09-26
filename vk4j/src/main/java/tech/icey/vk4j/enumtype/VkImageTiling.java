package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkImageTiling {
    public static final int VK_IMAGE_TILING_OPTIMAL = 0;
    public static final int VK_IMAGE_TILING_LINEAR = 1;
    public static final int VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT = 1000158000;

    public static String explain(@enumtype(VkImageTiling.class) int value) {
        return switch (value) {
            case VK_IMAGE_TILING_OPTIMAL -> "VK_IMAGE_TILING_OPTIMAL";
            case VK_IMAGE_TILING_LINEAR -> "VK_IMAGE_TILING_LINEAR";
            case VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT -> "VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT";
            default -> "Unknown";
        };
    }
}
