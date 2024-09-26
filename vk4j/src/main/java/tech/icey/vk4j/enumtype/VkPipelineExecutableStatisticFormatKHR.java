package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkPipelineExecutableStatisticFormatKHR {
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR = 0;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR = 1;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR = 2;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR = 3;

    public static String explain(@enumtype(VkPipelineExecutableStatisticFormatKHR.class) int value) {
        return switch (value) {
            case VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR -> "VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR";
            case VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR -> "VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR";
            case VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR -> "VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR";
            case VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR -> "VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR";
            default -> "Unknown";
        };
    }
}
