package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkFrontFace {
    public static final int VK_FRONT_FACE_COUNTER_CLOCKWISE = 0;
    public static final int VK_FRONT_FACE_CLOCKWISE = 1;

    public static String explain(@enumtype(VkFrontFace.class) int value) {
        return switch (value) {
            case VK_FRONT_FACE_COUNTER_CLOCKWISE -> "VK_FRONT_FACE_COUNTER_CLOCKWISE";
            case VK_FRONT_FACE_CLOCKWISE -> "VK_FRONT_FACE_CLOCKWISE";
            default -> "Unknown";
        };
    }
}
