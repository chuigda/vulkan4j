package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingFlags.html">VkRenderingFlags</a>
public final class VkRenderingFlags {
    public static final int RENDERING_CONTENTS_INLINE_KHR = 0x10;
    public static final int RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS = 0x1;
    public static final int RENDERING_ENABLE_LEGACY_DITHERING_EXT = 0x8;
    public static final int RENDERING_RESUMING = 0x4;
    public static final int RENDERING_SUSPENDING = 0x2;

    public static String explain(@enumtype(VkRenderingFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & RENDERING_CONTENTS_INLINE_KHR) != 0) {
            detectedFlagBits.add("VK_RENDERING_CONTENTS_INLINE_BIT_KHR");
        }
        if ((flags & RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS) != 0) {
            detectedFlagBits.add("VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT");
        }
        if ((flags & RENDERING_ENABLE_LEGACY_DITHERING_EXT) != 0) {
            detectedFlagBits.add("VK_RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT");
        }
        if ((flags & RENDERING_RESUMING) != 0) {
            detectedFlagBits.add("VK_RENDERING_RESUMING_BIT");
        }
        if ((flags & RENDERING_SUSPENDING) != 0) {
            detectedFlagBits.add("VK_RENDERING_SUSPENDING_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkRenderingFlags() {}
}
