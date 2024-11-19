package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkRayTracingInvocationReorderModeNV {
    public static final int VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV = 0;
    public static final int VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV = 1;

    public static String explain(@enumtype(VkRayTracingInvocationReorderModeNV.class) int value) {
        return switch (value) {
            case VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV -> "VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV";
            case VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV -> "VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV";
            default -> "Unknown";
        };
    }
}
