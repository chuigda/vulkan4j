package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComputeFeatureMSFT.html"><code>XrSceneComputeFeatureMSFT</code></a>
public final class XrSceneComputeFeatureMSFT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT.html"><code>XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT</code></a>
    public static final int PLANE = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT.html"><code>XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT</code></a>
    public static final int PLANE_MESH = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT.html"><code>XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT</code></a>
    public static final int VISUAL_MESH = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT.html"><code>XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT</code></a>
    public static final int COLLIDER_MESH = 0x4;

    public static String explain(@EnumType(XrSceneComputeFeatureMSFT.class) int value) {
        return switch (value) {
            case XrSceneComputeFeatureMSFT.COLLIDER_MESH -> "XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT";
            case XrSceneComputeFeatureMSFT.PLANE_MESH -> "XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT";
            case XrSceneComputeFeatureMSFT.PLANE -> "XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT";
            case XrSceneComputeFeatureMSFT.VISUAL_MESH -> "XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneComputeFeatureMSFT() {}
}
