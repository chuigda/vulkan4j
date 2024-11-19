package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkVideoChromaSubsamplingFlagsKHR {
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR = 0;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR = 1;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR = 2;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR = 4;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR = 8;

    public static String explain(@enumtype(VkVideoChromaSubsamplingFlagsKHR.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR");
        }

        if ((flags & VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR");
        }

        if ((flags & VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR");
        }

        return sb.toString();
    }
}
