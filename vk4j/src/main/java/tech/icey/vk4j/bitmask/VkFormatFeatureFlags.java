package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkFormatFeatureFlags {
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 1;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 2;
    public static final int VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 4;
    public static final int VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 8;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 16;
    public static final int VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 32;
    public static final int VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 64;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 128;
    public static final int VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 256;
    public static final int VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 512;
    public static final int VK_FORMAT_FEATURE_BLIT_SRC_BIT = 1024;
    public static final int VK_FORMAT_FEATURE_BLIT_DST_BIT = 2048;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 4096;
    public static final int VK_FORMAT_FEATURE_TRANSFER_SRC_BIT = 16384;
    public static final int VK_FORMAT_FEATURE_TRANSFER_DST_BIT = 32768;
    public static final int VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT = 131072;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT = 262144;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT = 524288;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT = 1048576;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT = 2097152;
    public static final int VK_FORMAT_FEATURE_DISJOINT_BIT = 4194304;
    public static final int VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT = 8388608;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT = 65536;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR = 33554432;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR = 67108864;
    public static final int VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR = 536870912;
    public static final int VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT = 8192;
    public static final int VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT = 16777216;
    public static final int VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 1073741824;
    public static final int VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR = 134217728;
    public static final int VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR = 268435456;

    public static String explain(@enumtype(VkFormatFeatureFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_BLIT_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_BLIT_SRC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_BLIT_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_BLIT_DST_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_TRANSFER_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_TRANSFER_SRC_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_TRANSFER_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_TRANSFER_DST_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_DISJOINT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_DISJOINT_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT");
        }

        if ((flags & VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_ACCELERATION_STRUCTURE_VERTEX_BUFFER_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT");
        }

        if ((flags & VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT");
        }

        if ((flags & VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR");
        }

        if ((flags & VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR");
        }

        return sb.toString();
    }
}
