package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPerformanceParameterTypeINTEL {
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL = 0;
    public static final int VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL = 1;

    public static String explain(@enumtype(VkPerformanceParameterTypeINTEL.class) int value) {
        return switch (value) {
            case VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL -> "VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL";
            case VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL -> "VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL";
            default -> "Unknown";
        };
    }
}
