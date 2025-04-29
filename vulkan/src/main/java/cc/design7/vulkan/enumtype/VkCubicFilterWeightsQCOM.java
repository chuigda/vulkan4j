package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCubicFilterWeightsQCOM.html">VkCubicFilterWeightsQCOM</a>
public final class VkCubicFilterWeightsQCOM {
    public static final int CATMULL_ROM = 0;
    public static final int ZERO_TANGENT_CARDINAL = 1;
    public static final int B_SPLINE = 2;
    public static final int MITCHELL_NETRAVALI = 3;

    public static String explain(@enumtype(VkCubicFilterWeightsQCOM.class) int value) {
        return switch (value) {
            case VkCubicFilterWeightsQCOM.B_SPLINE -> "VK_CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM";
            case VkCubicFilterWeightsQCOM.CATMULL_ROM -> "VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM";
            case VkCubicFilterWeightsQCOM.MITCHELL_NETRAVALI -> "VK_CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM";
            case VkCubicFilterWeightsQCOM.ZERO_TANGENT_CARDINAL -> "VK_CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM";
            default -> "Unknown VkCubicFilterWeightsQCOM: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkCubicFilterWeightsQCOM() {}
}
