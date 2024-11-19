package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkAccessFlags {
    public static final int VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 1;
    public static final int VK_ACCESS_INDEX_READ_BIT = 2;
    public static final int VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 4;
    public static final int VK_ACCESS_UNIFORM_READ_BIT = 8;
    public static final int VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 16;
    public static final int VK_ACCESS_SHADER_READ_BIT = 32;
    public static final int VK_ACCESS_SHADER_WRITE_BIT = 64;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 128;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 256;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 512;
    public static final int VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 1024;
    public static final int VK_ACCESS_TRANSFER_READ_BIT = 2048;
    public static final int VK_ACCESS_TRANSFER_WRITE_BIT = 4096;
    public static final int VK_ACCESS_HOST_READ_BIT = 8192;
    public static final int VK_ACCESS_HOST_WRITE_BIT = 16384;
    public static final int VK_ACCESS_MEMORY_READ_BIT = 32768;
    public static final int VK_ACCESS_MEMORY_WRITE_BIT = 65536;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 33554432;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 67108864;
    public static final int VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 134217728;
    public static final int VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT = 1048576;
    public static final int VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 524288;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR = 2097152;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 4194304;
    public static final int VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 16777216;
    public static final int VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 8388608;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV = 131072;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV = 262144;

    public static String explain(@enumtype(VkAccessFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_ACCESS_INDIRECT_COMMAND_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_INDIRECT_COMMAND_READ_BIT");
        }

        if ((flags & VK_ACCESS_INDEX_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_INDEX_READ_BIT");
        }

        if ((flags & VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT");
        }

        if ((flags & VK_ACCESS_UNIFORM_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_UNIFORM_READ_BIT");
        }

        if ((flags & VK_ACCESS_INPUT_ATTACHMENT_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_INPUT_ATTACHMENT_READ_BIT");
        }

        if ((flags & VK_ACCESS_SHADER_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_SHADER_READ_BIT");
        }

        if ((flags & VK_ACCESS_SHADER_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_SHADER_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_COLOR_ATTACHMENT_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_COLOR_ATTACHMENT_READ_BIT");
        }

        if ((flags & VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT");
        }

        if ((flags & VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_TRANSFER_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_TRANSFER_READ_BIT");
        }

        if ((flags & VK_ACCESS_TRANSFER_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_TRANSFER_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_HOST_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_HOST_READ_BIT");
        }

        if ((flags & VK_ACCESS_HOST_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_HOST_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_MEMORY_READ_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_MEMORY_READ_BIT");
        }

        if ((flags & VK_ACCESS_MEMORY_WRITE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_MEMORY_WRITE_BIT");
        }

        if ((flags & VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT");
        }

        if ((flags & VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT");
        }

        if ((flags & VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT");
        }

        if ((flags & VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR");
        }

        if ((flags & VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR");
        }

        if ((flags & VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT");
        }

        if ((flags & VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR");
        }

        if ((flags & VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV");
        }

        if ((flags & VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV");
        }

        return sb.toString();
    }
}
