package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkQueueGlobalPriorityKHR {
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW_KHR = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH_KHR = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME_KHR = 1024;

    public static String explain(@enumtype(VkQueueGlobalPriorityKHR.class) int value) {
        return switch (value) {
            case VK_QUEUE_GLOBAL_PRIORITY_LOW_KHR -> "VK_QUEUE_GLOBAL_PRIORITY_LOW_KHR";
            case VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR -> "VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR";
            case VK_QUEUE_GLOBAL_PRIORITY_HIGH_KHR -> "VK_QUEUE_GLOBAL_PRIORITY_HIGH_KHR";
            case VK_QUEUE_GLOBAL_PRIORITY_REALTIME_KHR -> "VK_QUEUE_GLOBAL_PRIORITY_REALTIME_KHR";
            default -> "Unknown";
        };
    }
}
