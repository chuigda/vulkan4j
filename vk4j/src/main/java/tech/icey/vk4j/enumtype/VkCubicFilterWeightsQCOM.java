package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkCubicFilterWeightsQCOM {
    public static final int VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM = 0;
    public static final int VK_CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM = 1;
    public static final int VK_CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM = 2;
    public static final int VK_CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM = 3;

    public static String explain(@enumtype(VkCubicFilterWeightsQCOM.class) int value) {
        return switch (value) {
            case VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM -> "VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM";
            case VK_CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM -> "VK_CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM";
            case VK_CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM -> "VK_CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM";
            case VK_CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM -> "VK_CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM";
            default -> "Unknown";
        };
    }
}
