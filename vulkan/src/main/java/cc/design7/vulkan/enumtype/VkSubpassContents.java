package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassContents.html">VkSubpassContents</a>
public final class VkSubpassContents {
    public static final int INLINE = 0;
    public static final int SECONDARY_COMMAND_BUFFERS = 1;
    public static final int INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR = 1000451000;

    public static String explain(@enumtype(VkSubpassContents.class) int value) {
        return switch (value) {
            case VkSubpassContents.INLINE -> "VK_SUBPASS_CONTENTS_INLINE";
            case VkSubpassContents.INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR -> "VK_SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR";
            case VkSubpassContents.SECONDARY_COMMAND_BUFFERS -> "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS";
            default -> "Unknown VkSubpassContents: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkSubpassContents() {}
}
