package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSampleCountFlags {
    public static final int VK_SAMPLE_COUNT_1_BIT = 1;
    public static final int VK_SAMPLE_COUNT_2_BIT = 2;
    public static final int VK_SAMPLE_COUNT_4_BIT = 4;
    public static final int VK_SAMPLE_COUNT_8_BIT = 8;
    public static final int VK_SAMPLE_COUNT_16_BIT = 16;
    public static final int VK_SAMPLE_COUNT_32_BIT = 32;
    public static final int VK_SAMPLE_COUNT_64_BIT = 64;

    public static String explain(@enumtype(VkSampleCountFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SAMPLE_COUNT_1_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLE_COUNT_1_BIT");
        }

        if ((flags & VK_SAMPLE_COUNT_2_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLE_COUNT_2_BIT");
        }

        if ((flags & VK_SAMPLE_COUNT_4_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLE_COUNT_4_BIT");
        }

        if ((flags & VK_SAMPLE_COUNT_8_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLE_COUNT_8_BIT");
        }

        if ((flags & VK_SAMPLE_COUNT_16_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLE_COUNT_16_BIT");
        }

        if ((flags & VK_SAMPLE_COUNT_32_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLE_COUNT_32_BIT");
        }

        if ((flags & VK_SAMPLE_COUNT_64_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLE_COUNT_64_BIT");
        }

        return sb.toString();
    }
}
