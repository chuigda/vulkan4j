package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkEventCreateFlags.html">VkEventCreateFlags</a>
public final class VkEventCreateFlags {
    public static final int EVENT_CREATE_DEVICE_ONLY = 0x1;

    public static String explain(@enumtype(VkEventCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & EVENT_CREATE_DEVICE_ONLY) != 0) {
            detectedFlagBits.add("VK_EVENT_CREATE_DEVICE_ONLY_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkEventCreateFlags() {}
}
