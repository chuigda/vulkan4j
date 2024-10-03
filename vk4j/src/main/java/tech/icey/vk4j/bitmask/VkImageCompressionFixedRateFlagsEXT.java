package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkImageCompressionFixedRateFlagsEXT {
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT = 0;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT = 1;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT = 2;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT = 4;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT = 8;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT = 16;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT = 32;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT = 64;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT = 128;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT = 256;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT = 512;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT = 1024;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT = 2048;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT = 4096;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT = 8192;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT = 16384;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT = 32768;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT = 65536;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT = 131072;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT = 262144;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT = 524288;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT = 1048576;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT = 2097152;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT = 4194304;
    public static final int VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT = 8388608;

    public static String explain(@enumtype(VkImageCompressionFixedRateFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT");
        }

        if ((flags & VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT");
        }

        return sb.toString();
    }
}
