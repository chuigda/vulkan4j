package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkMemoryMapFlags {
    public static final int VK_MEMORY_MAP_PLACED_BIT_EXT = 1;

    public static String explain(@enumtype(VkMemoryMapFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_MEMORY_MAP_PLACED_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_MAP_PLACED_BIT_EXT");
        }

        return sb.toString();
    }
}
