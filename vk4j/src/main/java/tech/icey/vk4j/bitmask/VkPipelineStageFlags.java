package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkPipelineStageFlags {
    public static final int VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 1;
    public static final int VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 2;
    public static final int VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 4;
    public static final int VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 8;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 16;
    public static final int VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 32;
    public static final int VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 64;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 128;
    public static final int VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 256;
    public static final int VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 512;
    public static final int VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 1024;
    public static final int VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 2048;
    public static final int VK_PIPELINE_STAGE_TRANSFER_BIT = 4096;
    public static final int VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 8192;
    public static final int VK_PIPELINE_STAGE_HOST_BIT = 16384;
    public static final int VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 32768;
    public static final int VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 65536;
    public static final int VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT = 16777216;
    public static final int VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT = 262144;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 33554432;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR = 2097152;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 8388608;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 4194304;
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV = 131072;
    public static final int VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT = 524288;
    public static final int VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT = 1048576;

    public static String explain(@enumtype(VkPipelineStageFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_VERTEX_INPUT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_VERTEX_INPUT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_VERTEX_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_VERTEX_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_TRANSFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_TRANSFER_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_HOST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_HOST_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_ALL_COMMANDS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_ALL_COMMANDS_BIT");
        }

        if ((flags & VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV");
        }

        if ((flags & VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT");
        }

        return sb.toString();
    }
}
