package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoEncodeH265StdFlagsKHR {
    public static final int VK_VIDEO_ENCODE_H265_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_H265_STD_SAMPLE_ADAPTIVE_OFFSET_ENABLED_FLAG_SET_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_H265_STD_SCALING_LIST_DATA_PRESENT_FLAG_SET_BIT_KHR = 4;
    public static final int VK_VIDEO_ENCODE_H265_STD_PCM_ENABLED_FLAG_SET_BIT_KHR = 8;
    public static final int VK_VIDEO_ENCODE_H265_STD_SPS_TEMPORAL_MVP_ENABLED_FLAG_SET_BIT_KHR = 16;
    public static final int VK_VIDEO_ENCODE_H265_STD_INIT_QP_MINUS26_BIT_KHR = 32;
    public static final int VK_VIDEO_ENCODE_H265_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR = 64;
    public static final int VK_VIDEO_ENCODE_H265_STD_WEIGHTED_BIPRED_FLAG_SET_BIT_KHR = 128;
    public static final int VK_VIDEO_ENCODE_H265_STD_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_KHR = 256;
    public static final int VK_VIDEO_ENCODE_H265_STD_SIGN_DATA_HIDING_ENABLED_FLAG_SET_BIT_KHR = 512;
    public static final int VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_SET_BIT_KHR = 1024;
    public static final int VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_UNSET_BIT_KHR = 2048;
    public static final int VK_VIDEO_ENCODE_H265_STD_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_FLAG_SET_BIT_KHR = 4096;
    public static final int VK_VIDEO_ENCODE_H265_STD_TRANSQUANT_BYPASS_ENABLED_FLAG_SET_BIT_KHR = 8192;
    public static final int VK_VIDEO_ENCODE_H265_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR = 16384;
    public static final int VK_VIDEO_ENCODE_H265_STD_ENTROPY_CODING_SYNC_ENABLED_FLAG_SET_BIT_KHR = 32768;
    public static final int VK_VIDEO_ENCODE_H265_STD_DEBLOCKING_FILTER_OVERRIDE_ENABLED_FLAG_SET_BIT_KHR = 65536;
    public static final int VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENTS_ENABLED_FLAG_SET_BIT_KHR = 131072;
    public static final int VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENT_FLAG_SET_BIT_KHR = 262144;
    public static final int VK_VIDEO_ENCODE_H265_STD_SLICE_QP_DELTA_BIT_KHR = 524288;
    public static final int VK_VIDEO_ENCODE_H265_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR = 1048576;

    public static String explain(@enumtype(VkVideoEncodeH265StdFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_ENCODE_H265_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_SEPARATE_COLOR_PLANE_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_SAMPLE_ADAPTIVE_OFFSET_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_SAMPLE_ADAPTIVE_OFFSET_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_SCALING_LIST_DATA_PRESENT_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_SCALING_LIST_DATA_PRESENT_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_PCM_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_PCM_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_SPS_TEMPORAL_MVP_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_SPS_TEMPORAL_MVP_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_INIT_QP_MINUS26_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_INIT_QP_MINUS26_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_WEIGHTED_PRED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_WEIGHTED_BIPRED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_WEIGHTED_BIPRED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_SIGN_DATA_HIDING_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_SIGN_DATA_HIDING_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_UNSET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_TRANSFORM_SKIP_ENABLED_FLAG_UNSET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_PPS_SLICE_CHROMA_QP_OFFSETS_PRESENT_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_TRANSQUANT_BYPASS_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_TRANSQUANT_BYPASS_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_CONSTRAINED_INTRA_PRED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_ENTROPY_CODING_SYNC_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_ENTROPY_CODING_SYNC_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_DEBLOCKING_FILTER_OVERRIDE_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_DEBLOCKING_FILTER_OVERRIDE_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENTS_ENABLED_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENTS_ENABLED_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENT_FLAG_SET_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_DEPENDENT_SLICE_SEGMENT_FLAG_SET_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_SLICE_QP_DELTA_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_SLICE_QP_DELTA_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_H265_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_H265_STD_DIFFERENT_SLICE_QP_DELTA_BIT_KHR");
        }

        return sb.toString();
    }
}
