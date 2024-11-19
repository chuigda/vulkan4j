package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoEncodeH265CtbSizeFlagsKHR {
    public static final int VK_VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_KHR = 4;

    public static String explain(@enumtype(VkVideoEncodeH265CtbSizeFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_KHR");
        }

        return sb.toString();
    }
}
