package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPipelineBindPoint {
    public static final int VK_PIPELINE_BIND_POINT_GRAPHICS = 0;
    public static final int VK_PIPELINE_BIND_POINT_COMPUTE = 1;
    public static final int VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX = 1000134000;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR = 1000165000;
    public static final int VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI = 1000369003;

    public static String explain(@enumtype(VkPipelineBindPoint.class) int value) {
        return switch (value) {
            case VK_PIPELINE_BIND_POINT_GRAPHICS -> "VK_PIPELINE_BIND_POINT_GRAPHICS";
            case VK_PIPELINE_BIND_POINT_COMPUTE -> "VK_PIPELINE_BIND_POINT_COMPUTE";
            case VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX -> "VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX";
            case VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR -> "VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR";
            case VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI -> "VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI";
            default -> "Unknown";
        };
    }
}
