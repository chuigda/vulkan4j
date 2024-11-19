package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoDecodeCapabilityFlagsKHR {
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR = 1;
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR = 2;

    public static String explain(@enumtype(VkVideoDecodeCapabilityFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR");
        }

        if ((flags & VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR");
        }

        return sb.toString();
    }
}
