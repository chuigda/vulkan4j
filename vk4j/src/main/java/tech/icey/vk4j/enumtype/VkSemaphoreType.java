package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSemaphoreType {
    public static final int VK_SEMAPHORE_TYPE_BINARY = 0;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE = 1;

    public static String explain(@enumtype(VkSemaphoreType.class) int value) {
        return switch (value) {
            case VK_SEMAPHORE_TYPE_BINARY -> "VK_SEMAPHORE_TYPE_BINARY";
            case VK_SEMAPHORE_TYPE_TIMELINE -> "VK_SEMAPHORE_TYPE_TIMELINE";
            default -> "Unknown";
        };
    }
}
