package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkOpticalFlowSessionBindingPointNV.html">VkOpticalFlowSessionBindingPointNV</a>
public final class VkOpticalFlowSessionBindingPointNV {
    public static final int UNKNOWN = 0;
    public static final int INPUT = 1;
    public static final int REFERENCE = 2;
    public static final int HINT = 3;
    public static final int FLOW_VECTOR = 4;
    public static final int BACKWARD_FLOW_VECTOR = 5;
    public static final int COST = 6;
    public static final int BACKWARD_COST = 7;
    public static final int GLOBAL_FLOW = 8;

    public static String explain(@enumtype(VkOpticalFlowSessionBindingPointNV.class) int value) {
        return switch (value) {
            case VkOpticalFlowSessionBindingPointNV.BACKWARD_COST -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV";
            case VkOpticalFlowSessionBindingPointNV.BACKWARD_FLOW_VECTOR -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV";
            case VkOpticalFlowSessionBindingPointNV.COST -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV";
            case VkOpticalFlowSessionBindingPointNV.FLOW_VECTOR -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV";
            case VkOpticalFlowSessionBindingPointNV.GLOBAL_FLOW -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV";
            case VkOpticalFlowSessionBindingPointNV.HINT -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV";
            case VkOpticalFlowSessionBindingPointNV.INPUT -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV";
            case VkOpticalFlowSessionBindingPointNV.REFERENCE -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV";
            case VkOpticalFlowSessionBindingPointNV.UNKNOWN -> "VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV";
            default -> "Unknown VkOpticalFlowSessionBindingPointNV: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkOpticalFlowSessionBindingPointNV() {}
}
