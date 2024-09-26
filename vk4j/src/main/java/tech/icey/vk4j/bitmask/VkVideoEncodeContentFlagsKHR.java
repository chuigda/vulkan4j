package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkVideoEncodeContentFlagsKHR {
    public static final int VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR = 1;
    public static final int VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR = 2;
    public static final int VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR = 4;

    public static String explain(@enumtype(VkVideoEncodeContentFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR");
        }

        if ((flags & VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR");
        }

        return sb.toString();
    }
}
