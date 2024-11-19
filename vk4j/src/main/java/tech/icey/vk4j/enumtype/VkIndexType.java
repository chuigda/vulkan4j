package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkIndexType {
    public static final int VK_INDEX_TYPE_UINT16 = 0;
    public static final int VK_INDEX_TYPE_UINT32 = 1;
    public static final int VK_INDEX_TYPE_NONE_KHR = 1000165000;
    public static final int VK_INDEX_TYPE_UINT8_KHR = 1000265000;

    public static String explain(@enumtype(VkIndexType.class) int value) {
        return switch (value) {
            case VK_INDEX_TYPE_UINT16 -> "VK_INDEX_TYPE_UINT16";
            case VK_INDEX_TYPE_UINT32 -> "VK_INDEX_TYPE_UINT32";
            case VK_INDEX_TYPE_NONE_KHR -> "VK_INDEX_TYPE_NONE_KHR";
            case VK_INDEX_TYPE_UINT8_KHR -> "VK_INDEX_TYPE_UINT8_KHR";
            default -> "Unknown";
        };
    }
}
