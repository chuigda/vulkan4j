package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseMemoryBindFlags.html">VkSparseMemoryBindFlags</a>
public final class VkSparseMemoryBindFlags {
    public static final int METADATA = 0x1;

    public static String explain(@enumtype(VkSparseMemoryBindFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & METADATA) != 0) {
            detectedFlagBits.add("VK_SPARSE_MEMORY_BIND_METADATA_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkSparseMemoryBindFlags() {}
}
