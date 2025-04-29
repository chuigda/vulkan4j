package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpacityMicromapSpecialIndexEXT.html">VkOpacityMicromapSpecialIndexEXT</a>
public final class VkOpacityMicromapSpecialIndexEXT {
    public static final int FULLY_TRANSPARENT = -1;
    public static final int FULLY_OPAQUE = -2;
    public static final int FULLY_UNKNOWN_TRANSPARENT = -3;
    public static final int FULLY_UNKNOWN_OPAQUE = -4;
    public static final int CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV = [-5];

    public static String explain(@enumtype(VkOpacityMicromapSpecialIndexEXT.class) int value) {
        return switch (value) {
            case VkOpacityMicromapSpecialIndexEXT.CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_OPAQUE -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_TRANSPARENT -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_UNKNOWN_OPAQUE -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_UNKNOWN_TRANSPARENT -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT";
            default -> "Unknown VkOpacityMicromapSpecialIndexEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkOpacityMicromapSpecialIndexEXT() {}
}
