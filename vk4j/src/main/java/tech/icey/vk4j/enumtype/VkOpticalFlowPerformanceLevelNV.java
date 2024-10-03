package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkOpticalFlowPerformanceLevelNV {
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV = 1;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV = 2;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV = 3;

    public static String explain(@enumtype(VkOpticalFlowPerformanceLevelNV.class) int value) {
        return switch (value) {
            case VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV -> "VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV";
            case VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV -> "VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV";
            case VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV -> "VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV";
            case VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV -> "VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV";
            default -> "Unknown";
        };
    }
}
