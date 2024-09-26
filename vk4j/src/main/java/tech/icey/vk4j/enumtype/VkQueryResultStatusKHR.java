package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkQueryResultStatusKHR {
    public static final int VK_QUERY_RESULT_STATUS_ERROR_KHR = -1;
    public static final int VK_QUERY_RESULT_STATUS_NOT_READY_KHR = 0;
    public static final int VK_QUERY_RESULT_STATUS_COMPLETE_KHR = 1;
    public static final int VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR = -1000299000;

    public static String explain(@enumtype(VkQueryResultStatusKHR.class) int value) {
        return switch (value) {
            case VK_QUERY_RESULT_STATUS_ERROR_KHR -> "VK_QUERY_RESULT_STATUS_ERROR_KHR";
            case VK_QUERY_RESULT_STATUS_NOT_READY_KHR -> "VK_QUERY_RESULT_STATUS_NOT_READY_KHR";
            case VK_QUERY_RESULT_STATUS_COMPLETE_KHR -> "VK_QUERY_RESULT_STATUS_COMPLETE_KHR";
            case VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR -> "VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR";
            default -> "Unknown";
        };
    }
}
