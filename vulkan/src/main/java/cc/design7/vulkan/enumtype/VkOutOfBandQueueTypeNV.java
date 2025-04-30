package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOutOfBandQueueTypeNV.html">VkOutOfBandQueueTypeNV</a>
public final class VkOutOfBandQueueTypeNV {
    public static final int RENDER = 0x0;
    public static final int PRESENT = 0x1;

    public static String explain(@enumtype(VkOutOfBandQueueTypeNV.class) int value) {
        return switch (value) {
            case VkOutOfBandQueueTypeNV.PRESENT -> "VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV";
            case VkOutOfBandQueueTypeNV.RENDER -> "VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV";
            default -> "Unknown VkOutOfBandQueueTypeNV: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkOutOfBandQueueTypeNV() {}
}
