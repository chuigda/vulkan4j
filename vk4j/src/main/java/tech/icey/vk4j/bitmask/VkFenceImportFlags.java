package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkFenceImportFlags {
    public static final int VK_FENCE_IMPORT_TEMPORARY_BIT = 1;

    public static String explain(@enumtype(VkFenceImportFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_FENCE_IMPORT_TEMPORARY_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_FENCE_IMPORT_TEMPORARY_BIT");
        }

        return sb.toString();
    }
}
