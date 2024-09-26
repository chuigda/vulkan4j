package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSamplerYcbcrModelConversion {
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY = 0;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY = 1;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 = 2;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 = 3;
    public static final int VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 = 4;

    public static String explain(@enumtype(VkSamplerYcbcrModelConversion.class) int value) {
        return switch (value) {
            case VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY -> "VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY";
            case VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY -> "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY";
            case VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709 -> "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709";
            case VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601 -> "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601";
            case VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020 -> "VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020";
            default -> "Unknown";
        };
    }
}
