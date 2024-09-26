package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkPresentModeKHR {
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;
    public static final int VK_PRESENT_MODE_FIFO_KHR = 2;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;
    public static final int VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;

    public static String explain(@enumtype(VkPresentModeKHR.class) int value) {
        return switch (value) {
            case VK_PRESENT_MODE_IMMEDIATE_KHR -> "VK_PRESENT_MODE_IMMEDIATE_KHR";
            case VK_PRESENT_MODE_MAILBOX_KHR -> "VK_PRESENT_MODE_MAILBOX_KHR";
            case VK_PRESENT_MODE_FIFO_KHR -> "VK_PRESENT_MODE_FIFO_KHR";
            case VK_PRESENT_MODE_FIFO_RELAXED_KHR -> "VK_PRESENT_MODE_FIFO_RELAXED_KHR";
            case VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR -> "VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR";
            case VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR -> "VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR";
            default -> "Unknown";
        };
    }
}
