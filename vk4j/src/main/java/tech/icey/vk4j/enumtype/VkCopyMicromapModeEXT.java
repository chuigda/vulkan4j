package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkCopyMicromapModeEXT {
    public static final int VK_COPY_MICROMAP_MODE_CLONE_EXT = 0;
    public static final int VK_COPY_MICROMAP_MODE_SERIALIZE_EXT = 1;
    public static final int VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT = 2;
    public static final int VK_COPY_MICROMAP_MODE_COMPACT_EXT = 3;

    public static String explain(@enumtype(VkCopyMicromapModeEXT.class) int value) {
        return switch (value) {
            case VK_COPY_MICROMAP_MODE_CLONE_EXT -> "VK_COPY_MICROMAP_MODE_CLONE_EXT";
            case VK_COPY_MICROMAP_MODE_SERIALIZE_EXT -> "VK_COPY_MICROMAP_MODE_SERIALIZE_EXT";
            case VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT -> "VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT";
            case VK_COPY_MICROMAP_MODE_COMPACT_EXT -> "VK_COPY_MICROMAP_MODE_COMPACT_EXT";
            default -> "Unknown";
        };
    }
}
