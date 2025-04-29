package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryTypeKHR.html">VkGeometryTypeKHR</a>
public final class VkGeometryTypeKHR {
    public static final int TRIANGLES = 0;
    public static final int AABBS = 1;
    public static final int INSTANCES = 2;
    public static final int SPHERES_NV = 1000429004;
    public static final int LINEAR_SWEPT_SPHERES_NV = 1000429005;

    public static String explain(@enumtype(VkGeometryTypeKHR.class) int value) {
        return switch (value) {
            case VkGeometryTypeKHR.AABBS -> "VK_GEOMETRY_TYPE_AABBS_KHR";
            case VkGeometryTypeKHR.INSTANCES -> "VK_GEOMETRY_TYPE_INSTANCES_KHR";
            case VkGeometryTypeKHR.LINEAR_SWEPT_SPHERES_NV -> "VK_GEOMETRY_TYPE_LINEAR_SWEPT_SPHERES_NV";
            case VkGeometryTypeKHR.SPHERES_NV -> "VK_GEOMETRY_TYPE_SPHERES_NV";
            case VkGeometryTypeKHR.TRIANGLES -> "VK_GEOMETRY_TYPE_TRIANGLES_KHR";
            default -> "Unknown VkGeometryTypeKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkGeometryTypeKHR() {}
}
