package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkCompositeAlphaFlagsKHR {
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 1;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 2;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 4;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 8;

    public static String explain(@enumtype(VkCompositeAlphaFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR");
        }

        if ((flags & VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR");
        }

        if ((flags & VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR");
        }

        if ((flags & VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR");
        }

        return sb.toString();
    }
}
