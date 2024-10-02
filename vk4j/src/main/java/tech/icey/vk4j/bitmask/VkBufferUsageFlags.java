package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkBufferUsageFlags {
    public static final int VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 1;
    public static final int VK_BUFFER_USAGE_TRANSFER_DST_BIT = 2;
    public static final int VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 4;
    public static final int VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 8;
    public static final int VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 16;
    public static final int VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 32;
    public static final int VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 64;
    public static final int VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 128;
    public static final int VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 256;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT = 131072;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 8192;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR = 16384;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT = 2048;
    public static final int VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT = 4096;
    public static final int VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT = 512;
    public static final int VK_BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 33554432;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR = 524288;
    public static final int VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR = 1048576;
    public static final int VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR = 1024;
    public static final int VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 32768;
    public static final int VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 65536;
    public static final int VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 2097152;
    public static final int VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 4194304;
    public static final int VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 67108864;
    public static final int VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT = 8388608;
    public static final int VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT = 16777216;

    public static String explain(@enumtype(VkBufferUsageFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_BUFFER_USAGE_TRANSFER_SRC_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_TRANSFER_SRC_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_TRANSFER_DST_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_TRANSFER_DST_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_STORAGE_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_STORAGE_BUFFER_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_INDEX_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_INDEX_BUFFER_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_VERTEX_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_VERTEX_BUFFER_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT");
        }

        if ((flags & VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX");
        }

        if ((flags & VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR");
        }

        if ((flags & VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT");
        }

        if ((flags & VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUFFER_USAGE_MICROMAP_STORAGE_BIT_EXT");
        }

        return sb.toString();
    }
}
