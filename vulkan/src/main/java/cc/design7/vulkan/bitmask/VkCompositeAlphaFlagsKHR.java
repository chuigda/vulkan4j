package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCompositeAlphaFlagsKHR.html">VkCompositeAlphaFlagsKHR</a>
public final class VkCompositeAlphaFlagsKHR {
    public static final int COMPOSITE_ALPHA_INHERIT = 0x8;
    public static final int COMPOSITE_ALPHA_OPAQUE = 0x1;
    public static final int COMPOSITE_ALPHA_POST_MULTIPLIED = 0x4;
    public static final int COMPOSITE_ALPHA_PRE_MULTIPLIED = 0x2;

    public static String explain(@enumtype(VkCompositeAlphaFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COMPOSITE_ALPHA_INHERIT) != 0) {
            detectedFlagBits.add("VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR");
        }
        if ((flags & COMPOSITE_ALPHA_OPAQUE) != 0) {
            detectedFlagBits.add("VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR");
        }
        if ((flags & COMPOSITE_ALPHA_POST_MULTIPLIED) != 0) {
            detectedFlagBits.add("VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR");
        }
        if ((flags & COMPOSITE_ALPHA_PRE_MULTIPLIED) != 0) {
            detectedFlagBits.add("VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkCompositeAlphaFlagsKHR() {}
}
