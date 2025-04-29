package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueFlags.html">VkQueueFlags</a>
public final class VkQueueFlags {
    public static final int QUEUE_COMPUTE = 0x2;
    public static final int QUEUE_GRAPHICS = 0x1;
    public static final int QUEUE_OPTICAL_FLOW_NV = 0x100;
    public static final int QUEUE_PROTECTED = 0x10;
    public static final int QUEUE_SPARSE_BINDING = 0x8;
    public static final int QUEUE_TRANSFER = 0x4;
    public static final int QUEUE_VIDEO_DECODE_KHR = 0x20;
    public static final int QUEUE_VIDEO_ENCODE_KHR = 0x40;

    public static String explain(@enumtype(VkQueueFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & QUEUE_COMPUTE) != 0) {
            detectedFlagBits.add("VK_QUEUE_COMPUTE_BIT");
        }
        if ((flags & QUEUE_GRAPHICS) != 0) {
            detectedFlagBits.add("VK_QUEUE_GRAPHICS_BIT");
        }
        if ((flags & QUEUE_OPTICAL_FLOW_NV) != 0) {
            detectedFlagBits.add("VK_QUEUE_OPTICAL_FLOW_BIT_NV");
        }
        if ((flags & QUEUE_PROTECTED) != 0) {
            detectedFlagBits.add("VK_QUEUE_PROTECTED_BIT");
        }
        if ((flags & QUEUE_SPARSE_BINDING) != 0) {
            detectedFlagBits.add("VK_QUEUE_SPARSE_BINDING_BIT");
        }
        if ((flags & QUEUE_TRANSFER) != 0) {
            detectedFlagBits.add("VK_QUEUE_TRANSFER_BIT");
        }
        if ((flags & QUEUE_VIDEO_DECODE_KHR) != 0) {
            detectedFlagBits.add("VK_QUEUE_VIDEO_DECODE_BIT_KHR");
        }
        if ((flags & QUEUE_VIDEO_ENCODE_KHR) != 0) {
            detectedFlagBits.add("VK_QUEUE_VIDEO_ENCODE_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkQueueFlags() {}
}
