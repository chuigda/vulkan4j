package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkAccelerationStructureCompatibilityKHR {
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR = 0;
    public static final int VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR = 1;

    public static String explain(@enumtype(VkAccelerationStructureCompatibilityKHR.class) int value) {
        return switch (value) {
            case VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR -> "VK_ACCELERATION_STRUCTURE_COMPATIBILITY_COMPATIBLE_KHR";
            case VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR -> "VK_ACCELERATION_STRUCTURE_COMPATIBILITY_INCOMPATIBLE_KHR";
            default -> "Unknown";
        };
    }
}
