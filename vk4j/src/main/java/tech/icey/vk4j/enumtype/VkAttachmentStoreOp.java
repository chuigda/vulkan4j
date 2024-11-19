package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkAttachmentStoreOp {
    public static final int VK_ATTACHMENT_STORE_OP_STORE = 0;
    public static final int VK_ATTACHMENT_STORE_OP_DONT_CARE = 1;
    public static final int VK_ATTACHMENT_STORE_OP_NONE = 1000301000;

    public static String explain(@enumtype(VkAttachmentStoreOp.class) int value) {
        return switch (value) {
            case VK_ATTACHMENT_STORE_OP_STORE -> "VK_ATTACHMENT_STORE_OP_STORE";
            case VK_ATTACHMENT_STORE_OP_DONT_CARE -> "VK_ATTACHMENT_STORE_OP_DONT_CARE";
            case VK_ATTACHMENT_STORE_OP_NONE -> "VK_ATTACHMENT_STORE_OP_NONE";
            default -> "Unknown";
        };
    }
}
