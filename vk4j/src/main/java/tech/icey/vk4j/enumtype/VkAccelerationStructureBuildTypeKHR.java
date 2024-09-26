package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkAccelerationStructureBuildTypeKHR {
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR = 2;

    public static String explain(@enumtype(VkAccelerationStructureBuildTypeKHR.class) int value) {
        return switch (value) {
            case VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR -> "VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR";
            case VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR -> "VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR";
            case VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR -> "VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR";
            default -> "Unknown";
        };
    }
}
