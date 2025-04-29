package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalFenceFeatureFlags.html">VkExternalFenceFeatureFlags</a>
public final class VkExternalFenceFeatureFlags {
    public static final int EXTERNAL_FENCE_FEATURE_EXPORTABLE = 0x1;
    public static final int EXTERNAL_FENCE_FEATURE_IMPORTABLE = 0x2;

    public static String explain(@enumtype(VkExternalFenceFeatureFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & EXTERNAL_FENCE_FEATURE_EXPORTABLE) != 0) {
            detectedFlagBits.add("VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT");
        }
        if ((flags & EXTERNAL_FENCE_FEATURE_IMPORTABLE) != 0) {
            detectedFlagBits.add("VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkExternalFenceFeatureFlags() {}
}
