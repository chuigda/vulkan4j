package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkGeometryFlagsKHR {
    public static final int VK_GEOMETRY_OPAQUE_BIT_KHR = 1;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR = 2;

    public static String explain(@enumtype(VkGeometryFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_GEOMETRY_OPAQUE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_OPAQUE_BIT_KHR");
        }

        if ((flags & VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR");
        }

        return sb.toString();
    }
}
