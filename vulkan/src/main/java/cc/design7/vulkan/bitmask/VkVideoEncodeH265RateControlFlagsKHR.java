package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265RateControlFlagsKHR.html">VkVideoEncodeH265RateControlFlagsKHR</a>
public final class VkVideoEncodeH265RateControlFlagsKHR {
    public static final int VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE = 0x1;
    public static final int VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC = 0x8;
    public static final int VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT = 0x4;
    public static final int VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP = 0x2;
    public static final int VIDEO_ENCODE_H265_RATE_CONTROL_TEMPORAL_SUB_LAYER_PATTERN_DYADIC = 0x10;

    public static String explain(@enumtype(VkVideoEncodeH265RateControlFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_RATE_CONTROL_REGULAR_GOP_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H265_RATE_CONTROL_TEMPORAL_SUB_LAYER_PATTERN_DYADIC) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_RATE_CONTROL_TEMPORAL_SUB_LAYER_PATTERN_DYADIC_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoEncodeH265RateControlFlagsKHR() {}
}
