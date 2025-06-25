package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMeshConfigFlagsBD.html"><code>XrSpatialMeshConfigFlagsBD</code></a>
public final class XrSpatialMeshConfigFlagsBD {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MESH_CONFIG_ALIGN_SEMANTIC_WITH_VERTEX_BIT_BD.html"><code>XR_SPATIAL_MESH_CONFIG_ALIGN_SEMANTIC_WITH_VERTEX_BIT_BD</code></a>
    public static final long ALIGN_SEMANTIC_WITH_VERTEX = 0x2L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_MESH_CONFIG_SEMANTIC_BIT_BD.html"><code>XR_SPATIAL_MESH_CONFIG_SEMANTIC_BIT_BD</code></a>
    public static final long SEMANTIC = 0x1L;

    public static String explain(@Bitmask(XrSpatialMeshConfigFlagsBD.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ALIGN_SEMANTIC_WITH_VERTEX) != 0) {
            detectedFlagBits.add("XR_SPATIAL_MESH_CONFIG_ALIGN_SEMANTIC_WITH_VERTEX_BIT_BD");
        }
        if ((flags & SEMANTIC) != 0) {
            detectedFlagBits.add("XR_SPATIAL_MESH_CONFIG_SEMANTIC_BIT_BD");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialMeshConfigFlagsBD() {}
}
