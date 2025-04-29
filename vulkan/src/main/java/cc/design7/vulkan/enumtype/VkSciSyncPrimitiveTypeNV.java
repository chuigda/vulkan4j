package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSciSyncPrimitiveTypeNV.html">VkSciSyncPrimitiveTypeNV</a>
public final class VkSciSyncPrimitiveTypeNV {
    public static final int FENCE = 0;
    public static final int SEMAPHORE = 1;

    public static String explain(@enumtype(VkSciSyncPrimitiveTypeNV.class) int value) {
        return switch (value) {
            case VkSciSyncPrimitiveTypeNV.FENCE -> "VK_SCI_SYNC_PRIMITIVE_TYPE_FENCE_NV";
            case VkSciSyncPrimitiveTypeNV.SEMAPHORE -> "VK_SCI_SYNC_PRIMITIVE_TYPE_SEMAPHORE_NV";
            default -> "Unknown VkSciSyncPrimitiveTypeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSciSyncPrimitiveTypeNV() {}
}
