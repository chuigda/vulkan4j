package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFrameBoundaryFlagsEXT.html">VkFrameBoundaryFlagsEXT</a>
public final class VkFrameBoundaryFlagsEXT {
    public static final int FRAME_END = 0x1;

    public static String explain(@enumtype(VkFrameBoundaryFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FRAME_END) != 0) {
            detectedFlagBits.add("VK_FRAME_BOUNDARY_FRAME_END_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkFrameBoundaryFlagsEXT() {}
}
