package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPrimitiveTopology.html">VkPrimitiveTopology</a>
public final class VkPrimitiveTopology {
    public static final int POINT_LIST = 0;
    public static final int LINE_LIST = 1;
    public static final int LINE_STRIP = 2;
    public static final int TRIANGLE_LIST = 3;
    public static final int TRIANGLE_STRIP = 4;
    public static final int TRIANGLE_FAN = 5;
    public static final int LINE_LIST_WITH_ADJACENCY = 6;
    public static final int LINE_STRIP_WITH_ADJACENCY = 7;
    public static final int TRIANGLE_LIST_WITH_ADJACENCY = 8;
    public static final int TRIANGLE_STRIP_WITH_ADJACENCY = 9;
    public static final int PATCH_LIST = 10;

    public static String explain(@enumtype(VkPrimitiveTopology.class) int value) {
        return switch (value) {
            case VkPrimitiveTopology.LINE_LIST -> "VK_PRIMITIVE_TOPOLOGY_LINE_LIST";
            case VkPrimitiveTopology.LINE_LIST_WITH_ADJACENCY -> "VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY";
            case VkPrimitiveTopology.LINE_STRIP -> "VK_PRIMITIVE_TOPOLOGY_LINE_STRIP";
            case VkPrimitiveTopology.LINE_STRIP_WITH_ADJACENCY -> "VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY";
            case VkPrimitiveTopology.PATCH_LIST -> "VK_PRIMITIVE_TOPOLOGY_PATCH_LIST";
            case VkPrimitiveTopology.POINT_LIST -> "VK_PRIMITIVE_TOPOLOGY_POINT_LIST";
            case VkPrimitiveTopology.TRIANGLE_FAN -> "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN";
            case VkPrimitiveTopology.TRIANGLE_LIST -> "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST";
            case VkPrimitiveTopology.TRIANGLE_LIST_WITH_ADJACENCY -> "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY";
            case VkPrimitiveTopology.TRIANGLE_STRIP -> "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP";
            case VkPrimitiveTopology.TRIANGLE_STRIP_WITH_ADJACENCY -> "VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY";
            default -> "Unknown VkPrimitiveTopology: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPrimitiveTopology() {}
}
