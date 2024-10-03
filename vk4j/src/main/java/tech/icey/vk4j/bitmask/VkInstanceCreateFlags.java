package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkInstanceCreateFlags {
    public static final int VK_INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR = 1;

    public static String explain(@enumtype(VkInstanceCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR");
        }

        return sb.toString();
    }
}
