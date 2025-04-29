package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingShaderGroupTypeKHR.html">VkRayTracingShaderGroupTypeKHR</a>
public final class VkRayTracingShaderGroupTypeKHR {
    public static final int GENERAL = 0;
    public static final int TRIANGLES_HIT_GROUP = 1;
    public static final int PROCEDURAL_HIT_GROUP = 2;

    public static String explain(@enumtype(VkRayTracingShaderGroupTypeKHR.class) int value) {
        return switch (value) {
            case VkRayTracingShaderGroupTypeKHR.GENERAL -> "VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR";
            case VkRayTracingShaderGroupTypeKHR.PROCEDURAL_HIT_GROUP -> "VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR";
            case VkRayTracingShaderGroupTypeKHR.TRIANGLES_HIT_GROUP -> "VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR";
            default -> "Unknown VkRayTracingShaderGroupTypeKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkRayTracingShaderGroupTypeKHR() {}
}
