package club.doki7.vulkan.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeFeedbackFlagsKHR.html"><code>VkVideoEncodeFeedbackFlagsKHR</code></a>
public final class VkVideoEncodeFeedbackFlagsKHR {
    public static final int BITSTREAM_BUFFER_OFFSET = 0x1;
    public static final int BITSTREAM_BYTES_WRITTEN = 0x2;
    public static final int BITSTREAM_HAS_OVERRIDES = 0x4;

    public static String explain(@enumtype(VkVideoEncodeFeedbackFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BITSTREAM_BUFFER_OFFSET) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR");
        }
        if ((flags & BITSTREAM_BYTES_WRITTEN) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR");
        }
        if ((flags & BITSTREAM_HAS_OVERRIDES) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoEncodeFeedbackFlagsKHR() {}
}
