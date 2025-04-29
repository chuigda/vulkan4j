package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureBuildTypeKHR.html">VkAccelerationStructureBuildTypeKHR</a>
public final class VkAccelerationStructureBuildTypeKHR {
    public static final int HOST = 0;
    public static final int DEVICE = 1;
    public static final int HOST_OR_DEVICE = 2;

    public static String explain(@enumtype(VkAccelerationStructureBuildTypeKHR.class) int value) {
        return switch (value) {
            case VkAccelerationStructureBuildTypeKHR.DEVICE -> "VK_ACCELERATION_STRUCTURE_BUILD_TYPE_DEVICE_KHR";
            case VkAccelerationStructureBuildTypeKHR.HOST -> "VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_KHR";
            case VkAccelerationStructureBuildTypeKHR.HOST_OR_DEVICE -> "VK_ACCELERATION_STRUCTURE_BUILD_TYPE_HOST_OR_DEVICE_KHR";
            default -> "Unknown VkAccelerationStructureBuildTypeKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkAccelerationStructureBuildTypeKHR() {}
}
