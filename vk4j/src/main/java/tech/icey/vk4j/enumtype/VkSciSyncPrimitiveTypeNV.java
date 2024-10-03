package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkSciSyncPrimitiveTypeNV {
    public static final int VK_SCI_SYNC_PRIMITIVE_TYPE_FENCE_NV = 0;
    public static final int VK_SCI_SYNC_PRIMITIVE_TYPE_SEMAPHORE_NV = 1;

    public static String explain(@enumtype(VkSciSyncPrimitiveTypeNV.class) int value) {
        return switch (value) {
            case VK_SCI_SYNC_PRIMITIVE_TYPE_FENCE_NV -> "VK_SCI_SYNC_PRIMITIVE_TYPE_FENCE_NV";
            case VK_SCI_SYNC_PRIMITIVE_TYPE_SEMAPHORE_NV -> "VK_SCI_SYNC_PRIMITIVE_TYPE_SEMAPHORE_NV";
            default -> "Unknown";
        };
    }
}
