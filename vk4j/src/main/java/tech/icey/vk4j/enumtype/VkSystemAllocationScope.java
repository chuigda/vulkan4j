package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkSystemAllocationScope {
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3;
    public static final int VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4;

    public static String explain(@enumtype(VkSystemAllocationScope.class) int value) {
        return switch (value) {
            case VK_SYSTEM_ALLOCATION_SCOPE_COMMAND -> "VK_SYSTEM_ALLOCATION_SCOPE_COMMAND";
            case VK_SYSTEM_ALLOCATION_SCOPE_OBJECT -> "VK_SYSTEM_ALLOCATION_SCOPE_OBJECT";
            case VK_SYSTEM_ALLOCATION_SCOPE_CACHE -> "VK_SYSTEM_ALLOCATION_SCOPE_CACHE";
            case VK_SYSTEM_ALLOCATION_SCOPE_DEVICE -> "VK_SYSTEM_ALLOCATION_SCOPE_DEVICE";
            case VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE -> "VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE";
            default -> "Unknown";
        };
    }
}
