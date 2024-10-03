package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkImageType {
    public static final int VK_IMAGE_TYPE_1D = 0;
    public static final int VK_IMAGE_TYPE_2D = 1;
    public static final int VK_IMAGE_TYPE_3D = 2;

    public static String explain(@enumtype(VkImageType.class) int value) {
        return switch (value) {
            case VK_IMAGE_TYPE_1D -> "VK_IMAGE_TYPE_1D";
            case VK_IMAGE_TYPE_2D -> "VK_IMAGE_TYPE_2D";
            case VK_IMAGE_TYPE_3D -> "VK_IMAGE_TYPE_3D";
            default -> "Unknown";
        };
    }
}
