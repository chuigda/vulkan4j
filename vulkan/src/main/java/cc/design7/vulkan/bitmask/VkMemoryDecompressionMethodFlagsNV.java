package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryDecompressionMethodFlagsNV.html">VkMemoryDecompressionMethodFlagsNV</a>
public final class VkMemoryDecompressionMethodFlagsNV {
    public static final long MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0 = 0x1L;

    public static String explain(@enumtype(VkMemoryDecompressionMethodFlagsNV.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0) != 0) {
            detectedFlagBits.add("VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkMemoryDecompressionMethodFlagsNV() {}
}
