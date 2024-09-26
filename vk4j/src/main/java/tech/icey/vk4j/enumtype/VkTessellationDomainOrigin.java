package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkTessellationDomainOrigin {
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT = 0;
    public static final int VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT = 1;

    public static String explain(@enumtype(VkTessellationDomainOrigin.class) int value) {
        return switch (value) {
            case VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT -> "VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT";
            case VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT -> "VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT";
            default -> "Unknown";
        };
    }
}
