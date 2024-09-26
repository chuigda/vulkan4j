package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkImageAspectFlags {
    public static final int VK_IMAGE_ASPECT_COLOR_BIT = 1;
    public static final int VK_IMAGE_ASPECT_DEPTH_BIT = 2;
    public static final int VK_IMAGE_ASPECT_STENCIL_BIT = 4;
    public static final int VK_IMAGE_ASPECT_METADATA_BIT = 8;
    public static final int VK_IMAGE_ASPECT_PLANE_0_BIT = 16;
    public static final int VK_IMAGE_ASPECT_PLANE_1_BIT = 32;
    public static final int VK_IMAGE_ASPECT_PLANE_2_BIT = 64;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT = 128;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT = 256;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT = 512;
    public static final int VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT = 1024;

    public static String explain(@enumtype(VkImageAspectFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_IMAGE_ASPECT_COLOR_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_COLOR_BIT");
        }

        if ((flags & VK_IMAGE_ASPECT_DEPTH_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_DEPTH_BIT");
        }

        if ((flags & VK_IMAGE_ASPECT_STENCIL_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_STENCIL_BIT");
        }

        if ((flags & VK_IMAGE_ASPECT_METADATA_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_METADATA_BIT");
        }

        if ((flags & VK_IMAGE_ASPECT_PLANE_0_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_PLANE_0_BIT");
        }

        if ((flags & VK_IMAGE_ASPECT_PLANE_1_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_PLANE_1_BIT");
        }

        if ((flags & VK_IMAGE_ASPECT_PLANE_2_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_PLANE_2_BIT");
        }

        if ((flags & VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT");
        }

        if ((flags & VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT");
        }

        if ((flags & VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT");
        }

        if ((flags & VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT");
        }

        return sb.toString();
    }
}
