package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSurfaceCounterFlagsEXT {
    public static final int VK_SURFACE_COUNTER_VBLANK_BIT_EXT = 1;

    public static String explain(@enumtype(VkSurfaceCounterFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SURFACE_COUNTER_VBLANK_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_COUNTER_VBLANK_BIT_EXT");
        }

        return sb.toString();
    }
}
