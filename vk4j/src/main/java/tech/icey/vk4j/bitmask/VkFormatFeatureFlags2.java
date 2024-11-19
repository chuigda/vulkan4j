package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkFormatFeatureFlags2 {
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT = 1L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT = 2L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT = 4L;
    public static final long VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT = 8L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT = 16L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32L;
    public static final long VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT = 64L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT = 128L;
    public static final long VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT = 256L;
    public static final long VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT = 512L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_SRC_BIT = 1024L;
    public static final long VK_FORMAT_FEATURE_2_BLIT_DST_BIT = 2048L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT = 8192L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT = 16384L;
    public static final long VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT = 32768L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 65536L;
    public static final long VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT = 131072L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152L;
    public static final long VK_FORMAT_FEATURE_2_DISJOINT_BIT = 4194304L;
    public static final long VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT = 8388608L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT = 2147483648L;
    public static final long VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT = 4294967296L;
    public static final long VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT = 8589934592L;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR = 33554432L;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR = 67108864L;
    public static final long VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 536870912L;
    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT = 16777216L;
    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 1073741824L;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = 70368744177664L;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR = 134217728L;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR = 268435456L;
    public static final long VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV = 274877906944L;
    public static final long VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM = 17179869184L;
    public static final long VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM = 34359738368L;
    public static final long VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM = 68719476736L;
    public static final long VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM = 137438953472L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV = 1099511627776L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV = 2199023255552L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV = 4398046511104L;

    public static String explain(@enumtype(VkFormatFeatureFlags2.class) long flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_STORAGE_IMAGE_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_STORAGE_IMAGE_ATOMIC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_UNIFORM_TEXEL_BUFFER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_STORAGE_TEXEL_BUFFER_ATOMIC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_VERTEX_BUFFER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_COLOR_ATTACHMENT_BLEND_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_DEPTH_STENCIL_ATTACHMENT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_BLIT_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_BLIT_SRC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_BLIT_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_BLIT_DST_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_LINEAR_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_CUBIC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_TRANSFER_SRC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_TRANSFER_DST_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_FILTER_MINMAX_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_MIDPOINT_CHROMA_SAMPLES_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_DISJOINT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_DISJOINT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_COSITED_CHROMA_SAMPLES_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_STORAGE_READ_WITHOUT_FORMAT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_STORAGE_WRITE_WITHOUT_FORMAT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_SAMPLED_IMAGE_DEPTH_COMPARISON_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT");
        }

        if ((flags & VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV");
        }

        if ((flags & VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_WEIGHT_IMAGE_BIT_QCOM");
        }

        if ((flags & VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_WEIGHT_SAMPLED_IMAGE_BIT_QCOM");
        }

        if ((flags & VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_BLOCK_MATCHING_BIT_QCOM");
        }

        if ((flags & VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_BOX_FILTER_SAMPLED_BIT_QCOM");
        }

        if ((flags & VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV");
        }

        if ((flags & VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV");
        }

        if ((flags & VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV");
        }

        return sb.toString();
    }
}
