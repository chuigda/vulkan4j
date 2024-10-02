package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDirectDriverLoadingModeLUNARG {
    public static final int VK_DIRECT_DRIVER_LOADING_MODE_EXCLUSIVE_LUNARG = 0;
    public static final int VK_DIRECT_DRIVER_LOADING_MODE_INCLUSIVE_LUNARG = 1;

    public static String explain(@enumtype(VkDirectDriverLoadingModeLUNARG.class) int value) {
        return switch (value) {
            case VK_DIRECT_DRIVER_LOADING_MODE_EXCLUSIVE_LUNARG -> "VK_DIRECT_DRIVER_LOADING_MODE_EXCLUSIVE_LUNARG";
            case VK_DIRECT_DRIVER_LOADING_MODE_INCLUSIVE_LUNARG -> "VK_DIRECT_DRIVER_LOADING_MODE_INCLUSIVE_LUNARG";
            default -> "Unknown";
        };
    }
}
