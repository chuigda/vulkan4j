package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkShaderCodeTypeEXT {
    public static final int VK_SHADER_CODE_TYPE_BINARY_EXT = 0;
    public static final int VK_SHADER_CODE_TYPE_SPIRV_EXT = 1;

    public static String explain(@enumtype(VkShaderCodeTypeEXT.class) int value) {
        return switch (value) {
            case VK_SHADER_CODE_TYPE_BINARY_EXT -> "VK_SHADER_CODE_TYPE_BINARY_EXT";
            case VK_SHADER_CODE_TYPE_SPIRV_EXT -> "VK_SHADER_CODE_TYPE_SPIRV_EXT";
            default -> "Unknown";
        };
    }
}
