package club.doki7.vulkan.enumtype;

import club.doki7.ffm.annotation.*;
import org.intellij.lang.annotations.MagicConstant;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingInvocationReorderModeNV.html"><code>VkRayTracingInvocationReorderModeNV</code></a>
public final class VkRayTracingInvocationReorderModeNV {
    public static final int NONE = 0x0;
    public static final int REORDER = 0x1;

    public static String explain(@MagicConstant(valuesFromClass = VkRayTracingInvocationReorderModeNV.class) int value) {
        return switch (value) {
            case VkRayTracingInvocationReorderModeNV.NONE -> "VK_RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV";
            case VkRayTracingInvocationReorderModeNV.REORDER -> "VK_RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkRayTracingInvocationReorderModeNV() {}
}
