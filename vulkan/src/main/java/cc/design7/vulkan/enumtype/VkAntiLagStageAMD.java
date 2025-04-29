package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAntiLagStageAMD.html">VkAntiLagStageAMD</a>
public final class VkAntiLagStageAMD {
    public static final int INPUT = 0;
    public static final int PRESENT = 1;

    public static String explain(@enumtype(VkAntiLagStageAMD.class) int value) {
        return switch (value) {
            case VkAntiLagStageAMD.INPUT -> "VK_ANTI_LAG_STAGE_INPUT_AMD";
            case VkAntiLagStageAMD.PRESENT -> "VK_ANTI_LAG_STAGE_PRESENT_AMD";
            default -> "Unknown VkAntiLagStageAMD: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkAntiLagStageAMD() {}
}
