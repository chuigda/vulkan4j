package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkImageUsageFlags {
    public static final int VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 1;
    public static final int VK_IMAGE_USAGE_TRANSFER_DST_BIT = 2;
    public static final int VK_IMAGE_USAGE_SAMPLED_BIT = 4;
    public static final int VK_IMAGE_USAGE_STORAGE_BIT = 8;
    public static final int VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 16;
    public static final int VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 32;
    public static final int VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 64;
    public static final int VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 128;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR = 1024;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 2048;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR = 4096;
    public static final int VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT = 512;
    public static final int VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 256;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = 4194304;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 8192;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 16384;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR = 32768;
    public static final int VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 524288;
    public static final int VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI = 262144;
    public static final int VK_IMAGE_USAGE_SAMPLE_WEIGHT_BIT_QCOM = 1048576;
    public static final int VK_IMAGE_USAGE_SAMPLE_BLOCK_MATCH_BIT_QCOM = 2097152;

    public static String explain(@enumtype(VkImageUsageFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_IMAGE_USAGE_TRANSFER_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_TRANSFER_SRC_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_TRANSFER_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_TRANSFER_DST_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_SAMPLED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_SAMPLED_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_STORAGE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_STORAGE_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT");
        }

        if ((flags & VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR");
        }

        if ((flags & VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR");
        }

        if ((flags & VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR");
        }

        if ((flags & VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT");
        }

        if ((flags & VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }

        if ((flags & VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT");
        }

        if ((flags & VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR");
        }

        if ((flags & VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR");
        }

        if ((flags & VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR");
        }

        if ((flags & VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT");
        }

        if ((flags & VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_INVOCATION_MASK_BIT_HUAWEI");
        }

        if ((flags & VK_IMAGE_USAGE_SAMPLE_WEIGHT_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_SAMPLE_WEIGHT_BIT_QCOM");
        }

        if ((flags & VK_IMAGE_USAGE_SAMPLE_BLOCK_MATCH_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_USAGE_SAMPLE_BLOCK_MATCH_BIT_QCOM");
        }

        return sb.toString();
    }
}
