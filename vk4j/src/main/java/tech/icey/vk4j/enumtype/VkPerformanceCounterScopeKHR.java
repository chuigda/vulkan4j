package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPerformanceCounterScopeKHR {
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR = 2;

    public static String explain(@enumtype(VkPerformanceCounterScopeKHR.class) int value) {
        return switch (value) {
            case VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR -> "VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR";
            case VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR -> "VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR";
            case VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR -> "VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR";
            default -> "Unknown";
        };
    }
}
