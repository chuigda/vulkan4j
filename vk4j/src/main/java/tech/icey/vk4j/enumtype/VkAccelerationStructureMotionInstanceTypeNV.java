package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkAccelerationStructureMotionInstanceTypeNV {
    public static final int VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_STATIC_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_MATRIX_MOTION_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_SRT_MOTION_NV = 2;

    public static String explain(@enumtype(VkAccelerationStructureMotionInstanceTypeNV.class) int value) {
        return switch (value) {
            case VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_STATIC_NV -> "VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_STATIC_NV";
            case VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_MATRIX_MOTION_NV -> "VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_MATRIX_MOTION_NV";
            case VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_SRT_MOTION_NV -> "VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_SRT_MOTION_NV";
            default -> "Unknown";
        };
    }
}
