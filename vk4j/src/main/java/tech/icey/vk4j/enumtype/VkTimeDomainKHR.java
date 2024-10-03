package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkTimeDomainKHR {
    public static final int VK_TIME_DOMAIN_DEVICE_KHR = 0;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR = 1;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR = 2;
    public static final int VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR = 3;

    public static String explain(@enumtype(VkTimeDomainKHR.class) int value) {
        return switch (value) {
            case VK_TIME_DOMAIN_DEVICE_KHR -> "VK_TIME_DOMAIN_DEVICE_KHR";
            case VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR -> "VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR";
            case VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR -> "VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR";
            case VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR -> "VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR";
            default -> "Unknown";
        };
    }
}
