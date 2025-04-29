package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeCapabilityFlagsKHR.html">VkVideoDecodeCapabilityFlagsKHR</a>
public final class VkVideoDecodeCapabilityFlagsKHR {
    public static final int VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE = 0x1;
    public static final int VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT = 0x2;

    public static String explain(@enumtype(VkVideoDecodeCapabilityFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE) != 0) {
            detectedFlagBits.add("VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR");
        }
        if ((flags & VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT) != 0) {
            detectedFlagBits.add("VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoDecodeCapabilityFlagsKHR() {}
}
