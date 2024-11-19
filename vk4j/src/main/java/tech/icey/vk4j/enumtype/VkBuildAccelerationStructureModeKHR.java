package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkBuildAccelerationStructureModeKHR {
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR = 0;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR = 1;

    public static String explain(@enumtype(VkBuildAccelerationStructureModeKHR.class) int value) {
        return switch (value) {
            case VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR -> "VK_BUILD_ACCELERATION_STRUCTURE_MODE_BUILD_KHR";
            case VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR -> "VK_BUILD_ACCELERATION_STRUCTURE_MODE_UPDATE_KHR";
            default -> "Unknown";
        };
    }
}
