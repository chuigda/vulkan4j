package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyMicromapModeEXT.html">VkCopyMicromapModeEXT</a>
public final class VkCopyMicromapModeEXT {
    public static final int CLONE = 0x0;
    public static final int SERIALIZE = 0x1;
    public static final int DESERIALIZE = 0x2;
    public static final int COMPACT = 0x3;

    public static String explain(@enumtype(VkCopyMicromapModeEXT.class) int value) {
        return switch (value) {
            case VkCopyMicromapModeEXT.CLONE -> "VK_COPY_MICROMAP_MODE_CLONE_EXT";
            case VkCopyMicromapModeEXT.COMPACT -> "VK_COPY_MICROMAP_MODE_COMPACT_EXT";
            case VkCopyMicromapModeEXT.DESERIALIZE -> "VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT";
            case VkCopyMicromapModeEXT.SERIALIZE -> "VK_COPY_MICROMAP_MODE_SERIALIZE_EXT";
            default -> "Unknown VkCopyMicromapModeEXT: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkCopyMicromapModeEXT() {}
}
