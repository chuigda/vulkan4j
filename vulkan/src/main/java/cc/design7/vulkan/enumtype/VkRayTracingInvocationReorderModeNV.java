package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingInvocationReorderModeNV.html">VkRayTracingInvocationReorderModeNV</a>
public final class VkRayTracingInvocationReorderModeNV {
    public static final int NONE = 0x0;
    public static final int REORDER = 0x1;

    public static String explain(@enumtype(VkRayTracingInvocationReorderModeNV.class) int value) {
        return switch (value) {
            case VkRayTracingInvocationReorderModeNV.NONE -> "VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV";
            case VkRayTracingInvocationReorderModeNV.REORDER -> "VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV";
            default -> "Unknown VkRayTracingInvocationReorderModeNV: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkRayTracingInvocationReorderModeNV() {}
}
