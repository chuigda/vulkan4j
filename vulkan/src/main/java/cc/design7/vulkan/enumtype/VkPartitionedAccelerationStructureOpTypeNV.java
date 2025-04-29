package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPartitionedAccelerationStructureOpTypeNV.html">VkPartitionedAccelerationStructureOpTypeNV</a>
public final class VkPartitionedAccelerationStructureOpTypeNV {
    public static final int WRITE_INSTANCE = 0;
    public static final int UPDATE_INSTANCE = 1;
    public static final int WRITE_PARTITION_TRANSLATION = 2;

    public static String explain(@enumtype(VkPartitionedAccelerationStructureOpTypeNV.class) int value) {
        return switch (value) {
            case VkPartitionedAccelerationStructureOpTypeNV.UPDATE_INSTANCE -> "VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_UPDATE_INSTANCE_NV";
            case VkPartitionedAccelerationStructureOpTypeNV.WRITE_INSTANCE -> "VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_INSTANCE_NV";
            case VkPartitionedAccelerationStructureOpTypeNV.WRITE_PARTITION_TRANSLATION -> "VK_PARTITIONED_ACCELERATION_STRUCTURE_OP_TYPE_WRITE_PARTITION_TRANSLATION_NV";
            default -> "Unknown VkPartitionedAccelerationStructureOpTypeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPartitionedAccelerationStructureOpTypeNV() {}
}
