package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSciSyncClientTypeNV {
    public static final int VK_SCI_SYNC_CLIENT_TYPE_SIGNALER_NV = 0;
    public static final int VK_SCI_SYNC_CLIENT_TYPE_WAITER_NV = 1;
    public static final int VK_SCI_SYNC_CLIENT_TYPE_SIGNALER_WAITER_NV = 2;

    public static String explain(@enumtype(VkSciSyncClientTypeNV.class) int value) {
        return switch (value) {
            case VK_SCI_SYNC_CLIENT_TYPE_SIGNALER_NV -> "VK_SCI_SYNC_CLIENT_TYPE_SIGNALER_NV";
            case VK_SCI_SYNC_CLIENT_TYPE_WAITER_NV -> "VK_SCI_SYNC_CLIENT_TYPE_WAITER_NV";
            case VK_SCI_SYNC_CLIENT_TYPE_SIGNALER_WAITER_NV -> "VK_SCI_SYNC_CLIENT_TYPE_SIGNALER_WAITER_NV";
            default -> "Unknown";
        };
    }
}
