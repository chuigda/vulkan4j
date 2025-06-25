package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshDetectorFlagsML.html"><code>XrWorldMeshDetectorFlagsML</code></a>
public final class XrWorldMeshDetectorFlagsML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML.html"><code>XR_WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML</code></a>
    public static final long COMPUTE_CONFIDENCE = 0x4L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML.html"><code>XR_WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML</code></a>
    public static final long COMPUTE_NORMALS = 0x2L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML.html"><code>XR_WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML</code></a>
    public static final long INDEX_ORDER_CW = 0x20L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML.html"><code>XR_WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML</code></a>
    public static final long PLANARIZE = 0x8L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML.html"><code>XR_WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML</code></a>
    public static final long POINT_CLOUD = 0x1L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML.html"><code>XR_WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML</code></a>
    public static final long REMOVE_MESH_SKIRT = 0x10L;

    public static String explain(@Bitmask(XrWorldMeshDetectorFlagsML.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COMPUTE_CONFIDENCE) != 0) {
            detectedFlagBits.add("XR_WORLD_MESH_DETECTOR_COMPUTE_CONFIDENCE_BIT_ML");
        }
        if ((flags & COMPUTE_NORMALS) != 0) {
            detectedFlagBits.add("XR_WORLD_MESH_DETECTOR_COMPUTE_NORMALS_BIT_ML");
        }
        if ((flags & INDEX_ORDER_CW) != 0) {
            detectedFlagBits.add("XR_WORLD_MESH_DETECTOR_INDEX_ORDER_CW_BIT_ML");
        }
        if ((flags & PLANARIZE) != 0) {
            detectedFlagBits.add("XR_WORLD_MESH_DETECTOR_PLANARIZE_BIT_ML");
        }
        if ((flags & POINT_CLOUD) != 0) {
            detectedFlagBits.add("XR_WORLD_MESH_DETECTOR_POINT_CLOUD_BIT_ML");
        }
        if ((flags & REMOVE_MESH_SKIRT) != 0) {
            detectedFlagBits.add("XR_WORLD_MESH_DETECTOR_REMOVE_MESH_SKIRT_BIT_ML");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrWorldMeshDetectorFlagsML() {}
}
