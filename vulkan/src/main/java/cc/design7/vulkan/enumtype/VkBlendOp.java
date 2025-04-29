package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBlendOp.html">VkBlendOp</a>
public final class VkBlendOp {
    public static final int ADD = 0;
    public static final int SUBTRACT = 1;
    public static final int REVERSE_SUBTRACT = 2;
    public static final int MIN = 3;
    public static final int MAX = 4;
    public static final int ZERO_EXT = 1000148000;
    public static final int SRC_EXT = 1000148001;
    public static final int DST_EXT = 1000148002;
    public static final int SRC_OVER_EXT = 1000148003;
    public static final int DST_OVER_EXT = 1000148004;
    public static final int SRC_IN_EXT = 1000148005;
    public static final int DST_IN_EXT = 1000148006;
    public static final int SRC_OUT_EXT = 1000148007;
    public static final int DST_OUT_EXT = 1000148008;
    public static final int SRC_ATOP_EXT = 1000148009;
    public static final int DST_ATOP_EXT = 1000148010;
    public static final int XOR_EXT = 1000148011;
    public static final int MULTIPLY_EXT = 1000148012;
    public static final int SCREEN_EXT = 1000148013;
    public static final int OVERLAY_EXT = 1000148014;
    public static final int DARKEN_EXT = 1000148015;
    public static final int LIGHTEN_EXT = 1000148016;
    public static final int COLORDODGE_EXT = 1000148017;
    public static final int COLORBURN_EXT = 1000148018;
    public static final int HARDLIGHT_EXT = 1000148019;
    public static final int SOFTLIGHT_EXT = 1000148020;
    public static final int DIFFERENCE_EXT = 1000148021;
    public static final int EXCLUSION_EXT = 1000148022;
    public static final int INVERT_EXT = 1000148023;
    public static final int INVERT_RGB_EXT = 1000148024;
    public static final int LINEARDODGE_EXT = 1000148025;
    public static final int LINEARBURN_EXT = 1000148026;
    public static final int VIVIDLIGHT_EXT = 1000148027;
    public static final int LINEARLIGHT_EXT = 1000148028;
    public static final int PINLIGHT_EXT = 1000148029;
    public static final int HARDMIX_EXT = 1000148030;
    public static final int HSL_HUE_EXT = 1000148031;
    public static final int HSL_SATURATION_EXT = 1000148032;
    public static final int HSL_COLOR_EXT = 1000148033;
    public static final int HSL_LUMINOSITY_EXT = 1000148034;
    public static final int PLUS_EXT = 1000148035;
    public static final int PLUS_CLAMPED_EXT = 1000148036;
    public static final int PLUS_CLAMPED_ALPHA_EXT = 1000148037;
    public static final int PLUS_DARKER_EXT = 1000148038;
    public static final int MINUS_EXT = 1000148039;
    public static final int MINUS_CLAMPED_EXT = 1000148040;
    public static final int CONTRAST_EXT = 1000148041;
    public static final int INVERT_OVG_EXT = 1000148042;
    public static final int RED_EXT = 1000148043;
    public static final int GREEN_EXT = 1000148044;
    public static final int BLUE_EXT = 1000148045;

    public static String explain(@enumtype(VkBlendOp.class) int value) {
        return switch (value) {
            case VkBlendOp.ADD -> "VK_BLEND_OP_ADD";
            case VkBlendOp.BLUE_EXT -> "VK_BLEND_OP_BLUE_EXT";
            case VkBlendOp.COLORBURN_EXT -> "VK_BLEND_OP_COLORBURN_EXT";
            case VkBlendOp.COLORDODGE_EXT -> "VK_BLEND_OP_COLORDODGE_EXT";
            case VkBlendOp.CONTRAST_EXT -> "VK_BLEND_OP_CONTRAST_EXT";
            case VkBlendOp.DARKEN_EXT -> "VK_BLEND_OP_DARKEN_EXT";
            case VkBlendOp.DIFFERENCE_EXT -> "VK_BLEND_OP_DIFFERENCE_EXT";
            case VkBlendOp.DST_ATOP_EXT -> "VK_BLEND_OP_DST_ATOP_EXT";
            case VkBlendOp.DST_EXT -> "VK_BLEND_OP_DST_EXT";
            case VkBlendOp.DST_IN_EXT -> "VK_BLEND_OP_DST_IN_EXT";
            case VkBlendOp.DST_OUT_EXT -> "VK_BLEND_OP_DST_OUT_EXT";
            case VkBlendOp.DST_OVER_EXT -> "VK_BLEND_OP_DST_OVER_EXT";
            case VkBlendOp.EXCLUSION_EXT -> "VK_BLEND_OP_EXCLUSION_EXT";
            case VkBlendOp.GREEN_EXT -> "VK_BLEND_OP_GREEN_EXT";
            case VkBlendOp.HARDLIGHT_EXT -> "VK_BLEND_OP_HARDLIGHT_EXT";
            case VkBlendOp.HARDMIX_EXT -> "VK_BLEND_OP_HARDMIX_EXT";
            case VkBlendOp.HSL_COLOR_EXT -> "VK_BLEND_OP_HSL_COLOR_EXT";
            case VkBlendOp.HSL_HUE_EXT -> "VK_BLEND_OP_HSL_HUE_EXT";
            case VkBlendOp.HSL_LUMINOSITY_EXT -> "VK_BLEND_OP_HSL_LUMINOSITY_EXT";
            case VkBlendOp.HSL_SATURATION_EXT -> "VK_BLEND_OP_HSL_SATURATION_EXT";
            case VkBlendOp.INVERT_EXT -> "VK_BLEND_OP_INVERT_EXT";
            case VkBlendOp.INVERT_OVG_EXT -> "VK_BLEND_OP_INVERT_OVG_EXT";
            case VkBlendOp.INVERT_RGB_EXT -> "VK_BLEND_OP_INVERT_RGB_EXT";
            case VkBlendOp.LIGHTEN_EXT -> "VK_BLEND_OP_LIGHTEN_EXT";
            case VkBlendOp.LINEARBURN_EXT -> "VK_BLEND_OP_LINEARBURN_EXT";
            case VkBlendOp.LINEARDODGE_EXT -> "VK_BLEND_OP_LINEARDODGE_EXT";
            case VkBlendOp.LINEARLIGHT_EXT -> "VK_BLEND_OP_LINEARLIGHT_EXT";
            case VkBlendOp.MAX -> "VK_BLEND_OP_MAX";
            case VkBlendOp.MIN -> "VK_BLEND_OP_MIN";
            case VkBlendOp.MINUS_CLAMPED_EXT -> "VK_BLEND_OP_MINUS_CLAMPED_EXT";
            case VkBlendOp.MINUS_EXT -> "VK_BLEND_OP_MINUS_EXT";
            case VkBlendOp.MULTIPLY_EXT -> "VK_BLEND_OP_MULTIPLY_EXT";
            case VkBlendOp.OVERLAY_EXT -> "VK_BLEND_OP_OVERLAY_EXT";
            case VkBlendOp.PINLIGHT_EXT -> "VK_BLEND_OP_PINLIGHT_EXT";
            case VkBlendOp.PLUS_CLAMPED_ALPHA_EXT -> "VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT";
            case VkBlendOp.PLUS_CLAMPED_EXT -> "VK_BLEND_OP_PLUS_CLAMPED_EXT";
            case VkBlendOp.PLUS_DARKER_EXT -> "VK_BLEND_OP_PLUS_DARKER_EXT";
            case VkBlendOp.PLUS_EXT -> "VK_BLEND_OP_PLUS_EXT";
            case VkBlendOp.RED_EXT -> "VK_BLEND_OP_RED_EXT";
            case VkBlendOp.REVERSE_SUBTRACT -> "VK_BLEND_OP_REVERSE_SUBTRACT";
            case VkBlendOp.SCREEN_EXT -> "VK_BLEND_OP_SCREEN_EXT";
            case VkBlendOp.SOFTLIGHT_EXT -> "VK_BLEND_OP_SOFTLIGHT_EXT";
            case VkBlendOp.SRC_ATOP_EXT -> "VK_BLEND_OP_SRC_ATOP_EXT";
            case VkBlendOp.SRC_EXT -> "VK_BLEND_OP_SRC_EXT";
            case VkBlendOp.SRC_IN_EXT -> "VK_BLEND_OP_SRC_IN_EXT";
            case VkBlendOp.SRC_OUT_EXT -> "VK_BLEND_OP_SRC_OUT_EXT";
            case VkBlendOp.SRC_OVER_EXT -> "VK_BLEND_OP_SRC_OVER_EXT";
            case VkBlendOp.SUBTRACT -> "VK_BLEND_OP_SUBTRACT";
            case VkBlendOp.VIVIDLIGHT_EXT -> "VK_BLEND_OP_VIVIDLIGHT_EXT";
            case VkBlendOp.XOR_EXT -> "VK_BLEND_OP_XOR_EXT";
            case VkBlendOp.ZERO_EXT -> "VK_BLEND_OP_ZERO_EXT";
            default -> "Unknown VkBlendOp: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkBlendOp() {}
}
