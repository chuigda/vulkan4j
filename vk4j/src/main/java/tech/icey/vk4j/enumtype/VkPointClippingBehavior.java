package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkPointClippingBehavior {
    public static final int VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES = 0;
    public static final int VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY = 1;

    public static String explain(@enumtype(VkPointClippingBehavior.class) int value) {
        return switch (value) {
            case VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES -> "VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES";
            case VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY -> "VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY";
            default -> "Unknown";
        };
    }
}
