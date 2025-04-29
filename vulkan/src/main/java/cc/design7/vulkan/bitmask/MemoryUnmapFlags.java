package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryUnmapFlags.html">VkMemoryUnmapFlags</a>
public final class MemoryUnmapFlags {
    public static final int RESERVE_EXT = 0x1;

    public static String explain(@enumtype(MemoryUnmapFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & RESERVE_EXT) != 0) {
            detectedFlagBits.add("VK_MEMORY_UNMAP_RESERVE_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private MemoryUnmapFlags() {}
}
