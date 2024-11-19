package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkAttachmentLoadOp {
    public static final int VK_ATTACHMENT_LOAD_OP_LOAD = 0;
    public static final int VK_ATTACHMENT_LOAD_OP_CLEAR = 1;
    public static final int VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2;
    public static final int VK_ATTACHMENT_LOAD_OP_NONE_KHR = 1000400000;

    public static String explain(@enumtype(VkAttachmentLoadOp.class) int value) {
        return switch (value) {
            case VK_ATTACHMENT_LOAD_OP_LOAD -> "VK_ATTACHMENT_LOAD_OP_LOAD";
            case VK_ATTACHMENT_LOAD_OP_CLEAR -> "VK_ATTACHMENT_LOAD_OP_CLEAR";
            case VK_ATTACHMENT_LOAD_OP_DONT_CARE -> "VK_ATTACHMENT_LOAD_OP_DONT_CARE";
            case VK_ATTACHMENT_LOAD_OP_NONE_KHR -> "VK_ATTACHMENT_LOAD_OP_NONE_KHR";
            default -> "Unknown";
        };
    }
}
