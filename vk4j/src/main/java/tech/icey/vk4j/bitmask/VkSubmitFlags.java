package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSubmitFlags {
    public static final int VK_SUBMIT_PROTECTED_BIT = 1;

    public static String explain(@enumtype(VkSubmitFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SUBMIT_PROTECTED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBMIT_PROTECTED_BIT");
        }

        return sb.toString();
    }
}
