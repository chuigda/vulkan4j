package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkCullModeFlags {
    public static final int VK_CULL_MODE_NONE = 0;
    public static final int VK_CULL_MODE_FRONT_BIT = 1;
    public static final int VK_CULL_MODE_BACK_BIT = 2;
    public static final int VK_CULL_MODE_FRONT_AND_BACK = 3;

    public static String explain(@enumtype(VkCullModeFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_CULL_MODE_NONE) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_CULL_MODE_NONE");
        }

        if ((flags & VK_CULL_MODE_FRONT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_CULL_MODE_FRONT_BIT");
        }

        if ((flags & VK_CULL_MODE_BACK_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_CULL_MODE_BACK_BIT");
        }

        if ((flags & VK_CULL_MODE_FRONT_AND_BACK) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_CULL_MODE_FRONT_AND_BACK");
        }

        return sb.toString();
    }
}
