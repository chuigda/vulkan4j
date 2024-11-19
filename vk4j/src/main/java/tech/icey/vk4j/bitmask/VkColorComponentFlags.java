package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkColorComponentFlags {
    public static final int VK_COLOR_COMPONENT_R_BIT = 1;
    public static final int VK_COLOR_COMPONENT_G_BIT = 2;
    public static final int VK_COLOR_COMPONENT_B_BIT = 4;
    public static final int VK_COLOR_COMPONENT_A_BIT = 8;

    public static String explain(@enumtype(VkColorComponentFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_COLOR_COMPONENT_R_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COLOR_COMPONENT_R_BIT");
        }

        if ((flags & VK_COLOR_COMPONENT_G_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COLOR_COMPONENT_G_BIT");
        }

        if ((flags & VK_COLOR_COMPONENT_B_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COLOR_COMPONENT_B_BIT");
        }

        if ((flags & VK_COLOR_COMPONENT_A_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COLOR_COMPONENT_A_BIT");
        }

        return sb.toString();
    }
}
