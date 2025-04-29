package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewportCoordinateSwizzleNV.html">VkViewportCoordinateSwizzleNV</a>
public final class VkViewportCoordinateSwizzleNV {
    public static final int POSITIVE_X = 0;
    public static final int NEGATIVE_X = 1;
    public static final int POSITIVE_Y = 2;
    public static final int NEGATIVE_Y = 3;
    public static final int POSITIVE_Z = 4;
    public static final int NEGATIVE_Z = 5;
    public static final int POSITIVE_W = 6;
    public static final int NEGATIVE_W = 7;

    public static String explain(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        return switch (value) {
            case VkViewportCoordinateSwizzleNV.NEGATIVE_W -> "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV";
            case VkViewportCoordinateSwizzleNV.NEGATIVE_X -> "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV";
            case VkViewportCoordinateSwizzleNV.NEGATIVE_Y -> "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV";
            case VkViewportCoordinateSwizzleNV.NEGATIVE_Z -> "VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV";
            case VkViewportCoordinateSwizzleNV.POSITIVE_W -> "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV";
            case VkViewportCoordinateSwizzleNV.POSITIVE_X -> "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV";
            case VkViewportCoordinateSwizzleNV.POSITIVE_Y -> "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV";
            case VkViewportCoordinateSwizzleNV.POSITIVE_Z -> "VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV";
            default -> "Unknown VkViewportCoordinateSwizzleNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkViewportCoordinateSwizzleNV() {}
}
