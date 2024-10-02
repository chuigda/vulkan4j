package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkAttachmentDescriptionFlags {
    public static final int VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 1;

    public static String explain(@enumtype(VkAttachmentDescriptionFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT");
        }

        return sb.toString();
    }
}
