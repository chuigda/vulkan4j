package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkFragmentShadingRateCombinerOpKHR {
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR = 2;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR = 3;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR = 4;

    public static String explain(@enumtype(VkFragmentShadingRateCombinerOpKHR.class) int value) {
        return switch (value) {
            case VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR -> "VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR";
            case VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR -> "VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR";
            case VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR -> "VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR";
            case VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR -> "VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR";
            case VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR -> "VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR";
            default -> "Unknown";
        };
    }
}
