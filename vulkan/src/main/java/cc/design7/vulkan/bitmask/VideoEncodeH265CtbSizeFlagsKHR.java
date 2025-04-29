package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265CtbSizeFlagsKHR.html">VkVideoEncodeH265CtbSizeFlagsKHR</a>
public final class VideoEncodeH265CtbSizeFlagsKHR {
    public static final int VIDEO_ENCODE_H265_CTB_SIZE_16 = 0x1;
    public static final int VIDEO_ENCODE_H265_CTB_SIZE_32 = 0x2;
    public static final int VIDEO_ENCODE_H265_CTB_SIZE_64 = 0x4;

    public static String explain(@enumtype(VideoEncodeH265CtbSizeFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_ENCODE_H265_CTB_SIZE_16) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_CTB_SIZE_16_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H265_CTB_SIZE_32) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_CTB_SIZE_32_BIT_KHR");
        }
        if ((flags & VIDEO_ENCODE_H265_CTB_SIZE_64) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_H265_CTB_SIZE_64_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VideoEncodeH265CtbSizeFlagsKHR() {}
}
