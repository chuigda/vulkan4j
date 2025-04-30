package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMemoryRequirementsTypeNV.html">VkAccelerationStructureMemoryRequirementsTypeNV</a>
public final class VkAccelerationStructureMemoryRequirementsTypeNV {
    public static final int OBJECT = 0x0;
    public static final int BUILD_SCRATCH = 0x1;
    public static final int UPDATE_SCRATCH = 0x2;

    public static String explain(@enumtype(VkAccelerationStructureMemoryRequirementsTypeNV.class) int value) {
        return switch (value) {
            case VkAccelerationStructureMemoryRequirementsTypeNV.BUILD_SCRATCH -> "VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV";
            case VkAccelerationStructureMemoryRequirementsTypeNV.OBJECT -> "VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV";
            case VkAccelerationStructureMemoryRequirementsTypeNV.UPDATE_SCRATCH -> "VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV";
            default -> "Unknown VkAccelerationStructureMemoryRequirementsTypeNV: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkAccelerationStructureMemoryRequirementsTypeNV() {}
}
