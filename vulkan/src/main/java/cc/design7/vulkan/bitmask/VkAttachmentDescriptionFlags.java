package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentDescriptionFlags.html"><code>VkAttachmentDescriptionFlags</code></a>
public final class VkAttachmentDescriptionFlags {
    public static final int MAY_ALIAS = 0x1;

    public static String explain(@enumtype(VkAttachmentDescriptionFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & MAY_ALIAS) != 0) {
            detectedFlagBits.add("VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkAttachmentDescriptionFlags() {}
}
