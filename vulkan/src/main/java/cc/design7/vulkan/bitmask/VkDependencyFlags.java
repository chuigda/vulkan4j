package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDependencyFlags.html">VkDependencyFlags</a>
public final class VkDependencyFlags {
    public static final int DEPENDENCY_BY_REGION = 0x1;
    public static final int DEPENDENCY_DEVICE_GROUP = 0x4;
    public static final int DEPENDENCY_FEEDBACK_LOOP_EXT = 0x8;
    public static final int DEPENDENCY_QUEUE_FAMILY_OWNERSHIP_TRANSFER_USE_ALL_STAGES_KHR = 0x20;
    public static final int DEPENDENCY_VIEW_LOCAL = 0x2;

    public static String explain(@enumtype(VkDependencyFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEPENDENCY_BY_REGION) != 0) {
            detectedFlagBits.add("VK_DEPENDENCY_BY_REGION_BIT");
        }
        if ((flags & DEPENDENCY_DEVICE_GROUP) != 0) {
            detectedFlagBits.add("VK_DEPENDENCY_DEVICE_GROUP_BIT");
        }
        if ((flags & DEPENDENCY_FEEDBACK_LOOP_EXT) != 0) {
            detectedFlagBits.add("VK_DEPENDENCY_FEEDBACK_LOOP_BIT_EXT");
        }
        if ((flags & DEPENDENCY_QUEUE_FAMILY_OWNERSHIP_TRANSFER_USE_ALL_STAGES_KHR) != 0) {
            detectedFlagBits.add("VK_DEPENDENCY_QUEUE_FAMILY_OWNERSHIP_TRANSFER_USE_ALL_STAGES_BIT_KHR");
        }
        if ((flags & DEPENDENCY_VIEW_LOCAL) != 0) {
            detectedFlagBits.add("VK_DEPENDENCY_VIEW_LOCAL_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDependencyFlags() {}
}
