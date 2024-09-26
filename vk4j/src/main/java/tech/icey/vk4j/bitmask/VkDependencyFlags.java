package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDependencyFlags {
    public static final int VK_DEPENDENCY_BY_REGION_BIT = 1;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT = 4;
    public static final int VK_DEPENDENCY_VIEW_LOCAL_BIT = 2;
    public static final int VK_DEPENDENCY_FEEDBACK_LOOP_BIT_EXT = 8;

    public static String explain(@enumtype(VkDependencyFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DEPENDENCY_BY_REGION_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEPENDENCY_BY_REGION_BIT");
        }

        if ((flags & VK_DEPENDENCY_DEVICE_GROUP_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEPENDENCY_DEVICE_GROUP_BIT");
        }

        if ((flags & VK_DEPENDENCY_VIEW_LOCAL_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEPENDENCY_VIEW_LOCAL_BIT");
        }

        if ((flags & VK_DEPENDENCY_FEEDBACK_LOOP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEPENDENCY_FEEDBACK_LOOP_BIT_EXT");
        }

        return sb.toString();
    }
}
