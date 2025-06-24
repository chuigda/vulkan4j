package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComponentTypeMSFT.html"><code>XrSceneComponentTypeMSFT</code></a>
public final class XrSceneComponentTypeMSFT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPONENT_TYPE_INVALID_MSFT.html"><code>XR_SCENE_COMPONENT_TYPE_INVALID_MSFT</code></a>
    public static final int INVALID = 0xffffffff;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT.html"><code>XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT</code></a>
    public static final int OBJECT = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPONENT_TYPE_PLANE_MSFT.html"><code>XR_SCENE_COMPONENT_TYPE_PLANE_MSFT</code></a>
    public static final int PLANE = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT.html"><code>XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT</code></a>
    public static final int VISUAL_MESH = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT.html"><code>XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT</code></a>
    public static final int COLLIDER_MESH = 0x4;

    public static String explain(@EnumType(XrSceneComponentTypeMSFT.class) int value) {
        return switch (value) {
            case XrSceneComponentTypeMSFT.COLLIDER_MESH -> "XR_SCENE_COMPONENT_TYPE_COLLIDER_MESH_MSFT";
            case XrSceneComponentTypeMSFT.INVALID -> "XR_SCENE_COMPONENT_TYPE_INVALID_MSFT";
            case XrSceneComponentTypeMSFT.OBJECT -> "XR_SCENE_COMPONENT_TYPE_OBJECT_MSFT";
            case XrSceneComponentTypeMSFT.PLANE -> "XR_SCENE_COMPONENT_TYPE_PLANE_MSFT";
            case XrSceneComponentTypeMSFT.VISUAL_MESH -> "XR_SCENE_COMPONENT_TYPE_VISUAL_MESH_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneComponentTypeMSFT() {}
}
