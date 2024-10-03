package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkComponentSwizzle {
    public static final int VK_COMPONENT_SWIZZLE_IDENTITY = 0;
    public static final int VK_COMPONENT_SWIZZLE_ZERO = 1;
    public static final int VK_COMPONENT_SWIZZLE_ONE = 2;
    public static final int VK_COMPONENT_SWIZZLE_R = 3;
    public static final int VK_COMPONENT_SWIZZLE_G = 4;
    public static final int VK_COMPONENT_SWIZZLE_B = 5;
    public static final int VK_COMPONENT_SWIZZLE_A = 6;

    public static String explain(@enumtype(VkComponentSwizzle.class) int value) {
        return switch (value) {
            case VK_COMPONENT_SWIZZLE_IDENTITY -> "VK_COMPONENT_SWIZZLE_IDENTITY";
            case VK_COMPONENT_SWIZZLE_ZERO -> "VK_COMPONENT_SWIZZLE_ZERO";
            case VK_COMPONENT_SWIZZLE_ONE -> "VK_COMPONENT_SWIZZLE_ONE";
            case VK_COMPONENT_SWIZZLE_R -> "VK_COMPONENT_SWIZZLE_R";
            case VK_COMPONENT_SWIZZLE_G -> "VK_COMPONENT_SWIZZLE_G";
            case VK_COMPONENT_SWIZZLE_B -> "VK_COMPONENT_SWIZZLE_B";
            case VK_COMPONENT_SWIZZLE_A -> "VK_COMPONENT_SWIZZLE_A";
            default -> "Unknown";
        };
    }
}
