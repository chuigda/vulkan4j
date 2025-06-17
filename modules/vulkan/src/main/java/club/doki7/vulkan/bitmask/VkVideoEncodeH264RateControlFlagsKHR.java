package club.doki7.vulkan.bitmask;

import club.doki7.ffm.annotation.*;
import org.intellij.lang.annotations.MagicConstant;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264RateControlFlagsKHR.html"><code>VkVideoEncodeH264RateControlFlagsKHR</code></a>
public final class VkVideoEncodeH264RateControlFlagsKHR {
    public static final int VK_VIDEO_ENCODE_H264_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE = 0x1;
    public static final int VK_VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_DYADIC = 0x8;
    public static final int VK_VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_FLAT = 0x4;
    public static final int VK_VIDEO_ENCODE_H264_RATE_CONTROL_REGULAR_GOP = 0x2;
    public static final int VK_VIDEO_ENCODE_H264_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC = 0x10;

    public static String explain(@MagicConstant(flagsFromClass = VkVideoEncodeH264RateControlFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VK_VIDEO_ENCODE_H264_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_RATE_CONTROL_ATTEMPT_HRD_COMPLIANCE_BIT_KHR");
        }
        if ((flags & VK_VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_DYADIC) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_DYADIC_BIT_KHR");
        }
        if ((flags & VK_VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_FLAT) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_RATE_CONTROL_REFERENCE_PATTERN_FLAT_BIT_KHR");
        }
        if ((flags & VK_VIDEO_ENCODE_H264_RATE_CONTROL_REGULAR_GOP) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_RATE_CONTROL_REGULAR_GOP_BIT_KHR");
        }
        if ((flags & VK_VIDEO_ENCODE_H264_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H264_RATE_CONTROL_TEMPORAL_LAYER_PATTERN_DYADIC_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoEncodeH264RateControlFlagsKHR() {}
}
