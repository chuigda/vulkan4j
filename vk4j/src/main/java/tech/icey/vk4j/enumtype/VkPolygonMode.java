package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPolygonMode {
    public static final int VK_POLYGON_MODE_FILL = 0;
    public static final int VK_POLYGON_MODE_LINE = 1;
    public static final int VK_POLYGON_MODE_POINT = 2;
    public static final int VK_POLYGON_MODE_FILL_RECTANGLE_NV = 1000153000;

    public static String explain(@enumtype(VkPolygonMode.class) int value) {
        return switch (value) {
            case VK_POLYGON_MODE_FILL -> "VK_POLYGON_MODE_FILL";
            case VK_POLYGON_MODE_LINE -> "VK_POLYGON_MODE_LINE";
            case VK_POLYGON_MODE_POINT -> "VK_POLYGON_MODE_POINT";
            case VK_POLYGON_MODE_FILL_RECTANGLE_NV -> "VK_POLYGON_MODE_FILL_RECTANGLE_NV";
            default -> "Unknown";
        };
    }
}
