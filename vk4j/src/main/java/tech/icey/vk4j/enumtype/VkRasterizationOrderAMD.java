package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkRasterizationOrderAMD {
    public static final int VK_RASTERIZATION_ORDER_STRICT_AMD = 0;
    public static final int VK_RASTERIZATION_ORDER_RELAXED_AMD = 1;

    public static String explain(@enumtype(VkRasterizationOrderAMD.class) int value) {
        return switch (value) {
            case VK_RASTERIZATION_ORDER_STRICT_AMD -> "VK_RASTERIZATION_ORDER_STRICT_AMD";
            case VK_RASTERIZATION_ORDER_RELAXED_AMD -> "VK_RASTERIZATION_ORDER_RELAXED_AMD";
            default -> "Unknown";
        };
    }
}
