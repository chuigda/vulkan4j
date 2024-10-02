package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkPresentScalingFlagsEXT {
    public static final int VK_PRESENT_SCALING_ONE_TO_ONE_BIT_EXT = 1;
    public static final int VK_PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT = 2;
    public static final int VK_PRESENT_SCALING_STRETCH_BIT_EXT = 4;

    public static String explain(@enumtype(VkPresentScalingFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PRESENT_SCALING_ONE_TO_ONE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PRESENT_SCALING_ONE_TO_ONE_BIT_EXT");
        }

        if ((flags & VK_PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT");
        }

        if ((flags & VK_PRESENT_SCALING_STRETCH_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PRESENT_SCALING_STRETCH_BIT_EXT");
        }

        return sb.toString();
    }
}
