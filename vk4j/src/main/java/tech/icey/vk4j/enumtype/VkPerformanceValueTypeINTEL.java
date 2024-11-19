package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPerformanceValueTypeINTEL {
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL = 0;
    public static final int VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL = 1;
    public static final int VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL = 2;
    public static final int VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL = 3;
    public static final int VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL = 4;

    public static String explain(@enumtype(VkPerformanceValueTypeINTEL.class) int value) {
        return switch (value) {
            case VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL -> "VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL";
            case VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL -> "VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL";
            case VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL -> "VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL";
            case VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL -> "VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL";
            case VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL -> "VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL";
            default -> "Unknown";
        };
    }
}
