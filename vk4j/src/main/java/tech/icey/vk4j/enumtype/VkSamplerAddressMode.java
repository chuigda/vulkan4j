package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkSamplerAddressMode {
    public static final int VK_SAMPLER_ADDRESS_MODE_REPEAT = 0;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2;
    public static final int VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3;
    public static final int VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4;

    public static String explain(@enumtype(VkSamplerAddressMode.class) int value) {
        return switch (value) {
            case VK_SAMPLER_ADDRESS_MODE_REPEAT -> "VK_SAMPLER_ADDRESS_MODE_REPEAT";
            case VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT -> "VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT";
            case VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE -> "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE";
            case VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER -> "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER";
            case VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE -> "VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE";
            default -> "Unknown";
        };
    }
}
