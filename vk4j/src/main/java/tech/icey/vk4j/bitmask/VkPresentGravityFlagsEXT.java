package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkPresentGravityFlagsEXT {
    public static final int VK_PRESENT_GRAVITY_MIN_BIT_EXT = 1;
    public static final int VK_PRESENT_GRAVITY_MAX_BIT_EXT = 2;
    public static final int VK_PRESENT_GRAVITY_CENTERED_BIT_EXT = 4;

    public static String explain(@enumtype(VkPresentGravityFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PRESENT_GRAVITY_MIN_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PRESENT_GRAVITY_MIN_BIT_EXT");
        }

        if ((flags & VK_PRESENT_GRAVITY_MAX_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PRESENT_GRAVITY_MAX_BIT_EXT");
        }

        if ((flags & VK_PRESENT_GRAVITY_CENTERED_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PRESENT_GRAVITY_CENTERED_BIT_EXT");
        }

        return sb.toString();
    }
}
