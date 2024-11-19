package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkMemoryPropertyFlags {
    public static final int VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 1;
    public static final int VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 2;
    public static final int VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 4;
    public static final int VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 8;
    public static final int VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 16;
    public static final int VK_MEMORY_PROPERTY_PROTECTED_BIT = 32;
    public static final int VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD = 64;
    public static final int VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD = 128;
    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 256;

    public static String explain(@enumtype(VkMemoryPropertyFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT");
        }

        if ((flags & VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT");
        }

        if ((flags & VK_MEMORY_PROPERTY_HOST_COHERENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_HOST_COHERENT_BIT");
        }

        if ((flags & VK_MEMORY_PROPERTY_HOST_CACHED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_HOST_CACHED_BIT");
        }

        if ((flags & VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT");
        }

        if ((flags & VK_MEMORY_PROPERTY_PROTECTED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_PROTECTED_BIT");
        }

        if ((flags & VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_DEVICE_COHERENT_BIT_AMD");
        }

        if ((flags & VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_DEVICE_UNCACHED_BIT_AMD");
        }

        if ((flags & VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV");
        }

        return sb.toString();
    }
}
