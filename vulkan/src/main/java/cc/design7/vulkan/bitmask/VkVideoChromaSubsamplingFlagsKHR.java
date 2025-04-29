package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoChromaSubsamplingFlagsKHR.html">VkVideoChromaSubsamplingFlagsKHR</a>
public final class VkVideoChromaSubsamplingFlagsKHR {
    public static final int VIDEO_CHROMA_SUBSAMPLING_420 = 0x2;
    public static final int VIDEO_CHROMA_SUBSAMPLING_422 = 0x4;
    public static final int VIDEO_CHROMA_SUBSAMPLING_444 = 0x8;
    public static final int VIDEO_CHROMA_SUBSAMPLING_INVALID = 0x0;
    public static final int VIDEO_CHROMA_SUBSAMPLING_MONOCHROME = 0x1;

    public static String explain(@enumtype(VkVideoChromaSubsamplingFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_CHROMA_SUBSAMPLING_420) != 0) {
            detectedFlagBits.add("VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR");
        }
        if ((flags & VIDEO_CHROMA_SUBSAMPLING_422) != 0) {
            detectedFlagBits.add("VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR");
        }
        if ((flags & VIDEO_CHROMA_SUBSAMPLING_444) != 0) {
            detectedFlagBits.add("VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR");
        }
        if ((flags & VIDEO_CHROMA_SUBSAMPLING_INVALID) != 0) {
            detectedFlagBits.add("VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR");
        }
        if ((flags & VIDEO_CHROMA_SUBSAMPLING_MONOCHROME) != 0) {
            detectedFlagBits.add("VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoChromaSubsamplingFlagsKHR() {}
}
