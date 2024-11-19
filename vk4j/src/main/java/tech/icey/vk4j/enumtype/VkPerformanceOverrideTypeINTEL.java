package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPerformanceOverrideTypeINTEL {
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL = 0;
    public static final int VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL = 1;

    public static String explain(@enumtype(VkPerformanceOverrideTypeINTEL.class) int value) {
        return switch (value) {
            case VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL -> "VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL";
            case VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL -> "VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL";
            default -> "Unknown";
        };
    }
}
