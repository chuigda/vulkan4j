package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBuildMicromapFlagsEXT.html">VkBuildMicromapFlagsEXT</a>
public final class BuildMicromapFlagsEXT {
    public static final int ALLOW_COMPACTION = 0x4;
    public static final int PREFER_FAST_BUILD = 0x2;
    public static final int PREFER_FAST_TRACE = 0x1;

    public static String explain(@enumtype(BuildMicromapFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ALLOW_COMPACTION) != 0) {
            detectedFlagBits.add("VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT");
        }
        if ((flags & PREFER_FAST_BUILD) != 0) {
            detectedFlagBits.add("VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT");
        }
        if ((flags & PREFER_FAST_TRACE) != 0) {
            detectedFlagBits.add("VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BuildMicromapFlagsEXT() {}
}
