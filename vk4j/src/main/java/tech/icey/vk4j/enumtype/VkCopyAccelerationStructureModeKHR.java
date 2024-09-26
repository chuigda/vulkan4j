package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkCopyAccelerationStructureModeKHR {
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR = 0;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR = 1;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR = 2;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR = 3;

    public static String explain(@enumtype(VkCopyAccelerationStructureModeKHR.class) int value) {
        return switch (value) {
            case VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR -> "VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR";
            case VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR -> "VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR";
            case VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR -> "VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR";
            case VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR -> "VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR";
            default -> "Unknown";
        };
    }
}
