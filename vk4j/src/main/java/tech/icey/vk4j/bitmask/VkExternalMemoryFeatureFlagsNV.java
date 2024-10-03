package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkExternalMemoryFeatureFlagsNV {
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 1;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = 2;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = 4;

    public static String explain(@enumtype(VkExternalMemoryFeatureFlagsNV.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV");
        }

        if ((flags & VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV");
        }

        if ((flags & VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV");
        }

        return sb.toString();
    }
}
