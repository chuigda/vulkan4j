package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkCoarseSampleOrderTypeNV {
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV = 0;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV = 1;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV = 2;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV = 3;

    public static String explain(@enumtype(VkCoarseSampleOrderTypeNV.class) int value) {
        return switch (value) {
            case VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV -> "VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV";
            case VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV -> "VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV";
            case VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV -> "VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV";
            case VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV -> "VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV";
            default -> "Unknown";
        };
    }
}
