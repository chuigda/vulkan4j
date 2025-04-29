package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoSessionParametersCreateFlagsKHR.html">VkVideoSessionParametersCreateFlagsKHR</a>
public final class VideoSessionParametersCreateFlagsKHR {
    public static final int QUANTIZATION_MAP_COMPATIBLE = 0x1;

    public static String explain(@enumtype(VideoSessionParametersCreateFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & QUANTIZATION_MAP_COMPATIBLE) != 0) {
            detectedFlagBits.add("VK_VIDEO_SESSION_PARAMETERS_CREATE_QUANTIZATION_MAP_COMPATIBLE_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VideoSessionParametersCreateFlagsKHR() {}
}
