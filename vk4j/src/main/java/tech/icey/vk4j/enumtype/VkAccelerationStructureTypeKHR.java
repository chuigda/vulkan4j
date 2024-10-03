package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkAccelerationStructureTypeKHR {
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR = 1;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR = 2;

    public static String explain(@enumtype(VkAccelerationStructureTypeKHR.class) int value) {
        return switch (value) {
            case VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR -> "VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR";
            case VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR -> "VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR";
            case VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR -> "VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR";
            default -> "Unknown";
        };
    }
}
