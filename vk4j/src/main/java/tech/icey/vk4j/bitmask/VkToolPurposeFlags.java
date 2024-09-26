package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkToolPurposeFlags {
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT = 1;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT = 2;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT = 4;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT = 8;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT = 16;
    public static final int VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT = 32;
    public static final int VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT = 64;

    public static String explain(@enumtype(VkToolPurposeFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_TOOL_PURPOSE_VALIDATION_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_TOOL_PURPOSE_VALIDATION_BIT");
        }

        if ((flags & VK_TOOL_PURPOSE_PROFILING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_TOOL_PURPOSE_PROFILING_BIT");
        }

        if ((flags & VK_TOOL_PURPOSE_TRACING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_TOOL_PURPOSE_TRACING_BIT");
        }

        if ((flags & VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT");
        }

        if ((flags & VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT");
        }

        if ((flags & VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT");
        }

        if ((flags & VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT");
        }

        return sb.toString();
    }
}
