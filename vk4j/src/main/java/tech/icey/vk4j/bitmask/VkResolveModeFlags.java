package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkResolveModeFlags {
    public static final int VK_RESOLVE_MODE_NONE = 0;
    public static final int VK_RESOLVE_MODE_SAMPLE_ZERO_BIT = 1;
    public static final int VK_RESOLVE_MODE_AVERAGE_BIT = 2;
    public static final int VK_RESOLVE_MODE_MIN_BIT = 4;
    public static final int VK_RESOLVE_MODE_MAX_BIT = 8;
    public static final int VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID = 16;

    public static String explain(@enumtype(VkResolveModeFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_RESOLVE_MODE_NONE) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RESOLVE_MODE_NONE");
        }

        if ((flags & VK_RESOLVE_MODE_SAMPLE_ZERO_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RESOLVE_MODE_SAMPLE_ZERO_BIT");
        }

        if ((flags & VK_RESOLVE_MODE_AVERAGE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RESOLVE_MODE_AVERAGE_BIT");
        }

        if ((flags & VK_RESOLVE_MODE_MIN_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RESOLVE_MODE_MIN_BIT");
        }

        if ((flags & VK_RESOLVE_MODE_MAX_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RESOLVE_MODE_MAX_BIT");
        }

        if ((flags & VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RESOLVE_MODE_EXTERNAL_FORMAT_DOWNSAMPLE_ANDROID");
        }

        return sb.toString();
    }
}
