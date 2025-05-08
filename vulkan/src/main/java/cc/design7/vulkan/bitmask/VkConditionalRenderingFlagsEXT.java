package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkConditionalRenderingFlagsEXT.html">VkConditionalRenderingFlagsEXT</a>
public final class VkConditionalRenderingFlagsEXT {
    public static final int INVERTED = 0x1;

    public static String explain(@enumtype(VkConditionalRenderingFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & INVERTED) != 0) {
            detectedFlagBits.add("VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkConditionalRenderingFlagsEXT() {}
}
