package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkImageViewType {
    public static final int VK_IMAGE_VIEW_TYPE_1D = 0;
    public static final int VK_IMAGE_VIEW_TYPE_2D = 1;
    public static final int VK_IMAGE_VIEW_TYPE_3D = 2;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE = 3;
    public static final int VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4;
    public static final int VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5;
    public static final int VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6;

    public static String explain(@enumtype(VkImageViewType.class) int value) {
        return switch (value) {
            case VK_IMAGE_VIEW_TYPE_1D -> "VK_IMAGE_VIEW_TYPE_1D";
            case VK_IMAGE_VIEW_TYPE_2D -> "VK_IMAGE_VIEW_TYPE_2D";
            case VK_IMAGE_VIEW_TYPE_3D -> "VK_IMAGE_VIEW_TYPE_3D";
            case VK_IMAGE_VIEW_TYPE_CUBE -> "VK_IMAGE_VIEW_TYPE_CUBE";
            case VK_IMAGE_VIEW_TYPE_1D_ARRAY -> "VK_IMAGE_VIEW_TYPE_1D_ARRAY";
            case VK_IMAGE_VIEW_TYPE_2D_ARRAY -> "VK_IMAGE_VIEW_TYPE_2D_ARRAY";
            case VK_IMAGE_VIEW_TYPE_CUBE_ARRAY -> "VK_IMAGE_VIEW_TYPE_CUBE_ARRAY";
            default -> "Unknown";
        };
    }
}
