package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkGeometryTypeKHR {
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_KHR = 0;
    public static final int VK_GEOMETRY_TYPE_AABBS_KHR = 1;
    public static final int VK_GEOMETRY_TYPE_INSTANCES_KHR = 2;

    public static String explain(@enumtype(VkGeometryTypeKHR.class) int value) {
        return switch (value) {
            case VK_GEOMETRY_TYPE_TRIANGLES_KHR -> "VK_GEOMETRY_TYPE_TRIANGLES_KHR";
            case VK_GEOMETRY_TYPE_AABBS_KHR -> "VK_GEOMETRY_TYPE_AABBS_KHR";
            case VK_GEOMETRY_TYPE_INSTANCES_KHR -> "VK_GEOMETRY_TYPE_INSTANCES_KHR";
            default -> "Unknown";
        };
    }
}
