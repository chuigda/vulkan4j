package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSharingMode.html">VkSharingMode</a>
public final class VkSharingMode {
    public static final int EXCLUSIVE = 0x0;
    public static final int CONCURRENT = 0x1;

    public static String explain(@enumtype(VkSharingMode.class) int value) {
        return switch (value) {
            case VkSharingMode.CONCURRENT -> "VK_SHARING_MODE_CONCURRENT";
            case VkSharingMode.EXCLUSIVE -> "VK_SHARING_MODE_EXCLUSIVE";
            default -> "Unknown VkSharingMode: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkSharingMode() {}
}
