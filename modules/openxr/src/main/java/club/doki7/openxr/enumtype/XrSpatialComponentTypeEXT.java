package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentTypeEXT.html"><code>XrSpatialComponentTypeEXT</code></a>
public final class XrSpatialComponentTypeEXT {
    public static final int BOUNDED_2D = 0x1;
    public static final int BOUNDED_3D = 0x2;
    public static final int PARENT = 0x3;
    public static final int MESH_3D = 0x4;
    public static final int PLANE_ALIGNMENT = 0x3ba61888;
    public static final int MESH_2D = 0x3ba61889;
    public static final int POLYGON_2D = 0x3ba6188a;
    public static final int PLANE_SEMANTIC_LABEL = 0x3ba6188b;
    public static final int MARKER = 0x3ba62058;
    public static final int ANCHOR = 0x3ba66a90;
    public static final int PERSISTENCE = 0x3ba66e78;

    public static String explain(@EnumType(XrSpatialComponentTypeEXT.class) int value) {
        return switch (value) {
            case XrSpatialComponentTypeEXT.ANCHOR -> "XR_SPATIAL_COMPONENT_TYPE_ANCHOR_EXT";
            case XrSpatialComponentTypeEXT.BOUNDED_2D -> "XR_SPATIAL_COMPONENT_TYPE_BOUNDED_2D_EXT";
            case XrSpatialComponentTypeEXT.BOUNDED_3D -> "XR_SPATIAL_COMPONENT_TYPE_BOUNDED_3D_EXT";
            case XrSpatialComponentTypeEXT.MARKER -> "XR_SPATIAL_COMPONENT_TYPE_MARKER_EXT";
            case XrSpatialComponentTypeEXT.MESH_2D -> "XR_SPATIAL_COMPONENT_TYPE_MESH_2D_EXT";
            case XrSpatialComponentTypeEXT.MESH_3D -> "XR_SPATIAL_COMPONENT_TYPE_MESH_3D_EXT";
            case XrSpatialComponentTypeEXT.PARENT -> "XR_SPATIAL_COMPONENT_TYPE_PARENT_EXT";
            case XrSpatialComponentTypeEXT.PERSISTENCE -> "XR_SPATIAL_COMPONENT_TYPE_PERSISTENCE_EXT";
            case XrSpatialComponentTypeEXT.PLANE_ALIGNMENT -> "XR_SPATIAL_COMPONENT_TYPE_PLANE_ALIGNMENT_EXT";
            case XrSpatialComponentTypeEXT.PLANE_SEMANTIC_LABEL -> "XR_SPATIAL_COMPONENT_TYPE_PLANE_SEMANTIC_LABEL_EXT";
            case XrSpatialComponentTypeEXT.POLYGON_2D -> "XR_SPATIAL_COMPONENT_TYPE_POLYGON_2D_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialComponentTypeEXT() {}
}
