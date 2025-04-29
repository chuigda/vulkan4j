package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoverageModulationModeNV.html">VkCoverageModulationModeNV</a>
public final class VkCoverageModulationModeNV {
    public static final int NONE = 0;
    public static final int RGB = 1;
    public static final int ALPHA = 2;
    public static final int RGBA = 3;

    public static String explain(@enumtype(VkCoverageModulationModeNV.class) int value) {
        return switch (value) {
            case VkCoverageModulationModeNV.ALPHA -> "VK_COVERAGE_MODULATION_MODE_ALPHA_NV";
            case VkCoverageModulationModeNV.NONE -> "VK_COVERAGE_MODULATION_MODE_NONE_NV";
            case VkCoverageModulationModeNV.RGBA -> "VK_COVERAGE_MODULATION_MODE_RGBA_NV";
            case VkCoverageModulationModeNV.RGB -> "VK_COVERAGE_MODULATION_MODE_RGB_NV";
            default -> "Unknown VkCoverageModulationModeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkCoverageModulationModeNV() {}
}
