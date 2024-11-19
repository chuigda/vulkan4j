package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkShaderFloatControlsIndependence {
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY = 0;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL = 1;
    public static final int VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE = 2;

    public static String explain(@enumtype(VkShaderFloatControlsIndependence.class) int value) {
        return switch (value) {
            case VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY -> "VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_32_BIT_ONLY";
            case VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL -> "VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_ALL";
            case VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE -> "VK_SHADER_FLOAT_CONTROLS_INDEPENDENCE_NONE";
            default -> "Unknown";
        };
    }
}
