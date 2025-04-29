package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineLayoutCreateFlags.html">VkPipelineLayoutCreateFlags</a>
public final class VkPipelineLayoutCreateFlags {
    public static final int INDEPENDENT_SETS_EXT = 0x2;

    public static String explain(@enumtype(VkPipelineLayoutCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & INDEPENDENT_SETS_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_LAYOUT_CREATE_INDEPENDENT_SETS_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPipelineLayoutCreateFlags() {}
}
