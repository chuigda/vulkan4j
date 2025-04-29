package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkToolPurposeFlags.html">VkToolPurposeFlags</a>
public final class VkToolPurposeFlags {
    public static final int TOOL_PURPOSE_ADDITIONAL_FEATURES = 0x8;
    public static final int TOOL_PURPOSE_DEBUG_MARKERS_EXT = 0x40;
    public static final int TOOL_PURPOSE_DEBUG_REPORTING_EXT = 0x20;
    public static final int TOOL_PURPOSE_MODIFYING_FEATURES = 0x10;
    public static final int TOOL_PURPOSE_PROFILING = 0x2;
    public static final int TOOL_PURPOSE_TRACING = 0x4;
    public static final int TOOL_PURPOSE_VALIDATION = 0x1;

    public static String explain(@enumtype(VkToolPurposeFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & TOOL_PURPOSE_ADDITIONAL_FEATURES) != 0) {
            detectedFlagBits.add("VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT");
        }
        if ((flags & TOOL_PURPOSE_DEBUG_MARKERS_EXT) != 0) {
            detectedFlagBits.add("VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT");
        }
        if ((flags & TOOL_PURPOSE_DEBUG_REPORTING_EXT) != 0) {
            detectedFlagBits.add("VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT");
        }
        if ((flags & TOOL_PURPOSE_MODIFYING_FEATURES) != 0) {
            detectedFlagBits.add("VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT");
        }
        if ((flags & TOOL_PURPOSE_PROFILING) != 0) {
            detectedFlagBits.add("VK_TOOL_PURPOSE_PROFILING_BIT");
        }
        if ((flags & TOOL_PURPOSE_TRACING) != 0) {
            detectedFlagBits.add("VK_TOOL_PURPOSE_TRACING_BIT");
        }
        if ((flags & TOOL_PURPOSE_VALIDATION) != 0) {
            detectedFlagBits.add("VK_TOOL_PURPOSE_VALIDATION_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkToolPurposeFlags() {}
}
