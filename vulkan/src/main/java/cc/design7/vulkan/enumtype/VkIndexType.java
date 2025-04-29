package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndexType.html">VkIndexType</a>
public final class VkIndexType {
    public static final int UINT16 = 0;
    public static final int UINT32 = 1;
    public static final int UINT8 = 1000265000;
    public static final int NONE_KHR = 1000165000;

    public static String explain(@enumtype(VkIndexType.class) int value) {
        return switch (value) {
            case VkIndexType.NONE_KHR -> "VK_INDEX_TYPE_NONE_KHR";
            case VkIndexType.UINT16 -> "VK_INDEX_TYPE_UINT16";
            case VkIndexType.UINT32 -> "VK_INDEX_TYPE_UINT32";
            case VkIndexType.UINT8 -> "VK_INDEX_TYPE_UINT8";
            default -> "Unknown VkIndexType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkIndexType() {}
}
