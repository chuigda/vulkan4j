package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkBufferCreateFlags {
    public static final int VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 1;
    public static final int VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 2;
    public static final int VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 4;
    public static final int VK_BUFFER_CREATE_PROTECTED_BIT = 8;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 16;
    public static final int VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 32;
    public static final int VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR = 64;

    public static String explain(@enumtype(VkBufferCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_BUFFER_CREATE_SPARSE_BINDING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_CREATE_SPARSE_BINDING_BIT");
        }

        if ((flags & VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT");
        }

        if ((flags & VK_BUFFER_CREATE_SPARSE_ALIASED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_CREATE_SPARSE_ALIASED_BIT");
        }

        if ((flags & VK_BUFFER_CREATE_PROTECTED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_CREATE_PROTECTED_BIT");
        }

        if ((flags & VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT");
        }

        if ((flags & VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }

        if ((flags & VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR");
        }

        return sb.toString();
    }
}
