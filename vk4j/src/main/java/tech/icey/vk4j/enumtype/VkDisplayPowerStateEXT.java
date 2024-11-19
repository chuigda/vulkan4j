package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDisplayPowerStateEXT {
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = 0;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = 2;

    public static String explain(@enumtype(VkDisplayPowerStateEXT.class) int value) {
        return switch (value) {
            case VK_DISPLAY_POWER_STATE_OFF_EXT -> "VK_DISPLAY_POWER_STATE_OFF_EXT";
            case VK_DISPLAY_POWER_STATE_SUSPEND_EXT -> "VK_DISPLAY_POWER_STATE_SUSPEND_EXT";
            case VK_DISPLAY_POWER_STATE_ON_EXT -> "VK_DISPLAY_POWER_STATE_ON_EXT";
            default -> "Unknown";
        };
    }
}
