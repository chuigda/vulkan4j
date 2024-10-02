package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkMemoryAllocateFlags {
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT = 1;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT = 2;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT = 4;

    public static String explain(@enumtype(VkMemoryAllocateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT");
        }

        if ((flags & VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT");
        }

        if ((flags & VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT");
        }

        return sb.toString();
    }
}
