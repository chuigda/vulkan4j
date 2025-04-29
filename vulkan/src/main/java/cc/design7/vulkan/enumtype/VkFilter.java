package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFilter.html">VkFilter</a>
public final class VkFilter {
    public static final int NEAREST = 0x0;
    public static final int LINEAR = 0x1;
    public static final int CUBIC_EXT = 0x3b9b0498;

    public static String explain(@enumtype(VkFilter.class) int value) {
        return switch (value) {
            case VkFilter.CUBIC_EXT -> "VK_FILTER_CUBIC_EXT";
            case VkFilter.LINEAR -> "VK_FILTER_LINEAR";
            case VkFilter.NEAREST -> "VK_FILTER_NEAREST";
            default -> "Unknown VkFilter: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkFilter() {}
}
