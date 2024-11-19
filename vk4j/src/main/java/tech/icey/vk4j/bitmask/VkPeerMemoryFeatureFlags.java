package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkPeerMemoryFeatureFlags {
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT = 1;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT = 2;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT = 4;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT = 8;

    public static String explain(@enumtype(VkPeerMemoryFeatureFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT");
        }

        if ((flags & VK_PEER_MEMORY_FEATURE_COPY_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PEER_MEMORY_FEATURE_COPY_DST_BIT");
        }

        if ((flags & VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT");
        }

        if ((flags & VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT");
        }

        return sb.toString();
    }
}
