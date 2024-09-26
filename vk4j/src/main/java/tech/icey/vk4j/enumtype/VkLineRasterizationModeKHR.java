package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkLineRasterizationModeKHR {
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR = 3;

    public static String explain(@enumtype(VkLineRasterizationModeKHR.class) int value) {
        return switch (value) {
            case VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR -> "VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR";
            case VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR -> "VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR";
            case VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR -> "VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR";
            case VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR -> "VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR";
            default -> "Unknown";
        };
    }
}
