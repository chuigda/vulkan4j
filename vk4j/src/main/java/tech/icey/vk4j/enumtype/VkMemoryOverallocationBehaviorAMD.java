package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkMemoryOverallocationBehaviorAMD {
    public static final int VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD = 0;
    public static final int VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD = 1;
    public static final int VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD = 2;

    public static String explain(@enumtype(VkMemoryOverallocationBehaviorAMD.class) int value) {
        return switch (value) {
            case VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD -> "VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD";
            case VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD -> "VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD";
            case VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD -> "VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD";
            default -> "Unknown";
        };
    }
}
