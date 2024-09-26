package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkVideoEncodeTuningModeKHR {
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR = 1;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR = 2;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR = 3;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR = 4;

    public static String explain(@enumtype(VkVideoEncodeTuningModeKHR.class) int value) {
        return switch (value) {
            case VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR -> "VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR";
            case VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR -> "VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR";
            case VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR -> "VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR";
            case VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR -> "VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR";
            case VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR -> "VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR";
            default -> "Unknown";
        };
    }
}
