package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkRenderPassCreateFlags {
    public static final int VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM = 2;

    public static String explain(@enumtype(VkRenderPassCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM");
        }

        return sb.toString();
    }
}
