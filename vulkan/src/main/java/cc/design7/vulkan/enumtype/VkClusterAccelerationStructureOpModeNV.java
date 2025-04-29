package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureOpModeNV.html">VkClusterAccelerationStructureOpModeNV</a>
public final class VkClusterAccelerationStructureOpModeNV {
    public static final int IMPLICIT_DESTINATIONS = 0x0;
    public static final int EXPLICIT_DESTINATIONS = 0x1;
    public static final int COMPUTE_SIZES = 0x2;

    public static String explain(@enumtype(VkClusterAccelerationStructureOpModeNV.class) int value) {
        return switch (value) {
            case VkClusterAccelerationStructureOpModeNV.COMPUTE_SIZES -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_COMPUTE_SIZES_NV";
            case VkClusterAccelerationStructureOpModeNV.EXPLICIT_DESTINATIONS -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_EXPLICIT_DESTINATIONS_NV";
            case VkClusterAccelerationStructureOpModeNV.IMPLICIT_DESTINATIONS -> "VK_CLUSTER_ACCELERATION_STRUCTURE_OP_MODE_IMPLICIT_DESTINATIONS_NV";
            default -> "Unknown VkClusterAccelerationStructureOpModeNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkClusterAccelerationStructureOpModeNV() {}
}
