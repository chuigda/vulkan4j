package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceQueueCreateFlags.html">VkDeviceQueueCreateFlags</a>
public final class VkDeviceQueueCreateFlags {
    public static final int DEVICE_QUEUE_CREATE_PROTECTED = 0x1;

    public static String explain(@enumtype(VkDeviceQueueCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEVICE_QUEUE_CREATE_PROTECTED) != 0) {
            detectedFlagBits.add("VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDeviceQueueCreateFlags() {}
}
