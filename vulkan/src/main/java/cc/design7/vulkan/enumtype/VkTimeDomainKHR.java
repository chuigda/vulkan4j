package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTimeDomainKHR.html">VkTimeDomainKHR</a>
public final class VkTimeDomainKHR {
    public static final int DEVICE = 0;
    public static final int CLOCK_MONOTONIC = 1;
    public static final int CLOCK_MONOTONIC_RAW = 2;
    public static final int QUERY_PERFORMANCE_COUNTER = 3;

    public static String explain(@enumtype(VkTimeDomainKHR.class) int value) {
        return switch (value) {
            case VkTimeDomainKHR.CLOCK_MONOTONIC -> "VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR";
            case VkTimeDomainKHR.CLOCK_MONOTONIC_RAW -> "VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR";
            case VkTimeDomainKHR.DEVICE -> "VK_TIME_DOMAIN_DEVICE_KHR";
            case VkTimeDomainKHR.QUERY_PERFORMANCE_COUNTER -> "VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR";
            default -> "Unknown VkTimeDomainKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkTimeDomainKHR() {}
}
