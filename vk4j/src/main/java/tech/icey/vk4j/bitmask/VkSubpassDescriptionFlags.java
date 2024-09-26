package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkSubpassDescriptionFlags {
    public static final int VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX = 1;
    public static final int VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX = 2;
    public static final int VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM = 4;
    public static final int VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM = 8;
    public static final int VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_EXT = 16;
    public static final int VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_EXT = 32;
    public static final int VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_EXT = 64;
    public static final int VK_SUBPASS_DESCRIPTION_ENABLE_LEGACY_DITHERING_BIT_EXT = 128;

    public static String explain(@enumtype(VkSubpassDescriptionFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX");
        }

        if ((flags & VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX");
        }

        if ((flags & VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_FRAGMENT_REGION_BIT_QCOM");
        }

        if ((flags & VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_SHADER_RESOLVE_BIT_QCOM");
        }

        if ((flags & VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_COLOR_ACCESS_BIT_EXT");
        }

        if ((flags & VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_DEPTH_ACCESS_BIT_EXT");
        }

        if ((flags & VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_RASTERIZATION_ORDER_ATTACHMENT_STENCIL_ACCESS_BIT_EXT");
        }

        if ((flags & VK_SUBPASS_DESCRIPTION_ENABLE_LEGACY_DITHERING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SUBPASS_DESCRIPTION_ENABLE_LEGACY_DITHERING_BIT_EXT");
        }

        return sb.toString();
    }
}
