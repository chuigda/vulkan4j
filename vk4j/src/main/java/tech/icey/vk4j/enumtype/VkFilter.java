package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkFilter {
    public static final int VK_FILTER_NEAREST = 0;
    public static final int VK_FILTER_LINEAR = 1;
    public static final int VK_FILTER_CUBIC_EXT = 1000015000;

    public static String explain(@enumtype(VkFilter.class) int value) {
        return switch (value) {
            case VK_FILTER_NEAREST -> "VK_FILTER_NEAREST";
            case VK_FILTER_LINEAR -> "VK_FILTER_LINEAR";
            case VK_FILTER_CUBIC_EXT -> "VK_FILTER_CUBIC_EXT";
            default -> "Unknown";
        };
    }
}
