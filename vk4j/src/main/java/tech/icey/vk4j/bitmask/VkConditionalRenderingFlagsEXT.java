package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkConditionalRenderingFlagsEXT {
    public static final int VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT = 1;

    public static String explain(@enumtype(VkConditionalRenderingFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT");
        }

        return sb.toString();
    }
}
