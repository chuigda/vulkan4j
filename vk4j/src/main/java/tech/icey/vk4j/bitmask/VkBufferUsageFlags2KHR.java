package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkBufferUsageFlags2KHR {
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR = 1L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR = 2L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR = 4L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR = 8L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR = 16L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR = 32L;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR = 64L;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR = 128L;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR = 256L;
    public static final long VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 33554432L;
    public static final long VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 512L;
    public static final long VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR = 1024L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 2048L;
    public static final long VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 4096L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR = 8192L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR = 16384L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR = 32768L;
    public static final long VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR = 65536L;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR = 131072L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 524288L;
    public static final long VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 1048576L;
    public static final long VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 2097152L;
    public static final long VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 4194304L;
    public static final long VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 67108864L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 8388608L;
    public static final long VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT = 16777216L;

    public static String explain(@enumtype(VkBufferUsageFlags2KHR.class) long flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_TRANSFER_DST_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX");
        }

        if ((flags & VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT");
        }

        return sb.toString();
    }
}
