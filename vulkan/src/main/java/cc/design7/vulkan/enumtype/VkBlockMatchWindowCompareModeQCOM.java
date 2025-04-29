package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBlockMatchWindowCompareModeQCOM.html">VkBlockMatchWindowCompareModeQCOM</a>
public final class VkBlockMatchWindowCompareModeQCOM {
    public static final int MIN = 0x0;
    public static final int MAX = 0x1;

    public static String explain(@enumtype(VkBlockMatchWindowCompareModeQCOM.class) int value) {
        return switch (value) {
            case VkBlockMatchWindowCompareModeQCOM.MAX -> "VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MAX_QCOM";
            case VkBlockMatchWindowCompareModeQCOM.MIN -> "VK_BLOCK_MATCH_WINDOW_COMPARE_MODE_MIN_QCOM";
            default -> "Unknown VkBlockMatchWindowCompareModeQCOM: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkBlockMatchWindowCompareModeQCOM() {}
}
