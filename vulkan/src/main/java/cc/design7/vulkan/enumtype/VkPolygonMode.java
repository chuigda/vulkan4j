package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPolygonMode.html">VkPolygonMode</a>
public final class VkPolygonMode {
    public static final int FILL = 0;
    public static final int LINE = 1;
    public static final int POINT = 2;
    public static final int FILL_RECTANGLE_NV = 1000153000;

    public static String explain(@enumtype(VkPolygonMode.class) int value) {
        return switch (value) {
            case VkPolygonMode.FILL -> "VK_POLYGON_MODE_FILL";
            case VkPolygonMode.FILL_RECTANGLE_NV -> "VK_POLYGON_MODE_FILL_RECTANGLE_NV";
            case VkPolygonMode.LINE -> "VK_POLYGON_MODE_LINE";
            case VkPolygonMode.POINT -> "VK_POLYGON_MODE_POINT";
            default -> "Unknown VkPolygonMode: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPolygonMode() {}
}
