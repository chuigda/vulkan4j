package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryMapFlags.html">VkMemoryMapFlags</a>
public final class VkMemoryMapFlags {
    public static final int MEMORY_MAP_PLACED_EXT = 0x1;

    public static String explain(@enumtype(VkMemoryMapFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & MEMORY_MAP_PLACED_EXT) != 0) {
            detectedFlagBits.add("VK_MEMORY_MAP_PLACED_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkMemoryMapFlags() {}
}
