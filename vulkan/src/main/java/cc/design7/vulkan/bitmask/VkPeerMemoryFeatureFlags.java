package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPeerMemoryFeatureFlags.html">VkPeerMemoryFeatureFlags</a>
public final class VkPeerMemoryFeatureFlags {
    public static final int PEER_MEMORY_FEATURE_COPY_DST = 0x2;
    public static final int PEER_MEMORY_FEATURE_COPY_SRC = 0x1;
    public static final int PEER_MEMORY_FEATURE_GENERIC_DST = 0x8;
    public static final int PEER_MEMORY_FEATURE_GENERIC_SRC = 0x4;

    public static String explain(@enumtype(VkPeerMemoryFeatureFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PEER_MEMORY_FEATURE_COPY_DST) != 0) {
            detectedFlagBits.add("VK_PEER_MEMORY_FEATURE_COPY_DST_BIT");
        }
        if ((flags & PEER_MEMORY_FEATURE_COPY_SRC) != 0) {
            detectedFlagBits.add("VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT");
        }
        if ((flags & PEER_MEMORY_FEATURE_GENERIC_DST) != 0) {
            detectedFlagBits.add("VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT");
        }
        if ((flags & PEER_MEMORY_FEATURE_GENERIC_SRC) != 0) {
            detectedFlagBits.add("VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPeerMemoryFeatureFlags() {}
}
