package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSubgroupFeatureFlags {
    public static final int VK_SUBGROUP_FEATURE_BASIC_BIT = 1;
    public static final int VK_SUBGROUP_FEATURE_VOTE_BIT = 2;
    public static final int VK_SUBGROUP_FEATURE_ARITHMETIC_BIT = 4;
    public static final int VK_SUBGROUP_FEATURE_BALLOT_BIT = 8;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_BIT = 16;
    public static final int VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT = 32;
    public static final int VK_SUBGROUP_FEATURE_CLUSTERED_BIT = 64;
    public static final int VK_SUBGROUP_FEATURE_QUAD_BIT = 128;
    public static final int VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV = 256;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_BIT_KHR = 512;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR = 1024;

    public static String explain(@enumtype(VkSubgroupFeatureFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SUBGROUP_FEATURE_BASIC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_BASIC_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_VOTE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_VOTE_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_ARITHMETIC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_ARITHMETIC_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_BALLOT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_BALLOT_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_SHUFFLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_SHUFFLE_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_CLUSTERED_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_CLUSTERED_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_QUAD_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_QUAD_BIT");
        }

        if ((flags & VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV");
        }

        if ((flags & VK_SUBGROUP_FEATURE_ROTATE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_ROTATE_BIT_KHR");
        }

        if ((flags & VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR");
        }

        return sb.toString();
    }
}
