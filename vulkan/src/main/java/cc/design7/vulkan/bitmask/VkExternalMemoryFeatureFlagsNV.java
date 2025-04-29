package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalMemoryFeatureFlagsNV.html">VkExternalMemoryFeatureFlagsNV</a>
public final class VkExternalMemoryFeatureFlagsNV {
    public static final int EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY = 0x1;
    public static final int EXTERNAL_MEMORY_FEATURE_EXPORTABLE = 0x2;
    public static final int EXTERNAL_MEMORY_FEATURE_IMPORTABLE = 0x4;

    public static String explain(@enumtype(VkExternalMemoryFeatureFlagsNV.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY) != 0) {
            detectedFlagBits.add("VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV");
        }
        if ((flags & EXTERNAL_MEMORY_FEATURE_EXPORTABLE) != 0) {
            detectedFlagBits.add("VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV");
        }
        if ((flags & EXTERNAL_MEMORY_FEATURE_IMPORTABLE) != 0) {
            detectedFlagBits.add("VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkExternalMemoryFeatureFlagsNV() {}
}
