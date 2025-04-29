package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentLoadOp.html">VkAttachmentLoadOp</a>
public final class VkAttachmentLoadOp {
    public static final int LOAD = 0;
    public static final int CLEAR = 1;
    public static final int DONT_CARE = 2;
    public static final int NONE = 1000400000;

    public static String explain(@enumtype(VkAttachmentLoadOp.class) int value) {
        return switch (value) {
            case VkAttachmentLoadOp.CLEAR -> "VK_ATTACHMENT_LOAD_OP_CLEAR";
            case VkAttachmentLoadOp.DONT_CARE -> "VK_ATTACHMENT_LOAD_OP_DONT_CARE";
            case VkAttachmentLoadOp.LOAD -> "VK_ATTACHMENT_LOAD_OP_LOAD";
            case VkAttachmentLoadOp.NONE -> "VK_ATTACHMENT_LOAD_OP_NONE";
            default -> "Unknown VkAttachmentLoadOp: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkAttachmentLoadOp() {}
}
