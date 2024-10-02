package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSparseMemoryBindFlags {
    public static final int VK_SPARSE_MEMORY_BIND_METADATA_BIT = 1;

    public static String explain(@enumtype(VkSparseMemoryBindFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SPARSE_MEMORY_BIND_METADATA_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SPARSE_MEMORY_BIND_METADATA_BIT");
        }

        return sb.toString();
    }
}
