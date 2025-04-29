package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFramebufferCreateFlags.html">VkFramebufferCreateFlags</a>
public final class FramebufferCreateFlags {
    public static final int IMAGELESS = 0x1;

    public static String explain(@enumtype(FramebufferCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & IMAGELESS) != 0) {
            detectedFlagBits.add("VK_FRAMEBUFFER_CREATE_IMAGELESS_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FramebufferCreateFlags() {}
}
