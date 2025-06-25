package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceComponentTypeFB.html"><code>XrSpaceComponentTypeFB</code></a>
public final class XrSpaceComponentTypeFB {
    public static final int LOCATABLE = 0x0;
    public static final int STORABLE = 0x1;
    public static final int SHARABLE = 0x2;
    public static final int BOUNDED_2D = 0x3;
    public static final int BOUNDED_3D = 0x4;
    public static final int SEMANTIC_LABELS = 0x5;
    public static final int ROOM_LAYOUT = 0x6;
    public static final int SPACE_CONTAINER = 0x7;
    public static final int TRIANGLE_MESH_META = 0x3b9ee4c8;

    public static String explain(@EnumType(XrSpaceComponentTypeFB.class) int value) {
        return switch (value) {
            case XrSpaceComponentTypeFB.BOUNDED_2D -> "XR_SPACE_COMPONENT_TYPE_BOUNDED_2D_FB";
            case XrSpaceComponentTypeFB.BOUNDED_3D -> "XR_SPACE_COMPONENT_TYPE_BOUNDED_3D_FB";
            case XrSpaceComponentTypeFB.LOCATABLE -> "XR_SPACE_COMPONENT_TYPE_LOCATABLE_FB";
            case XrSpaceComponentTypeFB.ROOM_LAYOUT -> "XR_SPACE_COMPONENT_TYPE_ROOM_LAYOUT_FB";
            case XrSpaceComponentTypeFB.SEMANTIC_LABELS -> "XR_SPACE_COMPONENT_TYPE_SEMANTIC_LABELS_FB";
            case XrSpaceComponentTypeFB.SHARABLE -> "XR_SPACE_COMPONENT_TYPE_SHARABLE_FB";
            case XrSpaceComponentTypeFB.SPACE_CONTAINER -> "XR_SPACE_COMPONENT_TYPE_SPACE_CONTAINER_FB";
            case XrSpaceComponentTypeFB.STORABLE -> "XR_SPACE_COMPONENT_TYPE_STORABLE_FB";
            case XrSpaceComponentTypeFB.TRIANGLE_MESH_META -> "XR_SPACE_COMPONENT_TYPE_TRIANGLE_MESH_META";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpaceComponentTypeFB() {}
}
