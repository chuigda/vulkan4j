package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkAccessFlags2 {
    public static final long VK_ACCESS_2_NONE = 0L;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT = 1L;
    public static final long VK_ACCESS_2_INDEX_READ_BIT = 2L;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT = 4L;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT = 8L;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT = 16L;
    public static final long VK_ACCESS_2_SHADER_READ_BIT = 32L;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT = 64L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT = 128L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT = 256L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512L;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024L;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT = 2048L;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT = 4096L;
    public static final long VK_ACCESS_2_HOST_READ_BIT = 8192L;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT = 16384L;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT = 32768L;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT = 65536L;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT = 4294967296L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT = 8589934592L;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT = 17179869184L;
    public static final long VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR = 34359738368L;
    public static final long VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR = 68719476736L;
    public static final long VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR = 137438953472L;
    public static final long VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR = 274877906944L;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 33554432L;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 67108864L;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 134217728L;
    public static final long VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT = 1048576L;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV = 131072L;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV = 262144L;
    public static final long VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 8388608L;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR = 2097152L;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 4194304L;
    public static final long VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 16777216L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 524288L;
    public static final long VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT = 2199023255552L;
    public static final long VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI = 549755813888L;
    public static final long VK_ACCESS_2_SHADER_BINDING_TABLE_READ_BIT_KHR = 1099511627776L;
    public static final long VK_ACCESS_2_MICROMAP_READ_BIT_EXT = 17592186044416L;
    public static final long VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT = 35184372088832L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV = 4398046511104L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV = 8796093022208L;

    public static String explain(@enumtype(VkAccessFlags2.class) long flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_ACCESS_2_NONE) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_NONE");
        }

        if ((flags & VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_INDEX_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_INDEX_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_UNIFORM_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_UNIFORM_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_SHADER_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_SHADER_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_SHADER_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_SHADER_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_2_TRANSFER_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_TRANSFER_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_TRANSFER_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_TRANSFER_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_2_HOST_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_HOST_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_HOST_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_HOST_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_2_MEMORY_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_MEMORY_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_MEMORY_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_MEMORY_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_2_SHADER_SAMPLED_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_SHADER_SAMPLED_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_SHADER_STORAGE_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_SHADER_STORAGE_READ_BIT");
        }

        if ((flags & VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV");
        }

        if ((flags & VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV");
        }

        if ((flags & VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_INVOCATION_MASK_READ_BIT_HUAWEI");
        }

        if ((flags & VK_ACCESS_2_SHADER_BINDING_TABLE_READ_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_SHADER_BINDING_TABLE_READ_BIT_KHR");
        }

        if ((flags & VK_ACCESS_2_MICROMAP_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_MICROMAP_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_MICROMAP_WRITE_BIT_EXT");
        }

        if ((flags & VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV");
        }

        if ((flags & VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV");
        }

        return sb.toString();
    }
}
