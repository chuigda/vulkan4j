package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkPerformanceCounterStorageKHR {
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR = 3;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR = 4;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR = 5;

    public static String explain(@enumtype(VkPerformanceCounterStorageKHR.class) int value) {
        return switch (value) {
            case VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR -> "VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR";
            case VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR -> "VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR";
            case VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR -> "VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR";
            case VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR -> "VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR";
            case VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR -> "VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR";
            case VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR -> "VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR";
            default -> "Unknown";
        };
    }
}
