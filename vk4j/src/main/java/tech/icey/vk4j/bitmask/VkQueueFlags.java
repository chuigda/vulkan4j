package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkQueueFlags {
    public static final int VK_QUEUE_GRAPHICS_BIT = 1;
    public static final int VK_QUEUE_COMPUTE_BIT = 2;
    public static final int VK_QUEUE_TRANSFER_BIT = 4;
    public static final int VK_QUEUE_SPARSE_BINDING_BIT = 8;
    public static final int VK_QUEUE_PROTECTED_BIT = 16;
    public static final int VK_QUEUE_VIDEO_DECODE_BIT_KHR = 32;
    public static final int VK_QUEUE_VIDEO_ENCODE_BIT_KHR = 64;
    public static final int VK_QUEUE_OPTICAL_FLOW_BIT_NV = 256;

    public static String explain(@enumtype(VkQueueFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_QUEUE_GRAPHICS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_GRAPHICS_BIT");
        }

        if ((flags & VK_QUEUE_COMPUTE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_COMPUTE_BIT");
        }

        if ((flags & VK_QUEUE_TRANSFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_TRANSFER_BIT");
        }

        if ((flags & VK_QUEUE_SPARSE_BINDING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_SPARSE_BINDING_BIT");
        }

        if ((flags & VK_QUEUE_PROTECTED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_PROTECTED_BIT");
        }

        if ((flags & VK_QUEUE_VIDEO_DECODE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_VIDEO_DECODE_BIT_KHR");
        }

        if ((flags & VK_QUEUE_VIDEO_ENCODE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_VIDEO_ENCODE_BIT_KHR");
        }

        if ((flags & VK_QUEUE_OPTICAL_FLOW_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_QUEUE_OPTICAL_FLOW_BIT_NV");
        }

        return sb.toString();
    }
}
