package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkCoverageReductionModeNV {
    public static final int VK_COVERAGE_REDUCTION_MODE_MERGE_NV = 0;
    public static final int VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV = 1;

    public static String explain(@enumtype(VkCoverageReductionModeNV.class) int value) {
        return switch (value) {
            case VK_COVERAGE_REDUCTION_MODE_MERGE_NV -> "VK_COVERAGE_REDUCTION_MODE_MERGE_NV";
            case VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV -> "VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV";
            default -> "Unknown";
        };
    }
}
