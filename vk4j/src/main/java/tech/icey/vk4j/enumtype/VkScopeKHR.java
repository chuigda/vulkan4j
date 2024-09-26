package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkScopeKHR {
    public static final int VK_SCOPE_DEVICE_KHR = 1;
    public static final int VK_SCOPE_WORKGROUP_KHR = 2;
    public static final int VK_SCOPE_SUBGROUP_KHR = 3;
    public static final int VK_SCOPE_QUEUE_FAMILY_KHR = 5;

    public static String explain(@enumtype(VkScopeKHR.class) int value) {
        return switch (value) {
            case VK_SCOPE_DEVICE_KHR -> "VK_SCOPE_DEVICE_KHR";
            case VK_SCOPE_WORKGROUP_KHR -> "VK_SCOPE_WORKGROUP_KHR";
            case VK_SCOPE_SUBGROUP_KHR -> "VK_SCOPE_SUBGROUP_KHR";
            case VK_SCOPE_QUEUE_FAMILY_KHR -> "VK_SCOPE_QUEUE_FAMILY_KHR";
            default -> "Unknown";
        };
    }
}
