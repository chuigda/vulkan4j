package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkAntiLagModeAMD {
    public static final int VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD = 0;
    public static final int VK_ANTI_LAG_MODE_ON_AMD = 1;
    public static final int VK_ANTI_LAG_MODE_OFF_AMD = 2;

    public static String explain(@enumtype(VkAntiLagModeAMD.class) int value) {
        return switch (value) {
            case VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD -> "VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD";
            case VK_ANTI_LAG_MODE_ON_AMD -> "VK_ANTI_LAG_MODE_ON_AMD";
            case VK_ANTI_LAG_MODE_OFF_AMD -> "VK_ANTI_LAG_MODE_OFF_AMD";
            default -> "Unknown";
        };
    }
}
