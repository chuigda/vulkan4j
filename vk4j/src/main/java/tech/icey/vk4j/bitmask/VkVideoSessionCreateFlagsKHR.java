package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoSessionCreateFlagsKHR {
    public static final int VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR = 1;
    public static final int VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR = 2;
    public static final int VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR = 4;

    public static String explain(@enumtype(VkVideoSessionCreateFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR");
        }

        if ((flags & VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR");
        }

        if ((flags & VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR");
        }

        return sb.toString();
    }
}
