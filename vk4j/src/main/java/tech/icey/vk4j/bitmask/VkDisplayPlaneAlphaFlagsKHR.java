package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDisplayPlaneAlphaFlagsKHR {
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 1;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 2;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 4;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 8;

    public static String explain(@enumtype(VkDisplayPlaneAlphaFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR");
        }

        if ((flags & VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR");
        }

        if ((flags & VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR");
        }

        if ((flags & VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR");
        }

        return sb.toString();
    }
}
