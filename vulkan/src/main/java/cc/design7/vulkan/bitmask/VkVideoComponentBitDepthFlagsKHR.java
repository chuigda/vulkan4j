package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoComponentBitDepthFlagsKHR.html">VkVideoComponentBitDepthFlagsKHR</a>
public final class VkVideoComponentBitDepthFlagsKHR {
    public static final int VIDEO_COMPONENT_BIT_DEPTH_10 = 0x4;
    public static final int VIDEO_COMPONENT_BIT_DEPTH_12 = 0x10;
    public static final int VIDEO_COMPONENT_BIT_DEPTH_8 = 0x1;
    public static final int VIDEO_COMPONENT_BIT_DEPTH_INVALID = 0x0;

    public static String explain(@enumtype(VkVideoComponentBitDepthFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & VIDEO_COMPONENT_BIT_DEPTH_10) != 0) {
            detectedFlagBits.add("VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR");
        }
        if ((flags & VIDEO_COMPONENT_BIT_DEPTH_12) != 0) {
            detectedFlagBits.add("VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR");
        }
        if ((flags & VIDEO_COMPONENT_BIT_DEPTH_8) != 0) {
            detectedFlagBits.add("VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR");
        }
        if ((flags & VIDEO_COMPONENT_BIT_DEPTH_INVALID) != 0) {
            detectedFlagBits.add("VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoComponentBitDepthFlagsKHR() {}
}
