package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkHostImageCopyFlags.html">VkHostImageCopyFlags</a>
public final class VkHostImageCopyFlags {
    public static final int HOST_IMAGE_COPY_MEMCPY = 0x1;

    public static String explain(@enumtype(VkHostImageCopyFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & HOST_IMAGE_COPY_MEMCPY) != 0) {
            detectedFlagBits.add("VK_HOST_IMAGE_COPY_MEMCPY");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkHostImageCopyFlags() {}
}
