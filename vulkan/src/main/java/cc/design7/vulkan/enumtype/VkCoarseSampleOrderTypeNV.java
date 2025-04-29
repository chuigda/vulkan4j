package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoarseSampleOrderTypeNV.html">VkCoarseSampleOrderTypeNV</a>
public final class VkCoarseSampleOrderTypeNV {
    public static final int DEFAULT = 0x0;
    public static final int CUSTOM = 0x1;
    public static final int PIXEL_MAJOR = 0x2;
    public static final int SAMPLE_MAJOR = 0x3;

    public static String explain(@enumtype(VkCoarseSampleOrderTypeNV.class) int value) {
        return switch (value) {
            case VkCoarseSampleOrderTypeNV.CUSTOM -> "VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV";
            case VkCoarseSampleOrderTypeNV.DEFAULT -> "VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV";
            case VkCoarseSampleOrderTypeNV.PIXEL_MAJOR -> "VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV";
            case VkCoarseSampleOrderTypeNV.SAMPLE_MAJOR -> "VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV";
            default -> "Unknown VkCoarseSampleOrderTypeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkCoarseSampleOrderTypeNV() {}
}
