package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkColorComponentFlags.html">VkColorComponentFlags</a>
public final class VkColorComponentFlags {
    public static final int COLOR_COMPONENT_A = 0x8;
    public static final int COLOR_COMPONENT_B = 0x4;
    public static final int COLOR_COMPONENT_G = 0x2;
    public static final int COLOR_COMPONENT_R = 0x1;

    public static String explain(@enumtype(VkColorComponentFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COLOR_COMPONENT_A) != 0) {
            detectedFlagBits.add("VK_COLOR_COMPONENT_A_BIT");
        }
        if ((flags & COLOR_COMPONENT_B) != 0) {
            detectedFlagBits.add("VK_COLOR_COMPONENT_B_BIT");
        }
        if ((flags & COLOR_COMPONENT_G) != 0) {
            detectedFlagBits.add("VK_COLOR_COMPONENT_G_BIT");
        }
        if ((flags & COLOR_COMPONENT_R) != 0) {
            detectedFlagBits.add("VK_COLOR_COMPONENT_R_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkColorComponentFlags() {}
}
