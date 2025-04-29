package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitFlags.html">VkSubmitFlags</a>
public final class SubmitFlags {
    public static final int PROTECTED = 0x1;

    public static String explain(@enumtype(SubmitFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PROTECTED) != 0) {
            detectedFlagBits.add("VK_SUBMIT_PROTECTED_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SubmitFlags() {}
}
