package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoverageReductionModeNV.html">VkCoverageReductionModeNV</a>
public final class VkCoverageReductionModeNV {
    public static final int MERGE = 0;
    public static final int TRUNCATE = 1;

    public static String explain(@enumtype(VkCoverageReductionModeNV.class) int value) {
        return switch (value) {
            case VkCoverageReductionModeNV.MERGE -> "VK_COVERAGE_REDUCTION_MODE_MERGE_NV";
            case VkCoverageReductionModeNV.TRUNCATE -> "VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV";
            default -> "Unknown VkCoverageReductionModeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkCoverageReductionModeNV() {}
}
