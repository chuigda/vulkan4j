package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureTypeKHR.html">VkAccelerationStructureTypeKHR</a>
public final class VkAccelerationStructureTypeKHR {
    public static final int TOP_LEVEL = 0;
    public static final int BOTTOM_LEVEL = 1;
    public static final int GENERIC = 2;

    public static String explain(@enumtype(VkAccelerationStructureTypeKHR.class) int value) {
        return switch (value) {
            case VkAccelerationStructureTypeKHR.BOTTOM_LEVEL -> "VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR";
            case VkAccelerationStructureTypeKHR.GENERIC -> "VK_ACCELERATION_STRUCTURE_TYPE_GENERIC_KHR";
            case VkAccelerationStructureTypeKHR.TOP_LEVEL -> "VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR";
            default -> "Unknown VkAccelerationStructureTypeKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkAccelerationStructureTypeKHR() {}
}
