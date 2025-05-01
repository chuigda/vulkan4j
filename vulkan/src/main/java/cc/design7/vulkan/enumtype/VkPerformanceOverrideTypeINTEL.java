package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceOverrideTypeINTEL.html">VkPerformanceOverrideTypeINTEL</a>
public final class VkPerformanceOverrideTypeINTEL {
    public static final int NULL_HARDWARE = 0x0;
    public static final int FLUSH_GPU_CACHES = 0x1;

    public static String explain(@enumtype(VkPerformanceOverrideTypeINTEL.class) int value) {
        return switch (value) {
            case VkPerformanceOverrideTypeINTEL.FLUSH_GPU_CACHES -> "VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL";
            case VkPerformanceOverrideTypeINTEL.NULL_HARDWARE -> "VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPerformanceOverrideTypeINTEL() {}
}
