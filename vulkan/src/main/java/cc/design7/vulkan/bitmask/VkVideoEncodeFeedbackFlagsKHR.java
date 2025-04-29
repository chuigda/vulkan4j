package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeFeedbackFlagsKHR.html">VkVideoEncodeFeedbackFlagsKHR</a>
public final class VkVideoEncodeFeedbackFlagsKHR {
    public static final int VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET = 0x1;
    public static final int VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN = 0x2;
    public static final int VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES = 0x4;

    public static String explain(@enumtype(VkVideoEncodeFeedbackFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoEncodeFeedbackFlagsKHR() {}
}
