package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryPipelineStatisticFlags.html">VkQueryPipelineStatisticFlags</a>
public final class VkQueryPipelineStatisticFlags {
    public static final int QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS = 0x20;
    public static final int QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES = 0x40;
    public static final int QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_HUAWEI = 0x2000;
    public static final int QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS = 0x400;
    public static final int QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS = 0x80;
    public static final int QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS = 0x8;
    public static final int QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES = 0x10;
    public static final int QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES = 0x2;
    public static final int QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES = 0x1;
    public static final int QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_EXT = 0x1000;
    public static final int QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_EXT = 0x800;
    public static final int QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES = 0x100;
    public static final int QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS = 0x200;
    public static final int QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS = 0x4;

    public static String explain(@enumtype(VkQueryPipelineStatisticFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_HUAWEI) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_CLUSTER_CULLING_SHADER_INVOCATIONS_BIT_HUAWEI");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_EXT) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_BIT_EXT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_EXT) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_BIT_EXT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT");
        }
        if ((flags & QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS) != 0) {
            detectedFlagBits.add("VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkQueryPipelineStatisticFlags() {}
}
