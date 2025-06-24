package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentTypeEXT.html"><code>XrSpatialComponentTypeEXT</code></a>
public final class XrSpatialComponentTypeEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_COMPONENT_TYPE_BOUNDED_2D_EXT.html"><code>XR_SPATIAL_COMPONENT_TYPE_BOUNDED_2D_EXT</code></a>
    public static final int BOUNDED_2D = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_COMPONENT_TYPE_BOUNDED_3D_EXT.html"><code>XR_SPATIAL_COMPONENT_TYPE_BOUNDED_3D_EXT</code></a>
    public static final int BOUNDED_3D = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_COMPONENT_TYPE_PARENT_EXT.html"><code>XR_SPATIAL_COMPONENT_TYPE_PARENT_EXT</code></a>
    public static final int PARENT = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_COMPONENT_TYPE_MESH_3D_EXT.html"><code>XR_SPATIAL_COMPONENT_TYPE_MESH_3D_EXT</code></a>
    public static final int MESH_3D = 0x4;

    public static String explain(@EnumType(XrSpatialComponentTypeEXT.class) int value) {
        return switch (value) {
            case XrSpatialComponentTypeEXT.BOUNDED_2D -> "XR_SPATIAL_COMPONENT_TYPE_BOUNDED_2D_EXT";
            case XrSpatialComponentTypeEXT.BOUNDED_3D -> "XR_SPATIAL_COMPONENT_TYPE_BOUNDED_3D_EXT";
            case XrSpatialComponentTypeEXT.MESH_3D -> "XR_SPATIAL_COMPONENT_TYPE_MESH_3D_EXT";
            case XrSpatialComponentTypeEXT.PARENT -> "XR_SPATIAL_COMPONENT_TYPE_PARENT_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialComponentTypeEXT() {}
}
