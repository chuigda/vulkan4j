package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryMapFlags.html">VkMemoryMapFlags</a>
public final class MemoryMapFlags {
    public static final int PLACED_EXT = 0x1;
    
    public static String explain(@enumtype(MemoryMapFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PLACED_EXT) != 0) {
            detectedFlagBits.add("VK_MEMORY_MAP_PLACED_BIT_EXT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private MemoryMapFlags() {}
}
