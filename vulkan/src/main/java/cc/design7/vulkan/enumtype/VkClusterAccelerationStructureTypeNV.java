package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureTypeNV.html">VkClusterAccelerationStructureTypeNV</a>
public final class VkClusterAccelerationStructureTypeNV {
    public static final int CLUSTERS_BOTTOM_LEVEL = 0x0;
    public static final int TRIANGLE_CLUSTER = 0x1;
    public static final int TRIANGLE_CLUSTER_TEMPLATE = 0x2;

    public static String explain(@enumtype(VkClusterAccelerationStructureTypeNV.class) int value) {
        return switch (value) {
            case VkClusterAccelerationStructureTypeNV.CLUSTERS_BOTTOM_LEVEL -> "VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_CLUSTERS_BOTTOM_LEVEL_NV";
            case VkClusterAccelerationStructureTypeNV.TRIANGLE_CLUSTER -> "VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_NV";
            case VkClusterAccelerationStructureTypeNV.TRIANGLE_CLUSTER_TEMPLATE -> "VK_CLUSTER_ACCELERATION_STRUCTURE_TYPE_TRIANGLE_CLUSTER_TEMPLATE_NV";
            default -> "Unknown VkClusterAccelerationStructureTypeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkClusterAccelerationStructureTypeNV() {}
}
