package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerMipmapMode.html">VkSamplerMipmapMode</a>
public final class VkSamplerMipmapMode {
    public static final int NEAREST = 0;
    public static final int LINEAR = 1;

    public static String explain(@enumtype(VkSamplerMipmapMode.class) int value) {
        return switch (value) {
            case VkSamplerMipmapMode.LINEAR -> "VK_SAMPLER_MIPMAP_MODE_LINEAR";
            case VkSamplerMipmapMode.NEAREST -> "VK_SAMPLER_MIPMAP_MODE_NEAREST";
            default -> "Unknown VkSamplerMipmapMode: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSamplerMipmapMode() {}
}
