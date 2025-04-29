package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerAddressMode.html">VkSamplerAddressMode</a>
public final class VkSamplerAddressMode {
    public static final int REPEAT = 0;
    public static final int MIRRORED_REPEAT = 1;
    public static final int CLAMP_TO_EDGE = 2;
    public static final int CLAMP_TO_BORDER = 3;
    public static final int MIRROR_CLAMP_TO_EDGE = [4];

    public static String explain(@enumtype(VkSamplerAddressMode.class) int value) {
        return switch (value) {
            case VkSamplerAddressMode.CLAMP_TO_BORDER -> "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER";
            case VkSamplerAddressMode.CLAMP_TO_EDGE -> "VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE";
            case VkSamplerAddressMode.MIRRORED_REPEAT -> "VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT";
            case VkSamplerAddressMode.MIRROR_CLAMP_TO_EDGE -> "VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE";
            case VkSamplerAddressMode.REPEAT -> "VK_SAMPLER_ADDRESS_MODE_REPEAT";
            default -> "Unknown VkSamplerAddressMode: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSamplerAddressMode() {}
}
