package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkExternalMemoryFeatureFlags {
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT = 1;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT = 2;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT = 4;

    public static String explain(@enumtype(VkExternalMemoryFeatureFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT");
        }

        if ((flags & VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT");
        }

        if ((flags & VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT");
        }

        return sb.toString();
    }
}
