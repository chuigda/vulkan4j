package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkStencilFaceFlags {
    public static final int VK_STENCIL_FACE_FRONT_BIT = 1;
    public static final int VK_STENCIL_FACE_BACK_BIT = 2;
    public static final int VK_STENCIL_FACE_FRONT_AND_BACK = 3;

    public static String explain(@enumtype(VkStencilFaceFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_STENCIL_FACE_FRONT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_STENCIL_FACE_FRONT_BIT");
        }

        if ((flags & VK_STENCIL_FACE_BACK_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_STENCIL_FACE_BACK_BIT");
        }

        if ((flags & VK_STENCIL_FACE_FRONT_AND_BACK) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_STENCIL_FACE_FRONT_AND_BACK");
        }

        return sb.toString();
    }
}
