package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComputeFeatureMSFT.html"><code>XrSceneComputeFeatureMSFT</code></a>
public final class XrSceneComputeFeatureMSFT {
    public static final int PLANE = 0x1;
    public static final int PLANE_MESH = 0x2;
    public static final int VISUAL_MESH = 0x3;
    public static final int COLLIDER_MESH = 0x4;
    public static final int SERIALIZE_SCENE = 0x3b9c48d0;
    public static final int MARKER = 0x3b9d0838;

    public static String explain(@EnumType(XrSceneComputeFeatureMSFT.class) int value) {
        return switch (value) {
            case XrSceneComputeFeatureMSFT.COLLIDER_MESH -> "XR_SCENE_COMPUTE_FEATURE_COLLIDER_MESH_MSFT";
            case XrSceneComputeFeatureMSFT.MARKER -> "XR_SCENE_COMPUTE_FEATURE_MARKER_MSFT";
            case XrSceneComputeFeatureMSFT.PLANE_MESH -> "XR_SCENE_COMPUTE_FEATURE_PLANE_MESH_MSFT";
            case XrSceneComputeFeatureMSFT.PLANE -> "XR_SCENE_COMPUTE_FEATURE_PLANE_MSFT";
            case XrSceneComputeFeatureMSFT.SERIALIZE_SCENE -> "XR_SCENE_COMPUTE_FEATURE_SERIALIZE_SCENE_MSFT";
            case XrSceneComputeFeatureMSFT.VISUAL_MESH -> "XR_SCENE_COMPUTE_FEATURE_VISUAL_MESH_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneComputeFeatureMSFT() {}
}
