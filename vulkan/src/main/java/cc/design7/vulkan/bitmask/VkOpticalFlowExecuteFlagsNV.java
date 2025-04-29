package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpticalFlowExecuteFlagsNV.html">VkOpticalFlowExecuteFlagsNV</a>
public final class VkOpticalFlowExecuteFlagsNV {
    public static final int OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS = 0x1;

    public static String explain(@enumtype(VkOpticalFlowExecuteFlagsNV.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS) != 0) {
            detectedFlagBits.add("VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkOpticalFlowExecuteFlagsNV() {}
}
