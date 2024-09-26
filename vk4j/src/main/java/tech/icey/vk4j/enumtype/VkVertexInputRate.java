package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkVertexInputRate {
    public static final int VK_VERTEX_INPUT_RATE_VERTEX = 0;
    public static final int VK_VERTEX_INPUT_RATE_INSTANCE = 1;

    public static String explain(@enumtype(VkVertexInputRate.class) int value) {
        return switch (value) {
            case VK_VERTEX_INPUT_RATE_VERTEX -> "VK_VERTEX_INPUT_RATE_VERTEX";
            case VK_VERTEX_INPUT_RATE_INSTANCE -> "VK_VERTEX_INPUT_RATE_INSTANCE";
            default -> "Unknown";
        };
    }
}
