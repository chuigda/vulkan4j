package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageType.html">VkImageType</a>
public final class VkImageType {
    public static final int _1D = 0x0;
    public static final int _2D = 0x1;
    public static final int _3D = 0x2;

    public static String explain(@enumtype(VkImageType.class) int value) {
        return switch (value) {
            case VkImageType._1D -> "VK_IMAGE_TYPE_1D";
            case VkImageType._2D -> "VK_IMAGE_TYPE_2D";
            case VkImageType._3D -> "VK_IMAGE_TYPE_3D";
            default -> "Unknown VkImageType: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageType() {}
}
