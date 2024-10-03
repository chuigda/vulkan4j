package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkPipelineCacheHeaderVersion {
    public static final int VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1;

    public static String explain(@enumtype(VkPipelineCacheHeaderVersion.class) int value) {
        return switch (value) {
            case VK_PIPELINE_CACHE_HEADER_VERSION_ONE -> "VK_PIPELINE_CACHE_HEADER_VERSION_ONE";
            default -> "Unknown";
        };
    }
}
