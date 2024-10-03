package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkImageCreateFlags {
    public static final int VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 1;
    public static final int VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 2;
    public static final int VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 4;
    public static final int VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 8;
    public static final int VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 16;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT = 1024;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT = 64;
    public static final int VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT = 32;
    public static final int VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT = 128;
    public static final int VK_IMAGE_CREATE_EXTENDED_USAGE_BIT = 256;
    public static final int VK_IMAGE_CREATE_PROTECTED_BIT = 2048;
    public static final int VK_IMAGE_CREATE_DISJOINT_BIT = 512;
    public static final int VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV = 8192;
    public static final int VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT = 4096;
    public static final int VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT = 16384;
    public static final int VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 65536;
    public static final int VK_IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT = 262144;
    public static final int VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT = 131072;
    public static final int VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM = 32768;
    public static final int VK_IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR = 1048576;

    public static String explain(@enumtype(VkImageCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_IMAGE_CREATE_SPARSE_BINDING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_SPARSE_BINDING_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_SPARSE_ALIASED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_SPARSE_ALIASED_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_ALIAS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_ALIAS_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_EXTENDED_USAGE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_EXTENDED_USAGE_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_PROTECTED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_PROTECTED_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_DISJOINT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_DISJOINT_BIT");
        }

        if ((flags & VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV");
        }

        if ((flags & VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT");
        }

        if ((flags & VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT");
        }

        if ((flags & VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }

        if ((flags & VK_IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT");
        }

        if ((flags & VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT");
        }

        if ((flags & VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_QCOM");
        }

        if ((flags & VK_IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR");
        }

        return sb.toString();
    }
}
