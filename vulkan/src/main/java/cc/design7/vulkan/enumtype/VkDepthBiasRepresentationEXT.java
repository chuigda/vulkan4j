package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDepthBiasRepresentationEXT.html">VkDepthBiasRepresentationEXT</a>
public final class VkDepthBiasRepresentationEXT {
    public static final int LEAST_REPRESENTABLE_VALUE_FORMAT = 0x0;
    public static final int LEAST_REPRESENTABLE_VALUE_FORCE_UNORM = 0x1;
    public static final int FLOAT = 0x2;

    public static String explain(@enumtype(VkDepthBiasRepresentationEXT.class) int value) {
        return switch (value) {
            case VkDepthBiasRepresentationEXT.FLOAT -> "VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT";
            case VkDepthBiasRepresentationEXT.LEAST_REPRESENTABLE_VALUE_FORCE_UNORM -> "VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT";
            case VkDepthBiasRepresentationEXT.LEAST_REPRESENTABLE_VALUE_FORMAT -> "VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT";
            default -> "Unknown VkDepthBiasRepresentationEXT: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDepthBiasRepresentationEXT() {}
}
