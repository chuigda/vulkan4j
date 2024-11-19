package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkAntiLagStageAMD {
    public static final int VK_ANTI_LAG_STAGE_INPUT_AMD = 0;
    public static final int VK_ANTI_LAG_STAGE_PRESENT_AMD = 1;

    public static String explain(@enumtype(VkAntiLagStageAMD.class) int value) {
        return switch (value) {
            case VK_ANTI_LAG_STAGE_INPUT_AMD -> "VK_ANTI_LAG_STAGE_INPUT_AMD";
            case VK_ANTI_LAG_STAGE_PRESENT_AMD -> "VK_ANTI_LAG_STAGE_PRESENT_AMD";
            default -> "Unknown";
        };
    }
}
