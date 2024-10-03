package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkExternalFenceFeatureFlags {
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT = 1;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT = 2;

    public static String explain(@enumtype(VkExternalFenceFeatureFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT");
        }

        if ((flags & VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT");
        }

        return sb.toString();
    }
}
