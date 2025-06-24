package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMeshLodBD.html"><code>XrSpatialMeshLodBD</code></a>
public final class XrSpatialMeshLodBD {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MESH_LOD_COARSE_BD.html"><code>XR_SPATIAL_MESH_LOD_COARSE_BD</code></a>
    public static final int COARSE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MESH_LOD_MEDIUM_BD.html"><code>XR_SPATIAL_MESH_LOD_MEDIUM_BD</code></a>
    public static final int MEDIUM = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MESH_LOD_FINE_BD.html"><code>XR_SPATIAL_MESH_LOD_FINE_BD</code></a>
    public static final int FINE = 0x2;

    public static String explain(@EnumType(XrSpatialMeshLodBD.class) int value) {
        return switch (value) {
            case XrSpatialMeshLodBD.COARSE -> "XR_SPATIAL_MESH_LOD_COARSE_BD";
            case XrSpatialMeshLodBD.FINE -> "XR_SPATIAL_MESH_LOD_FINE_BD";
            case XrSpatialMeshLodBD.MEDIUM -> "XR_SPATIAL_MESH_LOD_MEDIUM_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialMeshLodBD() {}
}
