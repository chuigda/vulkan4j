package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkBuildMicromapFlagsEXT {
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT = 1;
    public static final int VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT = 2;
    public static final int VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT = 4;

    public static String explain(@enumtype(VkBuildMicromapFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_MICROMAP_PREFER_FAST_TRACE_BIT_EXT");
        }

        if ((flags & VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_MICROMAP_PREFER_FAST_BUILD_BIT_EXT");
        }

        if ((flags & VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_BUILD_MICROMAP_ALLOW_COMPACTION_BIT_EXT");
        }

        return sb.toString();
    }
}
