package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeCapabilityFlagsKHR.html">VkVideoEncodeCapabilityFlagsKHR</a>
public final class VkVideoEncodeCapabilityFlagsKHR {
    public static final int VIDEO_ENCODE_CAPABILITY_EMPHASIS_MAP = 0x8;
    public static final int VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION = 0x2;
    public static final int VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES = 0x1;
    public static final int VIDEO_ENCODE_CAPABILITY_QUANTIZATION_DELTA_MAP = 0x4;

    public static String explain(@enumtype(VkVideoEncodeCapabilityFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_ENCODE_CAPABILITY_EMPHASIS_MAP) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_CAPABILITY_EMPHASIS_MAP_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_CAPABILITY_QUANTIZATION_DELTA_MAP) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_CAPABILITY_QUANTIZATION_DELTA_MAP_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoEncodeCapabilityFlagsKHR() {}
}
