package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSurfaceTransformFlagsKHR {
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 1;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 2;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 4;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 8;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 16;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 32;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 64;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 128;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 256;

    public static String explain(@enumtype(VkSurfaceTransformFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR");
        }

        if ((flags & VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR");
        }

        return sb.toString();
    }
}
