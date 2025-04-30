package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPointClippingBehavior.html">VkPointClippingBehavior</a>
public final class VkPointClippingBehavior {
    public static final int ALL_CLIP_PLANES = 0x0;
    public static final int USER_CLIP_PLANES_ONLY = 0x1;

    public static String explain(@enumtype(VkPointClippingBehavior.class) int value) {
        return switch (value) {
            case VkPointClippingBehavior.ALL_CLIP_PLANES -> "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES";
            case VkPointClippingBehavior.USER_CLIP_PLANES_ONLY -> "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY";
            default -> "Unknown VkPointClippingBehavior: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPointClippingBehavior() {}
}
