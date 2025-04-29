package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureIndexFormatFlagsNV.html">VkClusterAccelerationStructureIndexFormatFlagsNV</a>
public final class ClusterAccelerationStructureIndexFormatFlagsNV {
    public static final int _16BIT = 0x2;
    public static final int _32BIT = 0x4;
    public static final int _8BIT = 0x1;
    
    public static String explain(@enumtype(ClusterAccelerationStructureIndexFormatFlagsNV.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & _16BIT) != 0) {
            detectedFlagBits.add("VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_16BIT_NV");
        }
        if ((flags & _32BIT) != 0) {
            detectedFlagBits.add("VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_32BIT_NV");
        }
        if ((flags & _8BIT) != 0) {
            detectedFlagBits.add("VK_CLUSTER_ACCELERATION_STRUCTURE_INDEX_FORMAT_8BIT_NV");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private ClusterAccelerationStructureIndexFormatFlagsNV() {}
}
