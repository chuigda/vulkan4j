package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkHostImageCopyFlagsEXT {
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 1;

    public static String explain(@enumtype(VkHostImageCopyFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_HOST_IMAGE_COPY_MEMCPY_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_HOST_IMAGE_COPY_MEMCPY_EXT");
        }

        return sb.toString();
    }
}
