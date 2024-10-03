package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkSharingMode {
    public static final int VK_SHARING_MODE_EXCLUSIVE = 0;
    public static final int VK_SHARING_MODE_CONCURRENT = 1;

    public static String explain(@enumtype(VkSharingMode.class) int value) {
        return switch (value) {
            case VK_SHARING_MODE_EXCLUSIVE -> "VK_SHARING_MODE_EXCLUSIVE";
            case VK_SHARING_MODE_CONCURRENT -> "VK_SHARING_MODE_CONCURRENT";
            default -> "Unknown";
        };
    }
}
