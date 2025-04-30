package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceParameterTypeINTEL.html">VkPerformanceParameterTypeINTEL</a>
public final class VkPerformanceParameterTypeINTEL {
    public static final int HW_COUNTERS_SUPPORTED = 0x0;
    public static final int STREAM_MARKER_VALID_BITS = 0x1;

    public static String explain(@enumtype(VkPerformanceParameterTypeINTEL.class) int value) {
        return switch (value) {
            case VkPerformanceParameterTypeINTEL.HW_COUNTERS_SUPPORTED -> "VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL";
            case VkPerformanceParameterTypeINTEL.STREAM_MARKER_VALID_BITS -> "VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL";
            default -> "Unknown VkPerformanceParameterTypeINTEL: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPerformanceParameterTypeINTEL() {}
}
