package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkShaderInfoTypeAMD {
    public static final int VK_SHADER_INFO_TYPE_STATISTICS_AMD = 0;
    public static final int VK_SHADER_INFO_TYPE_BINARY_AMD = 1;
    public static final int VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD = 2;

    public static String explain(@enumtype(VkShaderInfoTypeAMD.class) int value) {
        return switch (value) {
            case VK_SHADER_INFO_TYPE_STATISTICS_AMD -> "VK_SHADER_INFO_TYPE_STATISTICS_AMD";
            case VK_SHADER_INFO_TYPE_BINARY_AMD -> "VK_SHADER_INFO_TYPE_BINARY_AMD";
            case VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD -> "VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD";
            default -> "Unknown";
        };
    }
}
