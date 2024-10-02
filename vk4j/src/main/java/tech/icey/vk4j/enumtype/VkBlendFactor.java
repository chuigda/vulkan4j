package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkBlendFactor {
    public static final int VK_BLEND_FACTOR_ZERO = 0;
    public static final int VK_BLEND_FACTOR_ONE = 1;
    public static final int VK_BLEND_FACTOR_SRC_COLOR = 2;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3;
    public static final int VK_BLEND_FACTOR_DST_COLOR = 4;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA = 6;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7;
    public static final int VK_BLEND_FACTOR_DST_ALPHA = 8;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9;
    public static final int VK_BLEND_FACTOR_CONSTANT_COLOR = 10;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11;
    public static final int VK_BLEND_FACTOR_CONSTANT_ALPHA = 12;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13;
    public static final int VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14;
    public static final int VK_BLEND_FACTOR_SRC1_COLOR = 15;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16;
    public static final int VK_BLEND_FACTOR_SRC1_ALPHA = 17;
    public static final int VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18;

    public static String explain(@enumtype(VkBlendFactor.class) int value) {
        return switch (value) {
            case VK_BLEND_FACTOR_ZERO -> "VK_BLEND_FACTOR_ZERO";
            case VK_BLEND_FACTOR_ONE -> "VK_BLEND_FACTOR_ONE";
            case VK_BLEND_FACTOR_SRC_COLOR -> "VK_BLEND_FACTOR_SRC_COLOR";
            case VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR";
            case VK_BLEND_FACTOR_DST_COLOR -> "VK_BLEND_FACTOR_DST_COLOR";
            case VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR";
            case VK_BLEND_FACTOR_SRC_ALPHA -> "VK_BLEND_FACTOR_SRC_ALPHA";
            case VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA";
            case VK_BLEND_FACTOR_DST_ALPHA -> "VK_BLEND_FACTOR_DST_ALPHA";
            case VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA";
            case VK_BLEND_FACTOR_CONSTANT_COLOR -> "VK_BLEND_FACTOR_CONSTANT_COLOR";
            case VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR";
            case VK_BLEND_FACTOR_CONSTANT_ALPHA -> "VK_BLEND_FACTOR_CONSTANT_ALPHA";
            case VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA";
            case VK_BLEND_FACTOR_SRC_ALPHA_SATURATE -> "VK_BLEND_FACTOR_SRC_ALPHA_SATURATE";
            case VK_BLEND_FACTOR_SRC1_COLOR -> "VK_BLEND_FACTOR_SRC1_COLOR";
            case VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR";
            case VK_BLEND_FACTOR_SRC1_ALPHA -> "VK_BLEND_FACTOR_SRC1_ALPHA";
            case VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA";
            default -> "Unknown";
        };
    }
}
