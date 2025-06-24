package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockResultML.html"><code>XrWorldMeshBlockResultML</code></a>
public final class XrWorldMeshBlockResultML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_RESULT_SUCCESS_ML.html"><code>XR_WORLD_MESH_BLOCK_RESULT_SUCCESS_ML</code></a>
    public static final int SUCCESS = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_RESULT_FAILED_ML.html"><code>XR_WORLD_MESH_BLOCK_RESULT_FAILED_ML</code></a>
    public static final int FAILED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_RESULT_PENDING_ML.html"><code>XR_WORLD_MESH_BLOCK_RESULT_PENDING_ML</code></a>
    public static final int PENDING = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML.html"><code>XR_WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML</code></a>
    public static final int PARTIAL_UPDATE = 0x3;

    public static String explain(@EnumType(XrWorldMeshBlockResultML.class) int value) {
        return switch (value) {
            case XrWorldMeshBlockResultML.FAILED -> "XR_WORLD_MESH_BLOCK_RESULT_FAILED_ML";
            case XrWorldMeshBlockResultML.PARTIAL_UPDATE -> "XR_WORLD_MESH_BLOCK_RESULT_PARTIAL_UPDATE_ML";
            case XrWorldMeshBlockResultML.PENDING -> "XR_WORLD_MESH_BLOCK_RESULT_PENDING_ML";
            case XrWorldMeshBlockResultML.SUCCESS -> "XR_WORLD_MESH_BLOCK_RESULT_SUCCESS_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrWorldMeshBlockResultML() {}
}
