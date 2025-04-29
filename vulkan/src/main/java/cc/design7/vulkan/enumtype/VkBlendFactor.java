package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBlendFactor.html">VkBlendFactor</a>
public final class VkBlendFactor {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int SRC_COLOR = 2;
    public static final int ONE_MINUS_SRC_COLOR = 3;
    public static final int DST_COLOR = 4;
    public static final int ONE_MINUS_DST_COLOR = 5;
    public static final int SRC_ALPHA = 6;
    public static final int ONE_MINUS_SRC_ALPHA = 7;
    public static final int DST_ALPHA = 8;
    public static final int ONE_MINUS_DST_ALPHA = 9;
    public static final int CONSTANT_COLOR = 10;
    public static final int ONE_MINUS_CONSTANT_COLOR = 11;
    public static final int CONSTANT_ALPHA = 12;
    public static final int ONE_MINUS_CONSTANT_ALPHA = 13;
    public static final int SRC_ALPHA_SATURATE = 14;
    public static final int SRC1_COLOR = 15;
    public static final int ONE_MINUS_SRC1_COLOR = 16;
    public static final int SRC1_ALPHA = 17;
    public static final int ONE_MINUS_SRC1_ALPHA = 18;

    public static String explain(@enumtype(VkBlendFactor.class) int value) {
        return switch (value) {
            case VkBlendFactor.CONSTANT_ALPHA -> "VK_BLEND_FACTOR_CONSTANT_ALPHA";
            case VkBlendFactor.CONSTANT_COLOR -> "VK_BLEND_FACTOR_CONSTANT_COLOR";
            case VkBlendFactor.DST_ALPHA -> "VK_BLEND_FACTOR_DST_ALPHA";
            case VkBlendFactor.DST_COLOR -> "VK_BLEND_FACTOR_DST_COLOR";
            case VkBlendFactor.ONE -> "VK_BLEND_FACTOR_ONE";
            case VkBlendFactor.ONE_MINUS_CONSTANT_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA";
            case VkBlendFactor.ONE_MINUS_CONSTANT_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR";
            case VkBlendFactor.ONE_MINUS_DST_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA";
            case VkBlendFactor.ONE_MINUS_DST_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR";
            case VkBlendFactor.ONE_MINUS_SRC1_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA";
            case VkBlendFactor.ONE_MINUS_SRC1_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR";
            case VkBlendFactor.ONE_MINUS_SRC_ALPHA -> "VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA";
            case VkBlendFactor.ONE_MINUS_SRC_COLOR -> "VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR";
            case VkBlendFactor.SRC1_ALPHA -> "VK_BLEND_FACTOR_SRC1_ALPHA";
            case VkBlendFactor.SRC1_COLOR -> "VK_BLEND_FACTOR_SRC1_COLOR";
            case VkBlendFactor.SRC_ALPHA -> "VK_BLEND_FACTOR_SRC_ALPHA";
            case VkBlendFactor.SRC_ALPHA_SATURATE -> "VK_BLEND_FACTOR_SRC_ALPHA_SATURATE";
            case VkBlendFactor.SRC_COLOR -> "VK_BLEND_FACTOR_SRC_COLOR";
            case VkBlendFactor.ZERO -> "VK_BLEND_FACTOR_ZERO";
            default -> "Unknown VkBlendFactor: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkBlendFactor() {}
}
