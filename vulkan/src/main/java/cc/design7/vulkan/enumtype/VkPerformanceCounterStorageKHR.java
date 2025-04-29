package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterStorageKHR.html">VkPerformanceCounterStorageKHR</a>
public final class VkPerformanceCounterStorageKHR {
    public static final int INT32 = 0;
    public static final int INT64 = 1;
    public static final int UINT32 = 2;
    public static final int UINT64 = 3;
    public static final int FLOAT32 = 4;
    public static final int FLOAT64 = 5;

    public static String explain(@enumtype(VkPerformanceCounterStorageKHR.class) int value) {
        return switch (value) {
            case VkPerformanceCounterStorageKHR.FLOAT32 -> "VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR";
            case VkPerformanceCounterStorageKHR.FLOAT64 -> "VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR";
            case VkPerformanceCounterStorageKHR.INT32 -> "VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR";
            case VkPerformanceCounterStorageKHR.INT64 -> "VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR";
            case VkPerformanceCounterStorageKHR.UINT32 -> "VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR";
            case VkPerformanceCounterStorageKHR.UINT64 -> "VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR";
            default -> "Unknown VkPerformanceCounterStorageKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPerformanceCounterStorageKHR() {}
}
