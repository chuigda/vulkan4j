package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpticalFlowSessionCreateFlagsNV.html">VkOpticalFlowSessionCreateFlagsNV</a>
public final class VkOpticalFlowSessionCreateFlagsNV {
    public static final int OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS = 0x8;
    public static final int OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS = 0x10;
    public static final int OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST = 0x2;
    public static final int OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW = 0x4;
    public static final int OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT = 0x1;

    public static String explain(@enumtype(VkOpticalFlowSessionCreateFlagsNV.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS) != 0) {
            detectedFlagBits.add("VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV");
        }
        if ((flags & OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS) != 0) {
            detectedFlagBits.add("VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV");
        }
        if ((flags & OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST) != 0) {
            detectedFlagBits.add("VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV");
        }
        if ((flags & OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW) != 0) {
            detectedFlagBits.add("VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV");
        }
        if ((flags & OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT) != 0) {
            detectedFlagBits.add("VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkOpticalFlowSessionCreateFlagsNV() {}
}
