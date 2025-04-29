package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAntiLagModeAMD.html">VkAntiLagModeAMD</a>
public final class VkAntiLagModeAMD {
    public static final int DRIVER_CONTROL = 0x0;
    public static final int ON = 0x1;
    public static final int OFF = 0x2;

    public static String explain(@enumtype(VkAntiLagModeAMD.class) int value) {
        return switch (value) {
            case VkAntiLagModeAMD.DRIVER_CONTROL -> "VK_ANTI_LAG_MODE_DRIVER_CONTROL_AMD";
            case VkAntiLagModeAMD.OFF -> "VK_ANTI_LAG_MODE_OFF_AMD";
            case VkAntiLagModeAMD.ON -> "VK_ANTI_LAG_MODE_ON_AMD";
            default -> "Unknown VkAntiLagModeAMD: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkAntiLagModeAMD() {}
}
