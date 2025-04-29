package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFragmentShadingRateNV.html">VkFragmentShadingRateNV</a>
public final class VkFragmentShadingRateNV {
    public static final int _1_INVOCATION_PER_PIXEL = 0;
    public static final int _1_INVOCATION_PER_1X2_PIXELS = 1;
    public static final int _1_INVOCATION_PER_2X1_PIXELS = 4;
    public static final int _1_INVOCATION_PER_2X2_PIXELS = 5;
    public static final int _1_INVOCATION_PER_2X4_PIXELS = 6;
    public static final int _1_INVOCATION_PER_4X2_PIXELS = 9;
    public static final int _1_INVOCATION_PER_4X4_PIXELS = 10;
    public static final int _2_INVOCATIONS_PER_PIXEL = 11;
    public static final int _4_INVOCATIONS_PER_PIXEL = 12;
    public static final int _8_INVOCATIONS_PER_PIXEL = 13;
    public static final int _16_INVOCATIONS_PER_PIXEL = 14;
    public static final int NO_INVOCATIONS = 15;

    public static String explain(@enumtype(VkFragmentShadingRateNV.class) int value) {
        return switch (value) {
            case VkFragmentShadingRateNV._16_INVOCATIONS_PER_PIXEL -> "VK_FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV";
            case VkFragmentShadingRateNV._1_INVOCATION_PER_1X2_PIXELS -> "VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV";
            case VkFragmentShadingRateNV._1_INVOCATION_PER_2X1_PIXELS -> "VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV";
            case VkFragmentShadingRateNV._1_INVOCATION_PER_2X2_PIXELS -> "VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV";
            case VkFragmentShadingRateNV._1_INVOCATION_PER_2X4_PIXELS -> "VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV";
            case VkFragmentShadingRateNV._1_INVOCATION_PER_4X2_PIXELS -> "VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV";
            case VkFragmentShadingRateNV._1_INVOCATION_PER_4X4_PIXELS -> "VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV";
            case VkFragmentShadingRateNV._1_INVOCATION_PER_PIXEL -> "VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV";
            case VkFragmentShadingRateNV._2_INVOCATIONS_PER_PIXEL -> "VK_FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV";
            case VkFragmentShadingRateNV._4_INVOCATIONS_PER_PIXEL -> "VK_FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV";
            case VkFragmentShadingRateNV._8_INVOCATIONS_PER_PIXEL -> "VK_FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV";
            case VkFragmentShadingRateNV.NO_INVOCATIONS -> "VK_FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV";
            default -> "Unknown VkFragmentShadingRateNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkFragmentShadingRateNV() {}
}
