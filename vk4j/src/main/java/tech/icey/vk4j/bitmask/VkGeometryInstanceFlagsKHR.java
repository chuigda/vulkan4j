package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkGeometryInstanceFlagsKHR {
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR = 1;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR = 2;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR = 4;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR = 8;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT = 16;
    public static final int VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT = 32;

    public static String explain(@enumtype(VkGeometryInstanceFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR");
        }

        if ((flags & VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_INSTANCE_TRIANGLE_FLIP_FACING_BIT_KHR");
        }

        if ((flags & VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR");
        }

        if ((flags & VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR");
        }

        if ((flags & VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_INSTANCE_FORCE_OPACITY_MICROMAP_2_STATE_EXT");
        }

        if ((flags & VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_GEOMETRY_INSTANCE_DISABLE_OPACITY_MICROMAPS_EXT");
        }

        return sb.toString();
    }
}
