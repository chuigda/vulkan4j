package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkShaderStageFlags {
    public static final int VK_SHADER_STAGE_VERTEX_BIT = 1;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 2;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 4;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 8;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 16;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = 32;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 31;
    public static final int VK_SHADER_STAGE_ALL = 2147483647;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_KHR = 256;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_KHR = 512;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR = 1024;
    public static final int VK_SHADER_STAGE_MISS_BIT_KHR = 2048;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_KHR = 4096;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_KHR = 8192;
    public static final int VK_SHADER_STAGE_TASK_BIT_EXT = 64;
    public static final int VK_SHADER_STAGE_MESH_BIT_EXT = 128;
    public static final int VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI = 16384;
    public static final int VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI = 524288;

    public static String explain(@enumtype(VkShaderStageFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SHADER_STAGE_VERTEX_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_VERTEX_BIT");
        }

        if ((flags & VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT");
        }

        if ((flags & VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT");
        }

        if ((flags & VK_SHADER_STAGE_GEOMETRY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_GEOMETRY_BIT");
        }

        if ((flags & VK_SHADER_STAGE_FRAGMENT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_FRAGMENT_BIT");
        }

        if ((flags & VK_SHADER_STAGE_COMPUTE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_COMPUTE_BIT");
        }

        if ((flags & VK_SHADER_STAGE_ALL_GRAPHICS) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_ALL_GRAPHICS");
        }

        if ((flags & VK_SHADER_STAGE_ALL) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_ALL");
        }

        if ((flags & VK_SHADER_STAGE_RAYGEN_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_RAYGEN_BIT_KHR");
        }

        if ((flags & VK_SHADER_STAGE_ANY_HIT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_ANY_HIT_BIT_KHR");
        }

        if ((flags & VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR");
        }

        if ((flags & VK_SHADER_STAGE_MISS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_MISS_BIT_KHR");
        }

        if ((flags & VK_SHADER_STAGE_INTERSECTION_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_INTERSECTION_BIT_KHR");
        }

        if ((flags & VK_SHADER_STAGE_CALLABLE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_CALLABLE_BIT_KHR");
        }

        if ((flags & VK_SHADER_STAGE_TASK_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_TASK_BIT_EXT");
        }

        if ((flags & VK_SHADER_STAGE_MESH_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_MESH_BIT_EXT");
        }

        if ((flags & VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI");
        }

        if ((flags & VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI");
        }

        return sb.toString();
    }
}
