package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkExternalFenceHandleTypeFlags {
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT = 1;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT = 2;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT = 4;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT = 8;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SCI_SYNC_OBJ_BIT_NV = 16;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SCI_SYNC_FENCE_BIT_NV = 32;

    public static String explain(@enumtype(VkExternalFenceHandleTypeFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT");
        }

        if ((flags & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT");
        }

        if ((flags & VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT");
        }

        if ((flags & VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT");
        }

        if ((flags & VK_EXTERNAL_FENCE_HANDLE_TYPE_SCI_SYNC_OBJ_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_HANDLE_TYPE_SCI_SYNC_OBJ_BIT_NV");
        }

        if ((flags & VK_EXTERNAL_FENCE_HANDLE_TYPE_SCI_SYNC_FENCE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_HANDLE_TYPE_SCI_SYNC_FENCE_BIT_NV");
        }

        return sb.toString();
    }
}
