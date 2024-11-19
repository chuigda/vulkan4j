package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkPipelineStageFlags2 {
    public static final long VK_PIPELINE_STAGE_2_NONE = 0L;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT = 1L;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT = 2L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT = 4L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT = 8L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT = 16L;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT = 32L;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT = 64L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT = 128L;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT = 256L;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT = 512L;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT = 1024L;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT = 2048L;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT = 4096L;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT = 8192L;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT = 16384L;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT = 32768L;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT = 65536L;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT = 4294967296L;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT = 8589934592L;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT = 17179869184L;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT = 34359738368L;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT = 68719476736L;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT = 137438953472L;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT = 274877906944L;
    public static final long VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR = 67108864L;
    public static final long VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR = 134217728L;
    public static final long VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT = 16777216L;
    public static final long VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 262144L;
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV = 131072L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 4194304L;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 33554432L;
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR = 2097152L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 8388608L;
    public static final long VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT = 524288L;
    public static final long VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT = 1048576L;
    public static final long VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI = 549755813888L;
    public static final long VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI = 1099511627776L;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_COPY_BIT_KHR = 268435456L;
    public static final long VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT = 1073741824L;
    public static final long VK_PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI = 2199023255552L;
    public static final long VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV = 536870912L;

    public static String explain(@enumtype(VkPipelineStageFlags2.class) long flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PIPELINE_STAGE_2_NONE) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_NONE");
        }

        if ((flags & VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_HOST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_HOST_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_COPY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_COPY_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_RESOLVE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_RESOLVE_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_BLIT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_BLIT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_CLEAR_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_CLEAR_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV");
        }

        if ((flags & VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_SUBPASS_SHADER_BIT_HUAWEI");
        }

        if ((flags & VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_INVOCATION_MASK_BIT_HUAWEI");
        }

        if ((flags & VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_COPY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_COPY_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_MICROMAP_BUILD_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_CLUSTER_CULLING_SHADER_BIT_HUAWEI");
        }

        if ((flags & VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV");
        }

        return sb.toString();
    }
}
