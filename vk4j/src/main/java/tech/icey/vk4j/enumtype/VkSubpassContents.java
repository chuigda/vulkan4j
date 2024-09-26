package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSubpassContents {
    public static final int VK_SUBPASS_CONTENTS_INLINE = 0;
    public static final int VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1;
    public static final int VK_SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR = 1000451000;

    public static String explain(@enumtype(VkSubpassContents.class) int value) {
        return switch (value) {
            case VK_SUBPASS_CONTENTS_INLINE -> "VK_SUBPASS_CONTENTS_INLINE";
            case VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS -> "VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS";
            case VK_SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR -> "VK_SUBPASS_CONTENTS_INLINE_AND_SECONDARY_COMMAND_BUFFERS_KHR";
            default -> "Unknown";
        };
    }
}
