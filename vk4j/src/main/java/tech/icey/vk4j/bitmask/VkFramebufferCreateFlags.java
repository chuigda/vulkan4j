package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkFramebufferCreateFlags {
    public static final int VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT = 1;

    public static String explain(@enumtype(VkFramebufferCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT");
        }

        return sb.toString();
    }
}
