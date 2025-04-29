package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCacheHeaderVersion.html">VkPipelineCacheHeaderVersion</a>
public final class VkPipelineCacheHeaderVersion {
    public static final int ONE = 0x1;

    public static String explain(@enumtype(VkPipelineCacheHeaderVersion.class) int value) {
        return switch (value) {
            case VkPipelineCacheHeaderVersion.ONE -> "VK_PIPELINE_CACHE_HEADER_VERSION_ONE";
            default -> "Unknown VkPipelineCacheHeaderVersion: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPipelineCacheHeaderVersion() {}
}
