package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkExternalSemaphoreHandleTypeFlags {
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT = 8;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT = 16;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_ZIRCON_EVENT_BIT_FUCHSIA = 128;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SCI_SYNC_OBJ_BIT_NV = 32;

    public static String explain(@enumtype(VkExternalSemaphoreHandleTypeFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT");
        }

        if ((flags & VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT");
        }

        if ((flags & VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT");
        }

        if ((flags & VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT");
        }

        if ((flags & VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT");
        }

        if ((flags & VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_ZIRCON_EVENT_BIT_FUCHSIA) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_ZIRCON_EVENT_BIT_FUCHSIA");
        }

        if ((flags & VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SCI_SYNC_OBJ_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SCI_SYNC_OBJ_BIT_NV");
        }

        return sb.toString();
    }
}
