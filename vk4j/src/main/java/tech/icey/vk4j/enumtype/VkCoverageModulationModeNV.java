package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkCoverageModulationModeNV {
    public static final int VK_COVERAGE_MODULATION_MODE_NONE_NV = 0;
    public static final int VK_COVERAGE_MODULATION_MODE_RGB_NV = 1;
    public static final int VK_COVERAGE_MODULATION_MODE_ALPHA_NV = 2;
    public static final int VK_COVERAGE_MODULATION_MODE_RGBA_NV = 3;

    public static String explain(@enumtype(VkCoverageModulationModeNV.class) int value) {
        return switch (value) {
            case VK_COVERAGE_MODULATION_MODE_NONE_NV -> "VK_COVERAGE_MODULATION_MODE_NONE_NV";
            case VK_COVERAGE_MODULATION_MODE_RGB_NV -> "VK_COVERAGE_MODULATION_MODE_RGB_NV";
            case VK_COVERAGE_MODULATION_MODE_ALPHA_NV -> "VK_COVERAGE_MODULATION_MODE_ALPHA_NV";
            case VK_COVERAGE_MODULATION_MODE_RGBA_NV -> "VK_COVERAGE_MODULATION_MODE_RGBA_NV";
            default -> "Unknown";
        };
    }
}
