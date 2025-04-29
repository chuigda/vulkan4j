package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkComponentSwizzle.html">VkComponentSwizzle</a>
public final class VkComponentSwizzle {
    public static final int IDENTITY = 0;
    public static final int ZERO = 1;
    public static final int ONE = 2;
    public static final int R = 3;
    public static final int G = 4;
    public static final int B = 5;
    public static final int A = 6;

    public static String explain(@enumtype(VkComponentSwizzle.class) int value) {
        return switch (value) {
            case VkComponentSwizzle.A -> "VK_COMPONENT_SWIZZLE_A";
            case VkComponentSwizzle.B -> "VK_COMPONENT_SWIZZLE_B";
            case VkComponentSwizzle.G -> "VK_COMPONENT_SWIZZLE_G";
            case VkComponentSwizzle.IDENTITY -> "VK_COMPONENT_SWIZZLE_IDENTITY";
            case VkComponentSwizzle.ONE -> "VK_COMPONENT_SWIZZLE_ONE";
            case VkComponentSwizzle.R -> "VK_COMPONENT_SWIZZLE_R";
            case VkComponentSwizzle.ZERO -> "VK_COMPONENT_SWIZZLE_ZERO";
            default -> "Unknown VkComponentSwizzle: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkComponentSwizzle() {}
}
