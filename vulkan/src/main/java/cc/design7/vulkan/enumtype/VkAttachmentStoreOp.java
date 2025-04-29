package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentStoreOp.html">VkAttachmentStoreOp</a>
public final class VkAttachmentStoreOp {
    public static final int STORE = 0;
    public static final int DONT_CARE = 1;
    public static final int NONE = 1000301000;

    public static String explain(@enumtype(VkAttachmentStoreOp.class) int value) {
        return switch (value) {
            case VkAttachmentStoreOp.DONT_CARE -> "VK_ATTACHMENT_STORE_OP_DONT_CARE";
            case VkAttachmentStoreOp.NONE -> "VK_ATTACHMENT_STORE_OP_NONE";
            case VkAttachmentStoreOp.STORE -> "VK_ATTACHMENT_STORE_OP_STORE";
            default -> "Unknown VkAttachmentStoreOp: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkAttachmentStoreOp() {}
}
