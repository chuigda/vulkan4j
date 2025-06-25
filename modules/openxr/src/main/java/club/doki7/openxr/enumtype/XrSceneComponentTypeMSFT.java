package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentTypeMSFT.html"><code>XrSceneComponentTypeMSFT</code></a>
public final class XrSceneComponentTypeMSFT {
    public static final int INVALID = 0xffffffff;
    public static final int OBJECT = 0x1;
    public static final int PLANE = 0x2;
    public static final int VISUAL_MESH = 0x3;
    public static final int COLLIDER_MESH = 0x4;
    public static final int SERIALIZED_SCENE_FRAGMENT = 0x3b9c48d0;
    public static final int MARKER = 0x3b9d0838;

    public static String explain(@EnumType(XrSceneComponentTypeMSFT.class) int value) {
        return switch (value) {
            case XrSceneComponentTypeMSFT.COLLIDER_MESH -> "XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT";
            case XrSceneComponentTypeMSFT.INVALID -> "XR_SCENE_COMPONENT_TYPE_INVALID_MSFT";
            case XrSceneComponentTypeMSFT.MARKER -> "XR_SCENE_COMPONENT_TYPE_MARKER_MSFT";
            case XrSceneComponentTypeMSFT.OBJECT -> "XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT";
            case XrSceneComponentTypeMSFT.PLANE -> "XR_SCENE_COMPONENT_TYPE_PLANE_MSFT";
            case XrSceneComponentTypeMSFT.SERIALIZED_SCENE_FRAGMENT -> "XR_SCENE_COMPONENT_TYPE_SERIALIZED_SCENE_FRAGMENT_MSFT";
            case XrSceneComponentTypeMSFT.VISUAL_MESH -> "XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneComponentTypeMSFT() {}
}
