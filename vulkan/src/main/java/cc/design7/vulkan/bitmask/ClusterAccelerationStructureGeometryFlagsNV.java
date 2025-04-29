package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureGeometryFlagsNV.html">VkClusterAccelerationStructureGeometryFlagsNV</a>
public final class ClusterAccelerationStructureGeometryFlagsNV {
    public static final int CULL_DISABLE = 0x1;
    public static final int NO_DUPLICATE_ANYHIT_INVOCATION = 0x2;
    public static final int OPAQUE = 0x4;

    public static String explain(@enumtype(ClusterAccelerationStructureGeometryFlagsNV.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & CULL_DISABLE) != 0) {
            detectedFlagBits.add("VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_CULL_DISABLE_BIT_NV");
        }
        if ((flags & NO_DUPLICATE_ANYHIT_INVOCATION) != 0) {
            detectedFlagBits.add("VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_NO_DUPLICATE_ANYHIT_INVOCATION_BIT_NV");
        }
        if ((flags & OPAQUE) != 0) {
            detectedFlagBits.add("VK_CLUSTER_ACCELERATION_STRUCTURE_GEOMETRY_OPAQUE_BIT_NV");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ClusterAccelerationStructureGeometryFlagsNV() {}
}
