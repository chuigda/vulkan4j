package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCreateFlags.html">VkPipelineCreateFlags</a>
public final class VkPipelineCreateFlags {
    public static final int PIPELINE_CREATE_ALLOW_DERIVATIVES = 0x2;
    public static final int PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_KHR = 0x80;
    public static final int PIPELINE_CREATE_CAPTURE_STATISTICS_KHR = 0x40;
    public static final int PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_EXT = 0x2000000;
    public static final int PIPELINE_CREATE_DEFER_COMPILE_NV = 0x20;
    public static final int PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_EXT = 0x4000000;
    public static final int PIPELINE_CREATE_DERIVATIVE = 0x4;
    public static final int PIPELINE_CREATE_DESCRIPTOR_BUFFER_EXT = 0x20000000;
    public static final int PIPELINE_CREATE_DISABLE_OPTIMIZATION = 0x1;
    public static final int PIPELINE_CREATE_DISPATCH_BASE = 0x10;
    public static final int PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE = 0x200;
    public static final int PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED = 0x100;
    public static final int PIPELINE_CREATE_INDIRECT_BINDABLE_NV = 0x40000;
    public static final int PIPELINE_CREATE_LIBRARY_KHR = 0x800;
    public static final int PIPELINE_CREATE_LINK_TIME_OPTIMIZATION_EXT = 0x400;
    public static final int PIPELINE_CREATE_NO_PROTECTED_ACCESS = 0x8000000;
    public static final int PIPELINE_CREATE_PROTECTED_ACCESS_ONLY = 0x40000000;
    public static final int PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_NV = 0x100000;
    public static final int PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_NV = 0x10000000;
    public static final int PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_KHR = 0x4000;
    public static final int PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_KHR = 0x8000;
    public static final int PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_KHR = 0x20000;
    public static final int PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_KHR = 0x10000;
    public static final int PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_EXT = 0x1000000;
    public static final int PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_KHR = 0x80000;
    public static final int PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_KHR = 0x2000;
    public static final int PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_KHR = 0x1000;
    public static final int PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_EXT = 0x400000;
    public static final int PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_KHR = 0x200000;
    public static final int PIPELINE_CREATE_RETAIN_LINK_TIME_OPTIMIZATION_INFO_EXT = 0x800000;
    public static final int PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX = 0x8;

    public static String explain(@enumtype(VkPipelineCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PIPELINE_CREATE_ALLOW_DERIVATIVES) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT");
        }
        if ((flags & PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_CAPTURE_STATISTICS_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_COLOR_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT");
        }
        if ((flags & PIPELINE_CREATE_DEFER_COMPILE_NV) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV");
        }
        if ((flags & PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_DEPTH_STENCIL_ATTACHMENT_FEEDBACK_LOOP_BIT_EXT");
        }
        if ((flags & PIPELINE_CREATE_DERIVATIVE) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_DERIVATIVE_BIT");
        }
        if ((flags & PIPELINE_CREATE_DESCRIPTOR_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT");
        }
        if ((flags & PIPELINE_CREATE_DISABLE_OPTIMIZATION) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT");
        }
        if ((flags & PIPELINE_CREATE_DISPATCH_BASE) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_DISPATCH_BASE_BIT");
        }
        if ((flags & PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT");
        }
        if ((flags & PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT");
        }
        if ((flags & PIPELINE_CREATE_INDIRECT_BINDABLE_NV) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV");
        }
        if ((flags & PIPELINE_CREATE_LIBRARY_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_LIBRARY_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_LINK_TIME_OPTIMIZATION_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_LINK_TIME_OPTIMIZATION_BIT_EXT");
        }
        if ((flags & PIPELINE_CREATE_NO_PROTECTED_ACCESS) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT");
        }
        if ((flags & PIPELINE_CREATE_PROTECTED_ACCESS_ONLY) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_NV) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_NV) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_OPACITY_MICROMAP_BIT_EXT");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT");
        }
        if ((flags & PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_KHR) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR");
        }
        if ((flags & PIPELINE_CREATE_RETAIN_LINK_TIME_OPTIMIZATION_INFO_EXT) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT");
        }
        if ((flags & PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX) != 0) {
            detectedFlagBits.add("VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPipelineCreateFlags() {}
}
