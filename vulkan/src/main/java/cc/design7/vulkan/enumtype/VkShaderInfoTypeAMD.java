package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderInfoTypeAMD.html">VkShaderInfoTypeAMD</a>
public final class VkShaderInfoTypeAMD {
    public static final int STATISTICS = 0;
    public static final int BINARY = 1;
    public static final int DISASSEMBLY = 2;

    public static String explain(@enumtype(VkShaderInfoTypeAMD.class) int value) {
        return switch (value) {
            case VkShaderInfoTypeAMD.BINARY -> "VK_SHADER_INFO_TYPE_BINARY_AMD";
            case VkShaderInfoTypeAMD.DISASSEMBLY -> "VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD";
            case VkShaderInfoTypeAMD.STATISTICS -> "VK_SHADER_INFO_TYPE_STATISTICS_AMD";
            default -> "Unknown VkShaderInfoTypeAMD: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkShaderInfoTypeAMD() {}
}
