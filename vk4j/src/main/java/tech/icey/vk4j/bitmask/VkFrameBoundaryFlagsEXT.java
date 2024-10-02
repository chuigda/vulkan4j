package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkFrameBoundaryFlagsEXT {
    public static final int VK_FRAME_BOUNDARY_FRAME_END_BIT_EXT = 1;

    public static String explain(@enumtype(VkFrameBoundaryFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_FRAME_BOUNDARY_FRAME_END_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FRAME_BOUNDARY_FRAME_END_BIT_EXT");
        }

        return sb.toString();
    }
}
