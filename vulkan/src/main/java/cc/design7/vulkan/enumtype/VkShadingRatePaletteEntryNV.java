package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShadingRatePaletteEntryNV.html">VkShadingRatePaletteEntryNV</a>
public final class VkShadingRatePaletteEntryNV {
    public static final int NO_INVOCATIONS = 0;
    public static final int _16_INVOCATIONS_PER_PIXEL = 1;
    public static final int _8_INVOCATIONS_PER_PIXEL = 2;
    public static final int _4_INVOCATIONS_PER_PIXEL = 3;
    public static final int _2_INVOCATIONS_PER_PIXEL = 4;
    public static final int _1_INVOCATION_PER_PIXEL = 5;
    public static final int _1_INVOCATION_PER_2X1_PIXELS = 6;
    public static final int _1_INVOCATION_PER_1X2_PIXELS = 7;
    public static final int _1_INVOCATION_PER_2X2_PIXELS = 8;
    public static final int _1_INVOCATION_PER_4X2_PIXELS = 9;
    public static final int _1_INVOCATION_PER_2X4_PIXELS = 10;
    public static final int _1_INVOCATION_PER_4X4_PIXELS = 11;

    public static String explain(@enumtype(VkShadingRatePaletteEntryNV.class) int value) {
        return switch (value) {
            case VkShadingRatePaletteEntryNV._16_INVOCATIONS_PER_PIXEL -> "VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV";
            case VkShadingRatePaletteEntryNV._1_INVOCATION_PER_1X2_PIXELS -> "VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV";
            case VkShadingRatePaletteEntryNV._1_INVOCATION_PER_2X1_PIXELS -> "VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV";
            case VkShadingRatePaletteEntryNV._1_INVOCATION_PER_2X2_PIXELS -> "VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV";
            case VkShadingRatePaletteEntryNV._1_INVOCATION_PER_2X4_PIXELS -> "VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV";
            case VkShadingRatePaletteEntryNV._1_INVOCATION_PER_4X2_PIXELS -> "VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV";
            case VkShadingRatePaletteEntryNV._1_INVOCATION_PER_4X4_PIXELS -> "VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV";
            case VkShadingRatePaletteEntryNV._1_INVOCATION_PER_PIXEL -> "VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV";
            case VkShadingRatePaletteEntryNV._2_INVOCATIONS_PER_PIXEL -> "VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV";
            case VkShadingRatePaletteEntryNV._4_INVOCATIONS_PER_PIXEL -> "VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV";
            case VkShadingRatePaletteEntryNV._8_INVOCATIONS_PER_PIXEL -> "VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV";
            case VkShadingRatePaletteEntryNV.NO_INVOCATIONS -> "VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV";
            default -> "Unknown VkShadingRatePaletteEntryNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkShadingRatePaletteEntryNV() {}
}
