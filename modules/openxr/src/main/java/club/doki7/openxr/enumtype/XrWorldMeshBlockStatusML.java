package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockStatusML.html"><code>XrWorldMeshBlockStatusML</code></a>
public final class XrWorldMeshBlockStatusML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_STATUS_NEW_ML.html"><code>XR_WORLD_MESH_BLOCK_STATUS_NEW_ML</code></a>
    public static final int NEW = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_STATUS_UPDATED_ML.html"><code>XR_WORLD_MESH_BLOCK_STATUS_UPDATED_ML</code></a>
    public static final int UPDATED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_STATUS_DELETED_ML.html"><code>XR_WORLD_MESH_BLOCK_STATUS_DELETED_ML</code></a>
    public static final int DELETED = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML.html"><code>XR_WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML</code></a>
    public static final int UNCHANGED = 0x3;

    public static String explain(@EnumType(XrWorldMeshBlockStatusML.class) int value) {
        return switch (value) {
            case XrWorldMeshBlockStatusML.DELETED -> "XR_WORLD_MESH_BLOCK_STATUS_DELETED_ML";
            case XrWorldMeshBlockStatusML.NEW -> "XR_WORLD_MESH_BLOCK_STATUS_NEW_ML";
            case XrWorldMeshBlockStatusML.UNCHANGED -> "XR_WORLD_MESH_BLOCK_STATUS_UNCHANGED_ML";
            case XrWorldMeshBlockStatusML.UPDATED -> "XR_WORLD_MESH_BLOCK_STATUS_UPDATED_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrWorldMeshBlockStatusML() {}
}
