package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureOpTypeNV.html">VkClusterAccelerationStructureOpTypeNV</a>
public final class VkClusterAccelerationStructureOpTypeNV {
    public static final int MOVE_OBJECTS = 0;
    public static final int BUILD_CLUSTERS_BOTTOM_LEVEL = 1;
    public static final int BUILD_TRIANGLE_CLUSTER = 2;
    public static final int BUILD_TRIANGLE_CLUSTER_TEMPLATE = 3;
    public static final int INSTANTIATE_TRIANGLE_CLUSTER = 4;

    public static String explain(@enumtype(VkClusterAccelerationStructureOpTypeNV.class) int value) {
        return switch (value) {
            case VkClusterAccelerationStructureOpTypeNV.BUILD_CLUSTERS_BOTTOM_LEVEL -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_CLUSTERS_BOTTOM_LEVEL_NV";
            case VkClusterAccelerationStructureOpTypeNV.BUILD_TRIANGLE_CLUSTER -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_NV";
            case VkClusterAccelerationStructureOpTypeNV.BUILD_TRIANGLE_CLUSTER_TEMPLATE -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_BUILD_TRIANGLE_CLUSTER_TEMPLATE_NV";
            case VkClusterAccelerationStructureOpTypeNV.INSTANTIATE_TRIANGLE_CLUSTER -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_INSTANTIATE_TRIANGLE_CLUSTER_NV";
            case VkClusterAccelerationStructureOpTypeNV.MOVE_OBJECTS -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_TYPE_MOVE_OBJECTS_NV";
            default -> "Unknown VkClusterAccelerationStructureOpTypeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkClusterAccelerationStructureOpTypeNV() {}
}
