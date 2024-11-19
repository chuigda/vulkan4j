package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkChromaLocation {
    public static final int VK_CHROMA_LOCATION_COSITED_EVEN = 0;
    public static final int VK_CHROMA_LOCATION_MIDPOINT = 1;

    public static String explain(@enumtype(VkChromaLocation.class) int value) {
        return switch (value) {
            case VK_CHROMA_LOCATION_COSITED_EVEN -> "VK_CHROMA_LOCATION_COSITED_EVEN";
            case VK_CHROMA_LOCATION_MIDPOINT -> "VK_CHROMA_LOCATION_MIDPOINT";
            default -> "Unknown";
        };
    }
}
