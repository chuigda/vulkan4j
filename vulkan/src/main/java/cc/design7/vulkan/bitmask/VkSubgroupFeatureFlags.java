package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubgroupFeatureFlags.html">VkSubgroupFeatureFlags</a>
public final class VkSubgroupFeatureFlags {
    public static final int SUBGROUP_FEATURE_ARITHMETIC = 0x4;
    public static final int SUBGROUP_FEATURE_BALLOT = 0x8;
    public static final int SUBGROUP_FEATURE_BASIC = 0x1;
    public static final int SUBGROUP_FEATURE_CLUSTERED = 0x40;
    public static final int SUBGROUP_FEATURE_PARTITIONED_NV = 0x100;
    public static final int SUBGROUP_FEATURE_QUAD = 0x80;
    public static final int SUBGROUP_FEATURE_ROTATE = 0x200;
    public static final int SUBGROUP_FEATURE_ROTATE_CLUSTERED = 0x400;
    public static final int SUBGROUP_FEATURE_SHUFFLE = 0x10;
    public static final int SUBGROUP_FEATURE_SHUFFLE_RELATIVE = 0x20;
    public static final int SUBGROUP_FEATURE_VOTE = 0x2;

    public static String explain(@enumtype(VkSubgroupFeatureFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SUBGROUP_FEATURE_ARITHMETIC) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_ARITHMETIC_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_BALLOT) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_BALLOT_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_BASIC) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_BASIC_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_CLUSTERED) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_CLUSTERED_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_PARTITIONED_NV) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV");
        }
        if ((flags & SUBGROUP_FEATURE_QUAD) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_QUAD_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_ROTATE) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_ROTATE_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_ROTATE_CLUSTERED) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_SHUFFLE) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_SHUFFLE_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_SHUFFLE_RELATIVE) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT");
        }
        if ((flags & SUBGROUP_FEATURE_VOTE) != 0) {
            detectedFlagBits.add("VK_SUBGROUP_FEATURE_VOTE_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkSubgroupFeatureFlags() {}
}
