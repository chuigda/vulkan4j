package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBindPoint.html">VkPipelineBindPoint</a>
public final class VkPipelineBindPoint {
    public static final int GRAPHICS = 0;
    public static final int COMPUTE = 1;
    public static final int EXECUTION_GRAPH_AMDX = 1000134000;
    public static final int RAY_TRACING_KHR = 1000165000;
    public static final int SUBPASS_SHADING_HUAWEI = 1000369003;

    public static String explain(@enumtype(VkPipelineBindPoint.class) int value) {
        return switch (value) {
            case VkPipelineBindPoint.COMPUTE -> "VK_PIPELINE_BIND_POINT_COMPUTE";
            case VkPipelineBindPoint.EXECUTION_GRAPH_AMDX -> "VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX";
            case VkPipelineBindPoint.GRAPHICS -> "VK_PIPELINE_BIND_POINT_GRAPHICS";
            case VkPipelineBindPoint.RAY_TRACING_KHR -> "VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR";
            case VkPipelineBindPoint.SUBPASS_SHADING_HUAWEI -> "VK_PIPELINE_BIND_POINT_SUBPASS_SHADING_HUAWEI";
            default -> "Unknown VkPipelineBindPoint: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPipelineBindPoint() {}
}
