package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeUsageFlagsKHR.html">VkVideoEncodeUsageFlagsKHR</a>
public final class VkVideoEncodeUsageFlagsKHR {
    public static final int VIDEO_ENCODE_USAGE_CONFERENCING = 0x8;
    public static final int VIDEO_ENCODE_USAGE_DEFAULT = 0x0;
    public static final int VIDEO_ENCODE_USAGE_RECORDING = 0x4;
    public static final int VIDEO_ENCODE_USAGE_STREAMING = 0x2;
    public static final int VIDEO_ENCODE_USAGE_TRANSCODING = 0x1;

    public static String explain(@enumtype(VkVideoEncodeUsageFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_ENCODE_USAGE_CONFERENCING) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_USAGE_DEFAULT) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_USAGE_DEFAULT_KHR");
        }
        if ((flags & VIDEO_ENCODE_USAGE_RECORDING) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_USAGE_STREAMING) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_USAGE_TRANSCODING) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoEncodeUsageFlagsKHR() {}
}
