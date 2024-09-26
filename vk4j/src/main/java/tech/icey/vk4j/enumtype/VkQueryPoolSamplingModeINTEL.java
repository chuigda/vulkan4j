package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkQueryPoolSamplingModeINTEL {
    public static final int VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL = 0;

    public static String explain(@enumtype(VkQueryPoolSamplingModeINTEL.class) int value) {
        return switch (value) {
            case VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL -> "VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL";
            default -> "Unknown";
        };
    }
}
