package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSamplerMipmapMode {
    public static final int VK_SAMPLER_MIPMAP_MODE_NEAREST = 0;
    public static final int VK_SAMPLER_MIPMAP_MODE_LINEAR = 1;

    public static String explain(@enumtype(VkSamplerMipmapMode.class) int value) {
        return switch (value) {
            case VK_SAMPLER_MIPMAP_MODE_NEAREST -> "VK_SAMPLER_MIPMAP_MODE_NEAREST";
            case VK_SAMPLER_MIPMAP_MODE_LINEAR -> "VK_SAMPLER_MIPMAP_MODE_LINEAR";
            default -> "Unknown";
        };
    }
}
