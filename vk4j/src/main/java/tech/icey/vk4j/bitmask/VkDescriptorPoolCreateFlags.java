package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkDescriptorPoolCreateFlags {
    public static final int VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 1;
    public static final int VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT = 2;
    public static final int VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_EXT = 4;
    public static final int VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV = 8;
    public static final int VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV = 16;

    public static String explain(@enumtype(VkDescriptorPoolCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT");
        }

        if ((flags & VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT");
        }

        if ((flags & VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_POOL_CREATE_HOST_ONLY_BIT_EXT");
        }

        if ((flags & VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_SETS_BIT_NV");
        }

        if ((flags & VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_POOL_CREATE_ALLOW_OVERALLOCATION_POOLS_BIT_NV");
        }

        return sb.toString();
    }
}
