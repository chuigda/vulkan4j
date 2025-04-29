package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerReductionMode.html">VkSamplerReductionMode</a>
public final class VkSamplerReductionMode {
    public static final int WEIGHTED_AVERAGE = 0;
    public static final int MIN = 1;
    public static final int MAX = 2;
    public static final int WEIGHTED_AVERAGE_RANGECLAMP_QCOM = 1000521000;

    public static String explain(@enumtype(VkSamplerReductionMode.class) int value) {
        return switch (value) {
            case VkSamplerReductionMode.MAX -> "VK_SAMPLER_REDUCTION_MODE_MAX";
            case VkSamplerReductionMode.MIN -> "VK_SAMPLER_REDUCTION_MODE_MIN";
            case VkSamplerReductionMode.WEIGHTED_AVERAGE -> "VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE";
            case VkSamplerReductionMode.WEIGHTED_AVERAGE_RANGECLAMP_QCOM -> "VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM";
            default -> "Unknown VkSamplerReductionMode: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSamplerReductionMode() {}
}
