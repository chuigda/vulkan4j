package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityComponentTypeBD.html"><code>XrSpatialEntityComponentTypeBD</code></a>
public final class XrSpatialEntityComponentTypeBD {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_ENTITY_COMPONENT_TYPE_LOCATION_BD.html"><code>XR_SPATIAL_ENTITY_COMPONENT_TYPE_LOCATION_BD</code></a>
    public static final int LOCATION = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_ENTITY_COMPONENT_TYPE_SEMANTIC_BD.html"><code>XR_SPATIAL_ENTITY_COMPONENT_TYPE_SEMANTIC_BD</code></a>
    public static final int SEMANTIC = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_2D_BD.html"><code>XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_2D_BD</code></a>
    public static final int BOUNDING_BOX_2D = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_ENTITY_COMPONENT_TYPE_POLYGON_BD.html"><code>XR_SPATIAL_ENTITY_COMPONENT_TYPE_POLYGON_BD</code></a>
    public static final int POLYGON = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_3D_BD.html"><code>XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_3D_BD</code></a>
    public static final int BOUNDING_BOX_3D = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_ENTITY_COMPONENT_TYPE_TRIANGLE_MESH_BD.html"><code>XR_SPATIAL_ENTITY_COMPONENT_TYPE_TRIANGLE_MESH_BD</code></a>
    public static final int TRIANGLE_MESH = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_ENTITY_COMPONENT_TYPE_PLANE_ORIENTATION_BD.html"><code>XR_SPATIAL_ENTITY_COMPONENT_TYPE_PLANE_ORIENTATION_BD</code></a>
    public static final int PLANE_ORIENTATION = 0x3ba0d4e0;

    public static String explain(@EnumType(XrSpatialEntityComponentTypeBD.class) int value) {
        return switch (value) {
            case XrSpatialEntityComponentTypeBD.BOUNDING_BOX_2D -> "XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_2D_BD";
            case XrSpatialEntityComponentTypeBD.BOUNDING_BOX_3D -> "XR_SPATIAL_ENTITY_COMPONENT_TYPE_BOUNDING_BOX_3D_BD";
            case XrSpatialEntityComponentTypeBD.LOCATION -> "XR_SPATIAL_ENTITY_COMPONENT_TYPE_LOCATION_BD";
            case XrSpatialEntityComponentTypeBD.PLANE_ORIENTATION -> "XR_SPATIAL_ENTITY_COMPONENT_TYPE_PLANE_ORIENTATION_BD";
            case XrSpatialEntityComponentTypeBD.POLYGON -> "XR_SPATIAL_ENTITY_COMPONENT_TYPE_POLYGON_BD";
            case XrSpatialEntityComponentTypeBD.SEMANTIC -> "XR_SPATIAL_ENTITY_COMPONENT_TYPE_SEMANTIC_BD";
            case XrSpatialEntityComponentTypeBD.TRIANGLE_MESH -> "XR_SPATIAL_ENTITY_COMPONENT_TYPE_TRIANGLE_MESH_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialEntityComponentTypeBD() {}
}
