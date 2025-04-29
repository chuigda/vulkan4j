package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeRateControlModeFlagsKHR.html">VkVideoEncodeRateControlModeFlagsKHR</a>
public final class VkVideoEncodeRateControlModeFlagsKHR {
    public static final int CBR = 0x2;
    public static final int DEFAULT = 0x0;
    public static final int DISABLED = 0x1;
    public static final int VBR = 0x4;

    public static String explain(@enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & CBR) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR");
        }
        if ((flags & DEFAULT) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR");
        }
        if ((flags & DISABLED) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR");
        }
        if ((flags & VBR) != 0) {
            detectedFlagBits.add("VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkVideoEncodeRateControlModeFlagsKHR() {}
}
