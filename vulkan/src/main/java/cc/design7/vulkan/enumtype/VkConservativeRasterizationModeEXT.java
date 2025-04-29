package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkConservativeRasterizationModeEXT.html">VkConservativeRasterizationModeEXT</a>
public final class VkConservativeRasterizationModeEXT {
    public static final int DISABLED = 0x0;
    public static final int OVERESTIMATE = 0x1;
    public static final int UNDERESTIMATE = 0x2;

    public static String explain(@enumtype(VkConservativeRasterizationModeEXT.class) int value) {
        return switch (value) {
            case VkConservativeRasterizationModeEXT.DISABLED -> "VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT";
            case VkConservativeRasterizationModeEXT.OVERESTIMATE -> "VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT";
            case VkConservativeRasterizationModeEXT.UNDERESTIMATE -> "VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT";
            default -> "Unknown VkConservativeRasterizationModeEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkConservativeRasterizationModeEXT() {}
}
