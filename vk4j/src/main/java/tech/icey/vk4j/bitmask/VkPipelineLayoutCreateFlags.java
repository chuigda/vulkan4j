package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkPipelineLayoutCreateFlags {
    public static final int VK_PIPELINE_LAYOUT_CREATE_INDEPENDENT_SETS_BIT_EXT = 2;

    public static String explain(@enumtype(VkPipelineLayoutCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PIPELINE_LAYOUT_CREATE_INDEPENDENT_SETS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_LAYOUT_CREATE_INDEPENDENT_SETS_BIT_EXT");
        }

        return sb.toString();
    }
}
