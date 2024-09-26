package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkProvokingVertexModeEXT {
    public static final int VK_PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT = 0;
    public static final int VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT = 1;

    public static String explain(@enumtype(VkProvokingVertexModeEXT.class) int value) {
        return switch (value) {
            case VK_PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT -> "VK_PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT";
            case VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT -> "VK_PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT";
            default -> "Unknown";
        };
    }
}
