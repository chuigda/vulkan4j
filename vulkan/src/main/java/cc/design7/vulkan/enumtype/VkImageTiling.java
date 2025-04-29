package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageTiling.html">VkImageTiling</a>
public final class VkImageTiling {
    public static final int OPTIMAL = 0;
    public static final int LINEAR = 1;
    public static final int DRM_FORMAT_MODIFIER_EXT = 1000158000;

    public static String explain(@enumtype(VkImageTiling.class) int value) {
        return switch (value) {
            case VkImageTiling.DRM_FORMAT_MODIFIER_EXT -> "VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT";
            case VkImageTiling.LINEAR -> "VK_IMAGE_TILING_LINEAR";
            case VkImageTiling.OPTIMAL -> "VK_IMAGE_TILING_OPTIMAL";
            default -> "Unknown VkImageTiling: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageTiling() {}
}
