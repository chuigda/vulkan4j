package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkShaderGroupShaderKHR {
    public static final int VK_SHADER_GROUP_SHADER_GENERAL_KHR = 0;
    public static final int VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR = 1;
    public static final int VK_SHADER_GROUP_SHADER_ANY_HIT_KHR = 2;
    public static final int VK_SHADER_GROUP_SHADER_INTERSECTION_KHR = 3;

    public static String explain(@enumtype(VkShaderGroupShaderKHR.class) int value) {
        return switch (value) {
            case VK_SHADER_GROUP_SHADER_GENERAL_KHR -> "VK_SHADER_GROUP_SHADER_GENERAL_KHR";
            case VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR -> "VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR";
            case VK_SHADER_GROUP_SHADER_ANY_HIT_KHR -> "VK_SHADER_GROUP_SHADER_ANY_HIT_KHR";
            case VK_SHADER_GROUP_SHADER_INTERSECTION_KHR -> "VK_SHADER_GROUP_SHADER_INTERSECTION_KHR";
            default -> "Unknown";
        };
    }
}
