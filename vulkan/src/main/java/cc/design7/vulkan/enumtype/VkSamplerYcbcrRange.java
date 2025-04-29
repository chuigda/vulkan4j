package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerYcbcrRange.html">VkSamplerYcbcrRange</a>
public final class VkSamplerYcbcrRange {
    public static final int ITU_FULL = 0x0;
    public static final int ITU_NARROW = 0x1;

    public static String explain(@enumtype(VkSamplerYcbcrRange.class) int value) {
        return switch (value) {
            case VkSamplerYcbcrRange.ITU_FULL -> "VK_SAMPLER_YCBCR_RANGE_ITU_FULL";
            case VkSamplerYcbcrRange.ITU_NARROW -> "VK_SAMPLER_YCBCR_RANGE_ITU_NARROW";
            default -> "Unknown VkSamplerYcbcrRange: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSamplerYcbcrRange() {}
}
