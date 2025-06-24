package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshDetectorLodML.html"><code>XrWorldMeshDetectorLodML</code></a>
public final class XrWorldMeshDetectorLodML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_LOD_MINIMUM_ML.html"><code>XR_WORLD_MESH_DETECTOR_LOD_MINIMUM_ML</code></a>
    public static final int MINIMUM = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_LOD_MEDIUM_ML.html"><code>XR_WORLD_MESH_DETECTOR_LOD_MEDIUM_ML</code></a>
    public static final int MEDIUM = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML.html"><code>XR_WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML</code></a>
    public static final int MAXIMUM = 0x2;

    public static String explain(@EnumType(XrWorldMeshDetectorLodML.class) int value) {
        return switch (value) {
            case XrWorldMeshDetectorLodML.MAXIMUM -> "XR_WORLD_MESH_DETECTOR_LOD_MAXIMUM_ML";
            case XrWorldMeshDetectorLodML.MEDIUM -> "XR_WORLD_MESH_DETECTOR_LOD_MEDIUM_ML";
            case XrWorldMeshDetectorLodML.MINIMUM -> "XR_WORLD_MESH_DETECTOR_LOD_MINIMUM_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrWorldMeshDetectorLodML() {}
}
