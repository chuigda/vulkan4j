package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkProvokingVertexModeEXT.html">VkProvokingVertexModeEXT</a>
public final class VkProvokingVertexModeEXT {
    public static final int FIRST_VERTEX = 0x0;
    public static final int LAST_VERTEX = 0x1;

    public static String explain(@enumtype(VkProvokingVertexModeEXT.class) int value) {
        return switch (value) {
            case VkProvokingVertexModeEXT.FIRST_VERTEX -> "VK_PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT";
            case VkProvokingVertexModeEXT.LAST_VERTEX -> "VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT";
            default -> "Unknown VkProvokingVertexModeEXT: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkProvokingVertexModeEXT() {}
}
