package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkInternalAllocationType {
    public static final int VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0;

    public static String explain(@enumtype(VkInternalAllocationType.class) int value) {
        return switch (value) {
            case VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE -> "VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE";
            default -> "Unknown";
        };
    }
}
