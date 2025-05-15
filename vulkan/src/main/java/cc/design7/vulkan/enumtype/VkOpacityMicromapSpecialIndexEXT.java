package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpacityMicromapSpecialIndexEXT.html"><code>VkOpacityMicromapSpecialIndexEXT</code></a>
public final class VkOpacityMicromapSpecialIndexEXT {
    public static final int FULLY_TRANSPARENT = 0xffffffff;
    public static final int FULLY_OPAQUE = 0xfffffffe;
    public static final int FULLY_UNKNOWN_TRANSPARENT = 0xfffffffd;
    public static final int FULLY_UNKNOWN_OPAQUE = 0xfffffffc;
    public static final int CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV = 0xfffffffb;

    public static String explain(@enumtype(VkOpacityMicromapSpecialIndexEXT.class) int value) {
        return switch (value) {
            case VkOpacityMicromapSpecialIndexEXT.CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_CLUSTER_GEOMETRY_DISABLE_OPACITY_MICROMAP_NV";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_OPAQUE -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_OPAQUE_EXT";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_TRANSPARENT -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_TRANSPARENT_EXT";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_UNKNOWN_OPAQUE -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_OPAQUE_EXT";
            case VkOpacityMicromapSpecialIndexEXT.FULLY_UNKNOWN_TRANSPARENT -> "VK_OPACITY_MICROMAP_SPECIAL_INDEX_FULLY_UNKNOWN_TRANSPARENT_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkOpacityMicromapSpecialIndexEXT() {}
}
