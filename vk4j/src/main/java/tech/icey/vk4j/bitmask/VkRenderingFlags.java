package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkRenderingFlags {
    public static final int VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT = 1;
    public static final int VK_RENDERING_SUSPENDING_BIT = 2;
    public static final int VK_RENDERING_RESUMING_BIT = 4;
    public static final int VK_RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT = 8;
    public static final int VK_RENDERING_CONTENTS_INLINE_BIT_KHR = 16;

    public static String explain(@enumtype(VkRenderingFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RENDERING_CONTENTS_SECONDARY_COMMAND_BUFFERS_BIT");
        }

        if ((flags & VK_RENDERING_SUSPENDING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RENDERING_SUSPENDING_BIT");
        }

        if ((flags & VK_RENDERING_RESUMING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RENDERING_RESUMING_BIT");
        }

        if ((flags & VK_RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RENDERING_ENABLE_LEGACY_DITHERING_BIT_EXT");
        }

        if ((flags & VK_RENDERING_CONTENTS_INLINE_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_RENDERING_CONTENTS_INLINE_BIT_KHR");
        }

        return sb.toString();
    }
}
