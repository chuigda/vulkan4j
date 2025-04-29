package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderGroupShaderKHR.html">VkShaderGroupShaderKHR</a>
public final class VkShaderGroupShaderKHR {
    public static final int GENERAL = 0;
    public static final int CLOSEST_HIT = 1;
    public static final int ANY_HIT = 2;
    public static final int INTERSECTION = 3;

    public static String explain(@enumtype(VkShaderGroupShaderKHR.class) int value) {
        return switch (value) {
            case VkShaderGroupShaderKHR.ANY_HIT -> "VK_SHADER_GROUP_SHADER_ANY_HIT_KHR";
            case VkShaderGroupShaderKHR.CLOSEST_HIT -> "VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR";
            case VkShaderGroupShaderKHR.GENERAL -> "VK_SHADER_GROUP_SHADER_GENERAL_KHR";
            case VkShaderGroupShaderKHR.INTERSECTION -> "VK_SHADER_GROUP_SHADER_INTERSECTION_KHR";
            default -> "Unknown VkShaderGroupShaderKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkShaderGroupShaderKHR() {}
}
