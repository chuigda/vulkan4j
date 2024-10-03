package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkMemoryUnmapFlagsKHR {
    public static final int VK_MEMORY_UNMAP_RESERVE_BIT_EXT = 1;

    public static String explain(@enumtype(VkMemoryUnmapFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_MEMORY_UNMAP_RESERVE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_UNMAP_RESERVE_BIT_EXT");
        }

        return sb.toString();
    }
}
