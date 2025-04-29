package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPoolSamplingModeINTEL.html">VkQueryPoolSamplingModeINTEL</a>
public final class VkQueryPoolSamplingModeINTEL {
    public static final int MANUAL = 0;

    public static String explain(@enumtype(VkQueryPoolSamplingModeINTEL.class) int value) {
        return switch (value) {
            case VkQueryPoolSamplingModeINTEL.MANUAL -> "VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL";
            default -> "Unknown VkQueryPoolSamplingModeINTEL: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkQueryPoolSamplingModeINTEL() {}
}
