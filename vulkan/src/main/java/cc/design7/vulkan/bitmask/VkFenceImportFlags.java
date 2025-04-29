package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFenceImportFlags.html">VkFenceImportFlags</a>
public final class VkFenceImportFlags {
    public static final int FENCE_IMPORT_TEMPORARY = 0x1;

    public static String explain(@enumtype(VkFenceImportFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FENCE_IMPORT_TEMPORARY) != 0) {
            detectedFlagBits.add("VK_FENCE_IMPORT_TEMPORARY_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkFenceImportFlags() {}
}
