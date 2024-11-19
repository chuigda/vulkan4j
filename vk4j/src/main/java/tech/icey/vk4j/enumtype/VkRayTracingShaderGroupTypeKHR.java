package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkRayTracingShaderGroupTypeKHR {
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR = 0;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR = 1;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR = 2;

    public static String explain(@enumtype(VkRayTracingShaderGroupTypeKHR.class) int value) {
        return switch (value) {
            case VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR -> "VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR";
            case VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR -> "VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR";
            case VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR -> "VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR";
            default -> "Unknown";
        };
    }
}
