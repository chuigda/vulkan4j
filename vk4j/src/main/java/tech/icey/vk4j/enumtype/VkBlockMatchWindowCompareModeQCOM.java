package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkBlockMatchWindowCompareModeQCOM {
    public static final int VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MIN_QCOM = 0;
    public static final int VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MAX_QCOM = 1;

    public static String explain(@enumtype(VkBlockMatchWindowCompareModeQCOM.class) int value) {
        return switch (value) {
            case VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MIN_QCOM -> "VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MIN_QCOM";
            case VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MAX_QCOM -> "VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MAX_QCOM";
            default -> "Unknown";
        };
    }
}
