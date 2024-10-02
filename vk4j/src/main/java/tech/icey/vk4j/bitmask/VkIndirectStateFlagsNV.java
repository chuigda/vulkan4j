package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkIndirectStateFlagsNV {
    public static final int VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV = 1;

    public static String explain(@enumtype(VkIndirectStateFlagsNV.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV");
        }

        return sb.toString();
    }
}
