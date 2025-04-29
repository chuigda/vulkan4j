package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewCreateFlags.html">VkImageViewCreateFlags</a>
public final class VkImageViewCreateFlags {
    public static final int IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT = 0x4;
    public static final int IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_EXT = 0x2;
    public static final int IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_EXT = 0x1;

    public static String explain(@enumtype(VkImageViewCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }
        if ((flags & IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DEFERRED_BIT_EXT");
        }
        if ((flags & IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageViewCreateFlags() {}
}
