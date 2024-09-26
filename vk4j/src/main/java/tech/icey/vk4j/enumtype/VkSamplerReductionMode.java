package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSamplerReductionMode {
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE = 0;
    public static final int VK_SAMPLER_REDUCTION_MODE_MIN = 1;
    public static final int VK_SAMPLER_REDUCTION_MODE_MAX = 2;
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM = 1000521000;

    public static String explain(@enumtype(VkSamplerReductionMode.class) int value) {
        return switch (value) {
            case VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE -> "VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE";
            case VK_SAMPLER_REDUCTION_MODE_MIN -> "VK_SAMPLER_REDUCTION_MODE_MIN";
            case VK_SAMPLER_REDUCTION_MODE_MAX -> "VK_SAMPLER_REDUCTION_MODE_MAX";
            case VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM -> "VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM";
            default -> "Unknown";
        };
    }
}
