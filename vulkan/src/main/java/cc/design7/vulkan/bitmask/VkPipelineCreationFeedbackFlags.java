package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCreationFeedbackFlags.html">VkPipelineCreationFeedbackFlags</a>
public final class VkPipelineCreationFeedbackFlags {
    public static final int PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT = 0x2;
    public static final int PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION = 0x4;
    public static final int PIPELINE_CREATION_FEEDBACK_VALID = 0x1;

    public static String explain(@enumtype(VkPipelineCreationFeedbackFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT");
        }
        if ((flags & PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT");
        }
        if ((flags & PIPELINE_CREATION_FEEDBACK_VALID) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPipelineCreationFeedbackFlags() {}
}
