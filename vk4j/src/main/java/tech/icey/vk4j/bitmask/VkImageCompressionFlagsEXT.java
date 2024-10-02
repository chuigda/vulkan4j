package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkImageCompressionFlagsEXT {
    public static final int VK_IMAGE_COMPRESSION_DEFAULT_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 1;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT = 2;
    public static final int VK_IMAGE_COMPRESSION_DISABLED_EXT = 4;

    public static String explain(@enumtype(VkImageCompressionFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_IMAGE_COMPRESSION_DEFAULT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_DEFAULT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_DEFAULT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_DISABLED_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_DISABLED_EXT");
        }

        return sb.toString();
    }
}
