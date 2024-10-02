package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkOutOfBandQueueTypeNV {
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV = 0;
    public static final int VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV = 1;

    public static String explain(@enumtype(VkOutOfBandQueueTypeNV.class) int value) {
        return switch (value) {
            case VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV -> "VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV";
            case VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV -> "VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV";
            default -> "Unknown";
        };
    }
}
