package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkPipelineCreateFlags2KHR {
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR = 1L;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR = 2L;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR = 4L;
    public static final long VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT = 17179869184L;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 8L;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR = 16L;
    public static final long VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV = 32L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR = 64L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 128L;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR = 256L;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR = 512L;
    public static final long VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT = 1024L;
    public static final long VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT = 8388608L;
    public static final long VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR = 2048L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR = 4096L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR = 8192L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR = 16384L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR = 32768L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR = 65536L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR = 131072L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 524288L;
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV = 262144L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV = 1048576L;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 2097152L;
    public static final long VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 4194304L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT = 16777216L;
    public static final long VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 33554432L;
    public static final long VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT = 67108864L;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT = 134217728L;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT = 1073741824L;
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV = 268435456L;
    public static final long VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT = 536870912L;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR = 2147483648L;

    public static String explain(@enumtype(VkPipelineCreateFlags2KHR.class) long flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_DERIVATIVE_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_ENABLE_LEGACY_DITHERING_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_DEFER_COMPILE_BIT_NV");
        }

        if ((flags & VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_CAPTURE_STATISTICS_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_LINK_TIME_OPTIMIZATION_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_LIBRARY_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_AABBS_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_NV");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_MOTION_BIT_NV");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV");
        }

        if ((flags & VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_DESCRIPTOR_BUFFER_BIT_EXT");
        }

        if ((flags & VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR");
        }

        return sb.toString();
    }
}
