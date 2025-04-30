package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFragmentShadingRateTypeNV.html">VkFragmentShadingRateTypeNV</a>
public final class VkFragmentShadingRateTypeNV {
    public static final int FRAGMENT_SIZE = 0x0;
    public static final int ENUMS = 0x1;

    public static String explain(@enumtype(VkFragmentShadingRateTypeNV.class) int value) {
        return switch (value) {
            case VkFragmentShadingRateTypeNV.ENUMS -> "VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV";
            case VkFragmentShadingRateTypeNV.FRAGMENT_SIZE -> "VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV";
            default -> "Unknown VkFragmentShadingRateTypeNV: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkFragmentShadingRateTypeNV() {}
}
