package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDepthBiasRepresentationEXT {
    public static final int VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT = 0;
    public static final int VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT = 1;
    public static final int VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT = 2;

    public static String explain(@enumtype(VkDepthBiasRepresentationEXT.class) int value) {
        return switch (value) {
            case VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT -> "VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORMAT_EXT";
            case VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT -> "VK_DEPTH_BIAS_REPRESENTATION_LEAST_REPRESENTABLE_VALUE_FORCE_UNORM_EXT";
            case VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT -> "VK_DEPTH_BIAS_REPRESENTATION_FLOAT_EXT";
            default -> "Unknown";
        };
    }
}
