package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkMemoryHeapFlags {
    public static final int VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 1;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT = 2;

    public static String explain(@enumtype(VkMemoryHeapFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_MEMORY_HEAP_DEVICE_LOCAL_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_HEAP_DEVICE_LOCAL_BIT");
        }

        if ((flags & VK_MEMORY_HEAP_MULTI_INSTANCE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_HEAP_MULTI_INSTANCE_BIT");
        }

        return sb.toString();
    }
}
